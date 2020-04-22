package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.model.Cliente;
import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.TipoDoNotificador;


@Component
public class AtivacaoClienteService {

	//@Qualifier("sms")
//	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
//	@Autowired
//	private Notificador notificador;
	
//	@PostConstruct
//	public void init() {
//		
//		System.out.println("INIT "+notificador);
//		
//	}
	
//	@PreDestroy
//	public void destroy() {
//		
//		System.out.println("DESTROY");
//	}
	
	@Autowired
	private ApplicationEventPublisher eventPublisher;

	public void ativar(Cliente cliente) {

		cliente.ativar();

		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
		
		//this.notificador.notificar(cliente, "Seu cadastro no sistema esta ativo!");

	}

}
