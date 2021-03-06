package com.biblioteca.ApiBiblioteca.Service;

import java.util.List;

import com.biblioteca.ApiBiblioteca.Entity.Autor;
import com.biblioteca.ApiBiblioteca.Entity.Libro;

public interface AutorService {

	public List<Autor> findAll();
	
	public List<Libro> findAllBookUser(String autor);
	
	public Autor findById(int id);
	public Autor findByName(String name);
	public Libro findByNameLibro(String name);
	
	public void save(Autor autor);
	public void save(Libro libro);
	
	public void deleteById(int id);
	public void deleteLibroById(String titulo, int id);
}
