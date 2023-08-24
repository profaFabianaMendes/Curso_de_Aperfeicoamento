package main;

import java.util.*;
import negocio.*;
import dados.*;

public class Main {
	
	Dados d = new Dados();

	public static void main(String[] args) {
		

	}
	
	public String imprimirMenu() {
		
		return "Menu";
	}
	
	public boolean cadastrarAluno(Aluno a) {
		return true;
	}
	
	public boolean removerAluno(Aluno a) {
		return true;
	}
	
	public boolean editarAluno(Aluno a) {
		return true;
	}
	
	public String listarAlunos() {
		return "Alunos";
	}
	
	public boolean cadastrarProfessor(Professor p) {
		return true;
	}
	
	public boolean removerProfessor(Professor p) {
		return true;
	}
	
	public boolean editarProfessor(Professor p) {
		return true;
	}
	
	public String listarProfessores() {
		return "Professores";
	}
	
	
	
}
