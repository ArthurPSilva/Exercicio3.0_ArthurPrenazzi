package Exercicio3_ArthurPrenazzi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario extends Pessoa {
	private float salario;
	private Date data_admissao;
	private String cargo;

	public Funcionario(String nome, String cpf, Date data_nascimento, float salario, Date data_admissao, String cargo) {
		super(nome, cpf, data_nascimento);
		this.salario = salario;
		this.data_admissao = data_admissao;
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public Date getData_admissao() {
		return data_admissao;
	}

	public String getCargo() {
		return cargo;
	}
	
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	@Override
	public String toString() {
		return "[Funcionario: " + this.nome + " | CPF: " + this.cpf + " | Data de Nascimento: "
				+ df.format(data_nascimento) + " | Salario: " + this.salario + " | Data de Admissao:  "
				+ df.format(data_admissao) + " | Cargo: " + this.cargo + "]";
	}

}
