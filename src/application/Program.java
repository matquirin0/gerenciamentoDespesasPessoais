package application;

import java.util.Scanner;

import entities.Usuario;
import entities.Despesa;
import entities.Categoria;

public class Program {

	public static void main(String[] args) {
		Usuario u1 = new Usuario("Matheus", "mpq@gmail.com");
		Categoria c1 = new Categoria ("iFood");
		Despesa d1 = new Despesa (u1, c1, "Kiburgão Lanches", 54.50);
		
		u1.addDespesa(d1);
		System.out.println(d1);
		
	}
	
}
