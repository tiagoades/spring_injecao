package com.algaworks.algafood.di.notificacao;

import com.algaworks.di.model.Cliente;

public class NotificadorEmail{


	
	
	
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.printf("Notificando %s atrasves do email %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
		
	}
	
}
