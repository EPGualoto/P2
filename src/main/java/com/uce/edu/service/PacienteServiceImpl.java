package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.modelo.Paciente;
import com.uce.edu.repository.IPacienteRepository;

@Service
public class PacienteServiceImpl implements IPacienteService {
	@Autowired
	private IPacienteRepository iPacienteRepository;
	
	@Override
	public void guardar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.insertar(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.actualizar(paciente);
	}

	@Override
	public Paciente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iPacienteRepository.seleccionar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.eliminar(id);
	}
	
	/*@Override
	public Libro buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.iLibroRepository.seleccionarPorNombre(nombre);
	}

	@Override
	public List<Libro> buscarPorfecha(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return this.iLibroRepository.seleccionarPorFechaPublicacion(fecha);
	}*/

}
