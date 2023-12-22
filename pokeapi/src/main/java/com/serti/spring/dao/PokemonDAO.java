package com.serti.spring.dao;

import com.serti.spring.model.Pokemon;

public interface PokemonDAO {
	//Get a single row
	Pokemon get(long id);
}
