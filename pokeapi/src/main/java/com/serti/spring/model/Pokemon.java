package com.serti.spring.model;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "Pokemon")
public class Pokemon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdPokemon;
	private String Nombre;
	private int tamanio;
	private int peso;
	private String UsuarioCrea;
	private LocalDate FechaCrea;
	private String UsuarioEdita;
	private LocalDate FechaEdita;
	
	@ManyToMany
	@JoinTable(
		name = "PokemonTipo",
		joinColumns = @JoinColumn(name = "PokemonId"),
		inverseJoinColumns = @JoinColumn(name = "TipoId")
	)
	private Set<Tipo> tipos = new HashSet<>();
	
	@OneToMany(mappedBy = "Pokemon", cascade = CascadeType.ALL)
	private List<PokeAPI> pokeAPIs;

	//getters and setters
	public Long getIdPokemon() {
		return IdPokemon;
	}

	public void setIdPokemon(Long idPokemon) {
		IdPokemon = idPokemon;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
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

	public Set<Tipo> getTipos() {
		return tipos;
	}

	public void setTipos(Set<Tipo> tipos) {
		this.tipos = tipos;
	}

	public List<PokeAPI> getPokeAPIs() {
		return pokeAPIs;
	}

	public void setPokeAPIs(List<PokeAPI> pokeAPIs) {
		this.pokeAPIs = pokeAPIs;
	}

	@Override
	public String toString() {
		return "Pokemon [IdPokemon=" + IdPokemon + ", Nombre=" + Nombre + ", tamanio=" + tamanio + ", peso=" + peso
				+ ", UsuarioCrea=" + UsuarioCrea + ", FechaCrea=" + FechaCrea + ", UsuarioEdita=" + UsuarioEdita
				+ ", FechaEdita=" + FechaEdita + ", tipos=" + tipos + ", pokeAPIs=" + pokeAPIs + "]";
	}
}
