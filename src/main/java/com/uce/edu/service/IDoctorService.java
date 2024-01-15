package com.uce.edu.service;

import com.uce.edu.modelo.Doctor;

public interface IDoctorService {
	//CRUD
	public void guardar(Doctor doctor);
			
	public void actualizar(Doctor doctor);
			
	public Doctor buscar(Integer id);
			
	public void eliminar(Integer id);
}
