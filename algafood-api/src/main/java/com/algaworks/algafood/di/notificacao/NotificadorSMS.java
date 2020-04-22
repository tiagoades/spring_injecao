package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.model.Cliente;

//@Qualifier("sms")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {

	
	@Autowired
	private NotificadorProperties properties;
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {

		
		
		System.out.printf("Notificando %s atrasves do telefone %s: %s\n", cliente.getNome(),
				cliente.getTelefone(), mensagem);

	}

}
