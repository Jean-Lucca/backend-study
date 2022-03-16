package com.project.bankapp;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Banco {

	private String nome;
	private List<Conta> contas;

	public void listaClientes() {
		System.out.println("Clientes do banco: "+nome);
		for(Conta c : contas) { 
			System.out.println("Titular: "+ c);
		}
	}
}
