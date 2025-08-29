package entities;

public class Categoria {
	
	private static Integer proximoId = 1;
	
	private Integer id;
	private String nome;
	
	public Categoria(String nome) {
		this.nome = nome;
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
	
	@Override
	public String toString() {
		return nome;
	}
}
