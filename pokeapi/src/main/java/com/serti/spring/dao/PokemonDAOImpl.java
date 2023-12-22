package com.serti.spring.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.serti.spring.model.Pokemon;

@Repository
public class PokemonDAOImpl implements PokemonDAO{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public Pokemon get(long id) {
		return sessionFactory.getCurrentSession().get(Pokemon.class, id);
	}

}
