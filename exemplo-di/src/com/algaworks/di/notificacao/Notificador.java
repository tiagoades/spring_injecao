package com.algaworks.di.notificacao;

import com.algaworks.di.model.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);
	
}
