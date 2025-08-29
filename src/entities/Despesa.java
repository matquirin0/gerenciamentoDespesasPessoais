package entities;

import java.time.LocalDateTime;

public class Despesa {
	
	private static Integer proximoId = 1;
	
	
	private Integer id;
	private String descricao;
	private Double valor;
	private LocalDateTime data;
	
	private Usuario usuario;
	private Categoria categoria;
	
	public Despesa(Usuario usuario,Categoria categoria, String descricao, Double valor ) {
		this.usuario = usuario;
		this.categoria = categoria;
		this.descricao = descricao;
		this.valor = valor;
		this.data = LocalDateTime.now();
		
		this.id = proximoId;
		proximoId++;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Despesa [id=" + id + ", descricao=" + descricao + ", valor=" + valor + ", data=" + data + ", usuario="
				+ usuario + ", categoria=" + categoria + "]";
	}
	
	
	
	
}
	
