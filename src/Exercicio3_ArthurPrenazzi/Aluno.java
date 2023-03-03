package Exercicio3_ArthurPrenazzi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno extends Pessoa {
	private String matricula;

	public Aluno(String nome, String cpf, Date data_nascimento, String matricula) {
		super(nome, cpf, data_nascimento);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + " | CPF: " + this.cpf + " | Data de Nascimento: " + df.format(data_nascimento)
				+ " | Matricula: " + this.matricula + "]";

	}
}
