package com.uce.edu.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.modelo.Paciente;

public interface IPacienteRepository {
	//CRUD
	public void insertar(Paciente paciente);
	
	public void actualizar(Paciente paciente);
	
	public Paciente seleccionar(Integer id);
	
	public void eliminar(Integer id);
	
	/*public Libro seleccionarPorNombre(String nombre);
	
	public List <Libro> seleccionarPorFechaPublicacion(LocalDateTime fechaPublicacion);*/

}
