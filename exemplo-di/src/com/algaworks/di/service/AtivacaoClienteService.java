package com.algaworks.di.service;

import com.algaworks.di.model.Cliente;
import com.algaworks.di.notificacao.Notificador;

public class AtivacaoClienteService {

	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		
		this.notificador = notificador;
	}

	public void ativar(Cliente cliente) {

		cliente.ativar();

		this.notificador.notificar(cliente, "Seu cdastro no sistema esta ativo!");

	}

}
