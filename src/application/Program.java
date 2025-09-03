package application;

import java.util.Scanner;

import entities.Usuario;
import services.RelatorioService;
import services.UsuarioService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		RelatorioService relatorioService = new RelatorioService();
		UsuarioService usuarioService = new UsuarioService();
		
		Usuario user1 = usuarioService.cadastrarUsuario(sc);
		System.out.println("\nBem-vindo(a) ao sistema, " + user1.getNome() + "!");
	
	boolean executando = true;
	while(executando = true) {
		System.out.println("----GERENCIADOR DE DESPESA----");
		System.out.println("------------------------------");
		System.out.println("[1]. Adicionar nova despesa   ");
		System.out.println("[2]. Ver relatório de despesas");
		System.out.println("[0]. Adicionar nova despesa   ");
		}
	}
}
