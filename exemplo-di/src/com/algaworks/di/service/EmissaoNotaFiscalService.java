package com.algaworks.di.service;

import com.algaworks.di.model.Cliente;
import com.algaworks.di.model.Produto;
import com.algaworks.di.notificacao.Notificador;

public class EmissaoNotaFiscalService {

	private Notificador notificador;
	
	public EmissaoNotaFiscalService(Notificador notificador) {
		
		this.notificador = notificador;
		
	}
	
	public void emitir(Cliente cliente, Produto produto) {
		
		notificador.notificar(cliente, "Nota fiacal do produto "+ produto.getNome() + " emitida com sucesso!");
		
	}
	
}
