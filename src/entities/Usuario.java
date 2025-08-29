package entities;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private static Integer proximoId = 1;
	
	private Integer id;
	private String nome;
	private String email;
	private List<Despesa> despesas;
	
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
		this.despesas = new ArrayList<>();
		this.id = proximoId;
		proximoId++;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void addDespesa(Despesa despesa) {
		this.despesas.add(despesa);
	}
	
	public List<Despesa> getDespesas(){
		return despesas;
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
}
