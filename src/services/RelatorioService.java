package services;

import java.util.List;

import entities.Despesa;
import entities.Usuario;

public class RelatorioService {
		
		public void imprimirRelatorioDeDespesas (Usuario usuario) {
			
			if (usuario == null) {
				System.out.println("Usuário não encontrado");
			return;
		}
		
		List<Despesa> despesasDoUsuario = usuario.getDespesas();
		
		if (despesasDoUsuario.isEmpty()) {
			System.out.println("Usuário não possui despesas");
		return;
		}
		
		double totalDespesa = 0;
		
		for (Despesa despesa : despesasDoUsuario) {
			System.out.printf("%-5d | %-20s | %-15s | %-15s\n",  
			despesa.getId(),
			despesa.getCategoria(),
			despesa.getDescricao(),
			despesa.getValor(),
			despesa.getData()
			);
			
			totalDespesa += despesa.getValor();
		}
		
	}
}
		


