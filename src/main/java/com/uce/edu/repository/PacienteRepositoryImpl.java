package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PacienteRepositoryImpl implements IPacienteRepository {
	
	@PersistenceContext
	private EntityManager entitymanager;
	
	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entitymanager.persist(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entitymanager.merge(paciente);
	}

	@Override
	public Paciente seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entitymanager.find(Paciente.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Paciente paciente = this.seleccionar(id);
		this.entitymanager.remove(paciente);
	}
	
	/*@Override
	public Libro seleccionarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		// SQL: SELECT * FROM libro l WHERE l.lbr_titulo = ?
		// JPQL: SELECT l FROM Libro l WHERE l.titulo = :variable
		// Query myQuery = this.entityManager.createQuery("SELECT l FROM Libro l WHERE
		// l.titulo = :variable AND l.fecha = :variable2");
		Query myQuery = this.entityManager.createQuery("SELECT l  FROM Libro l WHERE l.titulo = : variable ");
		// variable va reemplazar en nombre
		myQuery.setParameter("variable", nombre);
		// myQuery.setParameter("variable2", nombre); --> en el caso de tener 2
		// variables.
		// return (Libro) myQuery.getResultList().get(0); 0 es la posición
		return (Libro) myQuery.getSingleResult();
	}

	@Override
	public List<Libro> seleccionarPorFechaPublicacion(LocalDateTime fechaPublicacion) {
		// TODO Auto-generated method stub
		// SQL: SELECT * FROM Libro l WHERE l.lbr_fecha_publicacion >= ?
		// JPQL: SELECT l FROM Libro l WHERE l.fechaPublicacion >= :fecha
		Query myQuery = this.entityManager.createQuery("SELECT l FROM Libro l WHERE l.fechaPublicacion >= :fecha");
		myQuery.setParameter("fecha", fechaPublicacion);
		return (List<Libro>) myQuery.getResultList();
	}*/

}
