package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Item;

public interface ItemRepository extends JpaRepository<Item,Integer> {
}
