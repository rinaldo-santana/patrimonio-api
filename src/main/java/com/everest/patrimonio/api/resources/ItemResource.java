package com.everest.patrimonio.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everest.patrimonio.api.model.Item;
import com.everest.patrimonio.api.repository.ItemRepository;

@RestController
@RequestMapping("/Items")
public class ItemResource {
	
	@Autowired
	private ItemRepository itemRepository;	
	
	@GetMapping
	public List<Item> listar() {
		return itemRepository.findAll();
	}
	
	@GetMapping
	@RequestMapping("/{id}")
	public Item buscarPorId(@PathVariable Long id) {
		return itemRepository.findOne(id);
	}
	
	@PutMapping
	public void adicionar(Item item){
		itemRepository.save(item);
	}
	
}


