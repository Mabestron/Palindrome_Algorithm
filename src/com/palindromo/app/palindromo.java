package com.palindromo.app;

public class palindromo
{

	public static void main(String[] args) 
	{
		// se declaran las variables a utilizar
		boolean isPalindrome=true;
		String cadena ="aMad a la Dama";
		String cadenainvertida ="";

		//se limpia la cadena de los espacios en blanco y se pone la cadena en minusculas
		String cadClean=cadena.replace(" ", "");
		//cadClean = cadClean.replace(".","");
		//cadClean = cadClean.replace(",","");
		//cadClean = cadClean.replace("!","");
		cadClean = cadClean.toLowerCase();
		
		// se crea el objeto builder de la clase StringBuilder
		StringBuilder builder = new StringBuilder(cadClean);
		
		// se invierte la cadena que se limpió y se guarda en una variable
		cadenainvertida=builder.reverse().toString();
		
		//se evalua cada posición de los arreglos para ver sí son diferentes
		for (int i=0; i<cadClean.length();i++)
		{
			if (cadClean.charAt(i)!=cadenainvertida.charAt(i))
			{
				
				isPalindrome=false;
			}
		}

		// se imprimen las cadenas original, e invertido. así como el valor de la variable boolenana
		System.out.println(cadClean);
		System.out.println(cadenainvertida);
		System.out.println(isPalindrome);

	}

}
