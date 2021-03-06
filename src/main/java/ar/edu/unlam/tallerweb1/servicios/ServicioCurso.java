package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Catalogo;
import ar.edu.unlam.tallerweb1.modelo.Curso;

public interface ServicioCurso {
		
	// REGISTRAR CURSO
	void registrarCurso(Curso curso);
	
	// TRAER UNA LISTA DE CURSOS
	List<Curso> traerListaCursos();

	// TRAER UNA LISTA DE CURSOS
	List<Curso> traerListaCursos (Catalogo cat);
	
	// TRAER UN CURSO
	Curso traerUnCurso(Long id);
	
	// EDITAR CURSO
	void editarCurso(Curso curso);	
		
}