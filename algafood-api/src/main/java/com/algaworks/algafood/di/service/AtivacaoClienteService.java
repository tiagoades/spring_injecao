package com.algaworks.algafood.di.service;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.model.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;

public class AtivacaoClienteService {

	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
	
		this.notificador = notificador;
		
		System.out.println("AtivacaoClienteService: "+notificador);
		
	}
	
	public void ativar(Cliente cliente) {

		cliente.ativar();

		this.notificador.notificar(cliente, "Seu cdastro no sistema esta ativo!");

	}

}
