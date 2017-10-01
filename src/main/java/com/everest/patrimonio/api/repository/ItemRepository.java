package com.everest.patrimonio.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everest.patrimonio.api.model.Item;


public interface ItemRepository extends JpaRepository<Item, Long> {

}
