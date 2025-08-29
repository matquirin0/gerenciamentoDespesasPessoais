package application;

import java.util.ArrayList;
import java.util.List;

import entities.Categoria;
import entities.Despesa;
import entities.Usuario;

public class Program {

	public static void main(String[] args) {
		Usuario u1 = new Usuario ("Matheus", "mpq@gmail.com");
		Categoria c1 = new Categoria("Alimentação");
		Categoria c2 = new Categoria("Transporte");
		
		Despesa d1 = new Despesa(u1, c1, "Kiburgao", 50.00);
		
		List<Despesa> despesas = new ArrayList<>();
		
		despesas.add(d1);
		
		System.out.println(despesas);
	}
	
}
