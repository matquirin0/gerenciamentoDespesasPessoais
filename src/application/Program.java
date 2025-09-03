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
	while(executando) {
		System.out.println("----GERENCIADOR DE DESPESA----");
		System.out.println("------------------------------");
		System.out.println("[1]. Adicionar nova despesa   ");
		System.out.println("[2]. Ver relatório de despesas");
		System.out.println("[0]. Sair                     ");

		int opcao = sc.nextInt();
		sc.nextLine();
		
		switch(opcao) {
		case 1: 
			//LÓGICA PARA ADICIONAR DESPESA (PRÓXIMO PASSO)
			System.out.println("Funcionalidade de adicionar despesa não implementada");
			break;
		case 2:
			relatorioService.imprimirRelatorioDeDespesa(user1);
			break;
		case 0:
			executando = false;
			System.out.println("Obrigado por usar o sistema");
			break;
		default: 
			System.out.println("Opção inválida, tente novamente!");
			break;
			}
		}
	
		sc.close();
	
	}
}
