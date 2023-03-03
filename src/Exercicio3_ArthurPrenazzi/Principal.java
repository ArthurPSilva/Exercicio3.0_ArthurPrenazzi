package Exercicio3_ArthurPrenazzi;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		Aluno aluno1 = new Aluno("Arthur", "12345678910", df.parse("07/10/1999"), "666");
		Professor professor1 = new Professor("Felipe", "10987654321", df.parse("01/04/1989"), 8500,
				"Programacao Orientada a Objetos");
		Funcionario funcionario1 = new Funcionario("Marcao", "66655544433", df.parse("13/08/1980"), 3298,
				df.parse("02/01/2022"), "Seguranca do Campus");

		System.out.println(aluno1);
		System.out.println(professor1);
		System.out.println(funcionario1 + "\n");
	
		
		int copias = 1000;
		
		float ValorAluno;
		ValorAluno = (float) tirarCopiasAluno(copias);
		System.out.println("Valor de " + copias + " copias para alunos e igual a: " + ValorAluno);
		
		float ValorFuncionario;
		ValorFuncionario = (float) tirarCopiasFuncionarios(copias);
		System.out.println("Valor de " + copias + " copias para funcionario e igual a: " + ValorFuncionario);
		
	}
	
	static double tirarCopiasFuncionarios(int qnt) {
		return 0.10 * qnt;
	}
	
		static double tirarCopiasAluno(int qnt) {
			return 0.05 * qnt;
	}
		
		
}
