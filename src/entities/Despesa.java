package entities;

import java.time.LocalDateTime;

public class Despesa {
	private Integer id;
	private String descricao;
	private Double valor;
	private LocalDateTime data;
	
	
	public Despesa(Integer id, String descricao, Double valor, LocalDateTime data) {
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.data = data;
	}

	public Integer getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
}
