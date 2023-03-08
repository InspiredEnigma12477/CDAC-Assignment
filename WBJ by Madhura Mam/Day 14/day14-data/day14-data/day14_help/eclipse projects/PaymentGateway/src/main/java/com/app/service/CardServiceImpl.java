package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.InvalidCardDetailsException;
import com.app.custom_exception.ResourceNotFoundException;
import com.app.dto.CardDto;
import com.app.entities.Card;
import com.app.repository.CardRepository;

@Service
@Transactional
public class CardServiceImpl implements CardService {
	@Autowired
	private CardRepository cardRepo;

	@Override
	public boolean verifyCardDetails(CardDto cardDto) {
		Card card = cardRepo.findById(cardDto.getCardNo())
				.orElseThrow(() -> new ResourceNotFoundException("Invalid Card No !!!"));
		// => card no is valid , verify exp date n cvv
		if (cardDto.getExpiryDate().isEqual(card.getExpiryDate()) && cardDto.getCvv().equals(card.getCvv())
				&& cardDto.getAmount() < card.getBalance()) {
			// card verified , update card balance
			card.setBalance(card.getBalance() - cardDto.getAmount());
			return true;
		}
		throw new InvalidCardDetailsException("Invalid daete or cvv or insufficient balance!!!!");
	}

}
