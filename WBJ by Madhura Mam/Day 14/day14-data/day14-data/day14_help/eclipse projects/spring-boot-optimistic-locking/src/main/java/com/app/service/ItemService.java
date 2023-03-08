package com.app.service;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.Item;
import com.app.repository.ItemRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ItemService {

	private final ItemRepository itemRepository;// impl ctor based D.I achieved via parameterized ctor generate thanks
												// to @RequiredArgsConstructor

	@Transactional( propagation = Propagation.REQUIRES_NEW)
	public void incrementAmount(int id, int amount) {
		Item item = itemRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
		item.setAmount(item.getAmount() + amount);
	}

}
