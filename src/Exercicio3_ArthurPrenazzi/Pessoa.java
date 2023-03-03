package Exercicio3_ArthurPrenazzi;

import java.util.Date;

public class Pessoa {
	public String nome;
	public String cpf;
	public Date data_nascimento;

	public Pessoa(String nome, String cpf, Date data_nascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.data_nascimento = data_nascimento;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public double tirarCopias(int copias) {
		return 0.10 * (double) copias;
	}
}
