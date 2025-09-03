package services;

import java.util.Scanner;

import entities.Usuario;

public class UsuarioService {
	
	public Usuario cadastrarUsuario(Scanner scanner) {

	
	System.out.println("Seja bem-vindo ao Gerenciador de Despesas pessoais");
	System.out.println("----------------CADASTRO DE USUÁRIO----------------");
	System.out.print("Digite seu nome e sobrenome: ");
	String nome = scanner.nextLine();
	System.out.print("Digite seu email (siga o padrão XXXX@YYYY.com)");
	String email = scanner.nextLine();
	Usuario user1 = new Usuario(nome, email);
	
	return user1;
	}
}
