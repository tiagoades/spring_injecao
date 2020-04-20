package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.model.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	@Autowired(required = false)
	private Notificador notificador;

//	@Autowired
//	public AtivacaoClienteService(Notificador notificador) {
//	
//		this.notificador = notificador;
//						
//	}

//	public AtivacaoClienteService(String qualquerCoisa) {
//		
//	}

	public void ativar(Cliente cliente) {

		cliente.ativar();

		if (notificador != null) {
		
			this.notificador.notificar(cliente, "Seu cadastro no sistema esta ativo!");
		
		} else {
		
			System.out.println("Não existe um notificador!!1");
		
		}
	}

//	@Autowired
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}

}
