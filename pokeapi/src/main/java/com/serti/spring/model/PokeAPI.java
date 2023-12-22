package com.serti.spring.model;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
public class PokeAPI {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdPokeAPI;
	private String Url;
	private String UsuarioCrea;
	private LocalDate FechaCrea;
	private String UsuarioEdita;
	private LocalDate FechaEdita;
	
	@ManyToOne
	@JoinColumn(name = "PokemonId")
	private Pokemon pokemon;

	//getters and setters
	public Long getIdPokeAPI() {
		return IdPokeAPI;
	}

	public void setIdPokeAPI(Long idPokeAPI) {
		IdPokeAPI = idPokeAPI;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	public String getUsuarioCrea() {
		return UsuarioCrea;
	}

	public void setUsuarioCrea(String usuarioCrea) {
		UsuarioCrea = usuarioCrea;
	}

	public LocalDate getFechaCrea() {
		return FechaCrea;
	}

	public void setFechaCrea(LocalDate fechaCrea) {
		FechaCrea = fechaCrea;
	}

	public String getUsuarioEdita() {
		return UsuarioEdita;
	}

	public void setUsuarioEdita(String usuarioEdita) {
		UsuarioEdita = usuarioEdita;
	}

	public LocalDate getFechaEdita() {
		return FechaEdita;
	}

	public void setFechaEdita(LocalDate fechaEdita) {
		FechaEdita = fechaEdita;
	}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

	@Override
	public String toString() {
		return "PokeAPI [IdPokeAPI=" + IdPokeAPI + ", Url=" + Url + ", UsuarioCrea=" + UsuarioCrea + ", FechaCrea="
				+ FechaCrea + ", UsuarioEdita=" + UsuarioEdita + ", FechaEdita=" + FechaEdita + ", pokemon=" + pokemon
				+ "]";
	}
}
