package Exercicio3_ArthurPrenazzi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Professor extends Pessoa {
	private float salario;
	private String disciplinas_lecionadas;

	public Professor(String nome, String cpf, Date data_nascimento, float salario, String disciplinas_lecionadas) {
		super(nome, cpf, data_nascimento);
		this.salario = salario;
		this.disciplinas_lecionadas = disciplinas_lecionadas;
	}

	public float getSalario() {
		return salario;
	}

	public String getDisciplinas_lecionadas() {
		return disciplinas_lecionadas;
	}

	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	@Override
	public String toString() {
		return "[Professor: " + this.nome + " | CPF: " + this.cpf + " | Data de Nascimento: "
				+ df.format(data_nascimento) + " | Salario: " + this.salario + " | Disciplina Lecionada:  "
				+ this.disciplinas_lecionadas + "]";
	}

}
