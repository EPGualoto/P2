package com.uce.edu.repository;

import com.uce.edu.modelo.Doctor;

public interface IDoctorRepository {
	//CRUD
	public void insertar(Doctor doctor);
		
	public void actualizar(Doctor doctor);
		
	public Doctor seleccionar(Integer id);
		
	public void eliminar(Integer id);
}
