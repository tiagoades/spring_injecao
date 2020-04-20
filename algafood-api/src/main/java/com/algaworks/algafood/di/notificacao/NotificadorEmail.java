package com.algaworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.model.Cliente;

//@Component
public class NotificadorEmail implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {

		System.out.printf("Notificando %s atrasves do email %s: %s\n", cliente.getNome(),
				cliente.getEmail(), mensagem);

	}

}
