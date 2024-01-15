package com.uce.edu.service;

import com.uce.edu.modelo.Paciente;

public interface IPacienteService {
	// CRUD
	public void guardar(Paciente paciente);

	public void actualizar(Paciente paciente);

	public Paciente buscar(Integer id);

	public void eliminar(Integer id);
	
/*public Libro buscarPorNombre(String nombre);
	
	public List <Libro> buscarPorfecha(LocalDateTime fecha);*/
}
