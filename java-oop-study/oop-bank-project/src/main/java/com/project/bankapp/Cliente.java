package com.project.bankapp;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cliente {

	private String nome;

	@Override
	public String toString() {
		return nome;
	}
}
