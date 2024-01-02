package com.advantageonlineshopping.advantage_shopping.utils;

import java.util.Random;

public class RandomUtils {

	private static final String CARACTERES = "abcdefghijklmnopqrstuvwxyz";
	private static final Random RANDOMICO = new Random();

	public String geraStringRandomica(int quantidadeCaracteres) {
		StringBuilder stringRandomica = new StringBuilder(quantidadeCaracteres);

		for (int i = 0; i < quantidadeCaracteres; i++) {
			int index = RANDOMICO.nextInt(CARACTERES.length());
			char caracter = CARACTERES.charAt(index);
			stringRandomica.append(caracter);
		}

		return stringRandomica.toString();
	}

}
