package com.serti.spring.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity(name= "Tipo")
public class Tipo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdTipo;
	private String Nombre;
	private String UsuarioCrea;
	private LocalDate FechaCrea;
	private String UsuarioEdita;
	private LocalDate FechaEdita;
	
	@ManyToMany(mappedBy = "Tipo")
	private Set<Pokemon> pokemons = new HashSet<>();
	
	//getters and setters
	public Long getIdTipo() {
		return IdTipo;
	}
	public void setIdTipo(Long idTipo) {
		IdTipo = idTipo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
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
	public Set<Pokemon> getPokemons() {
		return pokemons;
	}
	public void setPokemons(Set<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}
	@Override
	public String toString() {
		return "Tipo [IdTipo=" + IdTipo + ", Nombre=" + Nombre + ", UsuarioCrea=" + UsuarioCrea + ", FechaCrea="
				+ FechaCrea + ", UsuarioEdita=" + UsuarioEdita + ", FechaEdita=" + FechaEdita + ", pokemons=" + pokemons
				+ "]";
	}	
}
