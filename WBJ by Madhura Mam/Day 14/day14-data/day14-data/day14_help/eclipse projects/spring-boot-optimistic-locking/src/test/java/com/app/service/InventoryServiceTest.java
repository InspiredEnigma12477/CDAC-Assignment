package com.app.service;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import com.app.entities.Item;
import com.app.repository.ItemRepository;

@SpringBootTest
class InventoryServiceTest {

	@Autowired
	private InventoryService inventoryService;

	@Autowired
	private ItemRepository itemRepository;

	@SpyBean
	private ItemService itemService;

	private final List<Integer> itemAmounts = Arrays.asList(10, 5);

	@Test
	void testIncrementItemAmount_withoutConcurrency() {
		// given
		final Item srcItem = itemRepository.save(new Item());
		

		// when
		for (final int amount : itemAmounts) {
			inventoryService.incrementProductAmount(srcItem.getId(), amount);
		}

		// then
		final Item item = itemRepository.findById(srcItem.getId())
				.orElseThrow(() -> new IllegalArgumentException("No item found!"));

		assertAll(
				// () -> assertEquals(2, item.getVersion()),
				() -> assertEquals(15, item.getAmount()),
		 () -> verify(itemService, times(2)).incrementAmount(anyInt(), anyInt())
		);
	}

	@Test
	void testIncrementItemAmount_withConcurrency() throws InterruptedException {
		// given
		final Item srcItem = itemRepository.save(new Item());
		

		// when
		final ExecutorService executor = Executors.newFixedThreadPool(itemAmounts.size());

		for (final int amount : itemAmounts) {
			executor.execute(() -> {
				inventoryService.incrementProductAmount(srcItem.getId(), amount);
				System.out.println("invoked by " + Thread.currentThread()+" amount "+amount);
			});
		}

		executor.shutdown();
		assertTrue(executor.awaitTermination(1, TimeUnit.MINUTES));

		// then
		final Item item = itemRepository.findById(srcItem.getId())
				.orElseThrow(() -> new IllegalArgumentException("No item found!"));

		assertAll(
				// () -> assertEquals(2, item.getVersion()),
				() -> assertEquals(15, item.getAmount()));
			//	() -> verify(itemService, times(2)).incrementAmount(anyInt(), anyInt()));
	}
}
