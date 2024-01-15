package com.uce.edu;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.modelo.CitaMedica;
import com.uce.edu.modelo.Doctor;
import com.uce.edu.modelo.Paciente;
import com.uce.edu.service.IDoctorService;
import com.uce.edu.service.IPacienteService;

@SpringBootApplication
public class Pa2P3P5EgApplication implements CommandLineRunner{
	
	@Autowired
	private IPacienteService iPacienteService;

	@Autowired
	private IDoctorService iDoctorService;
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2P3P5EgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Paciente p1 = new Paciente();
		p1.setNombre("Erika");
		p1.setApellido("Gualoto");
		p1.setCedula("1718411745");
		p1.setFechaNacimiento(LocalDateTime.of(1999, 11, 10, 2, 5));
		p1.setCodigoSeguro("17A5");
		p1.setEstatura("1.47");
		p1.setGenero("Femenino");
		p1.setPeso("57kg");
		
		Paciente p2 = new Paciente();
		p2.setNombre("Juan");
		p2.setApellido("Gualoto");
		p2.setCedula("1709998916");
		p2.setFechaNacimiento(LocalDateTime.of(1884, 02, 1, 1, 4));
		p2.setCodigoSeguro("18C3");
		p2.setEstatura("1.68");
		p2.setGenero("Masculino");
		p2.setPeso("60kg");
		
		Doctor d = new Doctor();
		d.setNombre("Francisco");
		d.setApellido("Tapia");
		d.setCedula("1718411769");
		d.setFechaNacimiento(LocalDateTime.of(1942, 12, 3, 1, 4));
		d.setCodigoSenecyt("36AW");
		d.setNumeroConsultorio(2);
		
		Paciente pac3 = new Paciente();
        pac3.setCedula("1718411729");
        pac3.setApellido("Tigrero");
        pac3.setFechaNacimiento(LocalDateTime.of(1896, 10, 8,3,7));
        pac3.setCodigoSeguro("65aaaa77");
        pac3.setEstatura("170CM");
        pac3.setPeso("40 KG");
        pac3.setGenero("Masculino");
		
		List<Paciente> pacientes = new ArrayList<Paciente>();
		pacientes.add(pac3);
		pacientes.add(p1);
		pacientes.add(p2);
		
		CitaMedica cm = new CitaMedica();
		cm.setDiagnostico("Gripe");
		cm.setDoctor(d);
		cm.setPaciente(pac3);
		cm.setFechaCita(LocalDateTime.of(2024, 1, 5, 4,25, 0));
		cm.setFechaProximaCita(LocalDateTime.of(2024, 5, 10, 1, 35));
		cm.setNumeroCita(1);
		cm.setReceta("Ibuprofeno de 500");
		cm.setValorCita(new BigDecimal(2));
		
		CitaMedica cm1 = new CitaMedica();
		cm1.setDiagnostico("Dolor de estomago");
		cm1.setDoctor(d);
		cm1.setPaciente(p1);
		cm1.setFechaCita(LocalDateTime.of(2024, 1, 5, 4,25, 0));
		cm1.setFechaProximaCita(LocalDateTime.of(2024, 5, 10, 1, 35));
		cm1.setNumeroCita(1);
		cm1.setReceta("Umbral de 500");
		cm1.setValorCita(new BigDecimal(2));
		
		CitaMedica cm2 = new CitaMedica();
		cm2.setDiagnostico("Tos");
		cm2.setDoctor(d);
		cm2.setPaciente(p2);
		cm2.setFechaCita(LocalDateTime.of(2024, 1, 5, 4,25, 0));
		cm2.setFechaProximaCita(LocalDateTime.of(2024, 5, 10, 1, 35));
		cm2.setNumeroCita(1);
		cm2.setReceta("Ibuprofeno de 600mg");
		cm2.setValorCita(new BigDecimal(2));
		
		List<CitaMedica> lista = new ArrayList<>();
		lista.add(cm);
		lista.add(cm2);
		lista.add(cm1);
		
		pac3.setCitasMedicas(lista);
		p1.setCitasMedicas(lista);
		p2.setCitasMedicas(lista);
		
		d.setCitasMedicas(lista);
		
		this.iDoctorService.guardar(d);
		
		this.iPacienteService.guardar(pac3);
		
		/*System.out.println("Query");
		List<Libro> lista = this.libroService.buscarPorfecha(LocalDateTime.of(2023, 1, 1, 7, 15));
		for (Libro libro : lista) {
			System.out.println(libro);
		}
		
		Libro li1 = this.libroService.buscarPorTitulo("LA");
		System.out.println(li1);
		
		Libro libroFinal = this.libroService.buscarPorNombre("Java");
		System.out.println(libroFinal);
		*/
		
	}

}
