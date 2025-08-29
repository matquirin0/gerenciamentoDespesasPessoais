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
		
		
		for (Despesa despesa : despesasDoUsuario) {
			System.out.print(
			despesa.getId(),
			despesa.getCategoria(),
			despesa.getDescricao(),
			despesa.getValor(),
			despesa.getData()
			);
		}
	}
}
		


