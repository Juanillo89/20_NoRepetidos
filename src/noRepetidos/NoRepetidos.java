package noRepetidos;

import java.util.Scanner;

public class NoRepetidos
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[9];
		boolean repetido;
		for(int i = 0; i < numeros.length; i++)
		{			
			System.out.print("Número: ");
			numeros[i] = sc.nextInt();
			repetido = false;
			for(int j = 0; j < numeros.length && !repetido; j++)
			{
				if(numeros[i] == numeros[j] && i != j)
				{
					repetido = true;
				}
			}
			if(repetido)
			{
				System.out.println("Repetido.");				
				i--;
			}
		}
		sc.close();
		System.out.println("Los números introducidos han sido: ");
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.println(numeros[i]);		
		}
	}
}

