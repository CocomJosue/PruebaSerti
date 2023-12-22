package com.serti.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.serti.spring.model.Pokemon;
import com.serti.spring.service.PokemonService;

@RestController
public class PokemonController {
	
	@Autowired
	private PokemonService pokemonService;
	
	//Get a single row
	@GetMapping("api/pokemon/{id}")
	public ResponseEntity<Pokemon> get(@PathVariable("id") long id){
		
		Pokemon pokemon = pokemonService.get(id);
		return ResponseEntity.ok().body(pokemon);
	}
}
