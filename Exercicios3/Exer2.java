//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
package Exercicios3;

import java.util.Scanner;

public class Exer2 
{
	public static void main (String args[]) 
	{
		int n,x,par=0,impar=0;
		Scanner ler= new Scanner (System.in);
		
		for(x=1;x<=10;x++)
		{
		System.out.println("Digite o n�mero: ");
		n=ler.nextInt();
			if(n%2==0)
			{
				par=par+1;
			}
			else
			{
				impar=impar+1;
			}
		}
		System.out.println("\nA quanitdade de n�meros pares digitados foi: "+par);
		System.out.println("\nA quanitdade de n�meros �mpares digitados foi: "+impar);
	}
}
