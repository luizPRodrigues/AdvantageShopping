package com.advantageonlineshopping.advantage_shopping.utils;

import java.util.Random;

public class RandomUtils {

	private static final String CARACTERES = "abcdefghijklmnopqrstuvwxyz";
	private static final Random RANDOMICO = new Random();

	public String generateRandomString(int quantidadeCaracteres) {
		StringBuilder randomString = new StringBuilder(quantidadeCaracteres);

		for (int i = 0; i < quantidadeCaracteres; i++) {
			int index = RANDOMICO.nextInt(CARACTERES.length());
			char caracter = CARACTERES.charAt(index);
			randomString.append(caracter);
		}

		return randomString.toString();
	}

}
