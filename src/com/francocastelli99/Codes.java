package com.francocastelli99;

public class Codes {

	//Invertir una cadena de texto con codigo bruto
	
	private void slowInvertString(String text) {
		String[] array = text.split("");
		StringBuilder newText = new StringBuilder();
		
		
		for (int i = array.length; i > 0; i--) {
			newText.append(array[i - 1]);
		}
		System.out.println(newText);
		
		
	}
	
	private void fastInvertString(String text) {
		String newText = new StringBuilder(text).reverse().toString();
		System.out.println(newText);
	}
	
	
	public static void main(String[] args) {
		Codes codes = new Codes();
		codes.slowInvertString("Hola");
		codes.fastInvertString("Mundo");
		
	}
	
}
