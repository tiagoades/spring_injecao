package com.algaworks.di;

import com.algaworks.di.model.Cliente;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorEmail;
import com.algaworks.di.notificacao.NotificadorSMS;
import com.algaworks.di.service.AtivacaoClienteService;

public class Main {

	public static void main(String[] args) {

		Cliente joao = new Cliente("João", "joao@xpto.com", "123456789");
		Cliente maria = new Cliente("maria", "maria@xpto.com", "987456321");
		
		Notificador notificador = new NotificadorEmail();
		
		AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);
		ativacaoClienteService.ativar(joao);
		ativacaoClienteService.ativar(maria);
		
	}

}
