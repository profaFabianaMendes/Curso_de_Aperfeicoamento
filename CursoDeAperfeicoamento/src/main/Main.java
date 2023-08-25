package main;

import java.util.*;
import negocio.*;
import view.*;
import dados.*;

public class Main {
	
	private static Dados d = new Dados();
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int op = -1;
		int aux;
		d.preencherDados();
		while(op != 0) {
			System.out.print(imprimirMenu());
			op = in.nextInt();
			 switch (op) {
			 	case 0:
			 		System.out.println("Obrigada por utilizar o sistema. Ate logo!");
			 		break;
				case 1:
					cadastrarAluno();
					break;
				case 2:
					removerAluno();
					break;
				case 3: 
					System.out.println("Escolha um dos alunos a seguir para editar as informacoes:\n");
					listarAlunos();
					aux = in.nextInt();
					Aluno a = lerDadosAluno();
					editar(aux, a);
					break;
				case 4: 
					listarAlunos();
					break;
				case 5:
					cadastrarProfessor();
					break;
				case 6:
					removerProfessor();
					break;
				case 7: 
					System.out.println("Escolha um dos professores a seguir para editar as informacoes:\n");
					listarProfessores();
					aux = in.nextInt();
					Professor p = lerDadosProfessor();
					editar(aux, p);
					break;
				case 8: 
					listarProfessores();
					break;
				default:
					System.out.println("\nOpcao Invalida!\n");
					break;
			 }
		}
		in.close();
	}
	
	public static String imprimirMenu() {
		String saida = new String("Escolha uma das opcoes a seguir:\n");
		saida = saida + "00 - Sair da aplicacao\n";
		saida = saida + "01 - Cadastrar novo aluno\n";
		saida = saida + "02 - Remover aluno existente\n";
		saida = saida + "03 - Editar aluno existente\n";
		saida = saida + "04 - Listar alunos\n";
		saida = saida + "05 - Cadastrar novo professor\n";
		saida = saida + "06 - Remover professor existente\n";
		saida = saida + "07 - Editar professor existente\n";
		saida = saida + "08 - Listar professores\n";
		return saida;
	}
	
	public static boolean cadastrarAluno() {
		Aluno a = lerDadosAluno();
		if(d.getnAlunos() < 100) {
			d.setAluno(d.getnAlunos(), a);
			d.setnAlunos(d.getnAlunos()+1);
			System.out.println("Aluno cadastrado com sucesso!\n");
			return true;
		} else {
			System.out.println("Não foi possivel cadastrar o aluno!\n");
			return false;
		}
	}
	
	public static Aluno lerDadosAluno() {
		String nome;
		String id; 
		String cpf; 
		String tel; 
		String dtNascimento; 
		String end;
		in.nextLine(); //esvazia dados do teclado
		System.out.println("Digite o nome do aluno: ");
		nome = in.nextLine();
		System.out.println("Digite o numero da identidade do aluno:");
		id = in.nextLine();
		System.out.println("Digite o cpf do aluno:");
		cpf = in.nextLine();
		System.out.println("Digite o telefone do aluno:");
		tel = in.nextLine();
		System.out.println("Digite a data de nascimento do aluno:");
		dtNascimento = in.nextLine();
		System.out.println("Digite o endereco do aluno:");
		end = in.nextLine();
		Aluno a = new Aluno(nome, id, cpf, tel, dtNascimento, end);
		return a;	
	}
	
	public static void removerAluno() {
		System.out.println("Escolha um dos alunos a seguir para ser removido:\n");
		listarProfessores();
		int i = in.nextInt();
		if(i < d.getnAlunos() && i > 0) {
			swapListaAlunos(i);
			d.setAluno(d.getnAlunos(), null);
			d.setnAlunos(d.getnAlunos() - 1);
			System.out.println("Aluno removido com sucesso");
		} else {
			System.out.println("Voce escolheu um numero invalido!");
		}
		
	}
	
	public static void swapListaAlunos(int a) {
		for(int i = a; i < d.getnAlunos() - 1; i++) 
			d.setAluno(i, d.getAluno(i+1));
	}
	
	public static void editar(int i, Aluno a) {
		if(i < d.getnAlunos() && i >= 0) {
			d.setAluno(i, a);
			System.out.println("Dados editados com sucesso");
		} else {
			System.out.println("Voce escolheu um numero invalido!");
		}
	}
	
	public static void listarAlunos() {
		in.nextLine(); //esvazia dados do teclado
		for(int i = 0; i < d.getnAlunos(); i++) 
			System.out.println(i + " -> " + d.getAlunos()[i].toString());
		/* Descomente a linha a seguir para ver a listagem dos alunos em interface gráfica
		 * new TelaListagem(d.getNomeAlunos());
		 */
	}
	
	public static boolean cadastrarProfessor() {
		Professor p = lerDadosProfessor();
		if(d.getnProfs() < 100) {
			d.setProfessor(d.getnProfs(), p);
			d.setnAlunos(d.getnProfs() + 1);
			System.out.println("Professor cadastrado com sucesso!\n");
			return true;
		} else {
			System.out.println("Não foi possivel cadastrar o Professor!\n");
			return false;
		}
	}
	
	public static Professor lerDadosProfessor() {
		String nome;
		String id; 
		String cpf; 
		String tel; 
		double valor;
		in.nextLine(); //esvazia dados do teclado
		System.out.println("Digite o nome do professor: ");
		nome = in.nextLine();
		System.out.println("Digite o numero da identidade do professor:");
		id = in.nextLine();
		System.out.println("Digite o cpf do professor:");
		cpf = in.nextLine();
		System.out.println("Digite o telefone do professor:");
		tel = in.nextLine();
		System.out.println("Digite o valor hora aula do professor:");
		valor = in.nextDouble();
		Professor p = new Professor(nome, id, cpf, tel, valor);
		return p;	
	}
	
	public static void removerProfessor() {
		System.out.println("Escolha um dos professores a seguir para ser removido:\n");
		listarProfessores();
		int i = in.nextInt();
		if(i < d.getnProfs() && i > 0) {
			swapListaProfessores(i);
			d.setProfessor(d.getnProfs(), null);
			d.setnProfs(d.getnProfs() - 1);
			System.out.println("Professor removido com sucesso");
		} else {
			System.out.println("Voce escolheu um numero invalido!");
		}
	}
	
	public static void swapListaProfessores(int p) {
		for(int i = p; i < d.getnProfs() - 1; i++) 
			d.setProfessor(i, d.getProfessor(i+1));
	}
	
	public static void editar(int i, Professor p) {
		if(i < d.getnProfs() && i >= 0) {
			d.setProfessor(i, p);
			System.out.println("Dados editados com sucesso");
		} else {
			System.out.println("Voce escolheu um numero invalido!");
		}
	}
	
	public static void listarProfessores() {
		for(int i = 0; i < d.getnProfs(); i++) 
			System.out.println(i + " -> " + d.getProfessores()[i].toString());
		/* Descomente a linha a seguir para ver a listagem dos professores em interface gráfica
		 * new TelaListagem(d.getNomeProfessores());
		 */
	}
	
}
