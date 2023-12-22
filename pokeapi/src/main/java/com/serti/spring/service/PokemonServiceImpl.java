package com.serti.spring.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serti.spring.dao.PokemonDAO;
import com.serti.spring.model.Pokemon;

@Service
public class PokemonServiceImpl implements PokemonService {

	@Autowired
	private PokemonDAO pokemonDAO;
	
	@Override
	@Transactional
	public Pokemon get(long id) {
		return pokemonDAO.get(id);
	}

}
