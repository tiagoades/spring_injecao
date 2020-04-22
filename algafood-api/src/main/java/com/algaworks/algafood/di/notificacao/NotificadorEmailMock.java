package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.model.Cliente;

@Profile("dev")
//@Qualifier("email")
@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmailMock implements Notificador {

	@Value("${notificador.email.host-servidor}")
	private String host;
	@Value("${notificador.email.porta-servidor}")
	private Integer porta;
	
	@Autowired
	private NotificadorProperties properties;
	
	public NotificadorEmailMock() {
	
		System.out.println("Aplicação MOCK");
	
	}
	
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {

		System.out.println("Host: "+host);
		System.out.println("Porta: "+porta);
		
		System.out.printf("MOCK: Notificaria %s atraves do email %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
		
		System.out.println("Novo Host: "+properties.getHostServidor());
		System.out.println("Novo Porta: "+properties.getPortaServidor());

	}

}
