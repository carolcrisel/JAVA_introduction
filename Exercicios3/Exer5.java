/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.*/
package Exercicios3;

import java.util.Scanner;

public class Exer5 
{
		public static void main(String args[])
		{
			int n,soma=0;
			Scanner ler= new Scanner (System.in);
			do
			{
				System.out.println("Digite o n�mero: ");
				n=ler.nextInt();
					soma=soma+n;
			}
			while(n!=0);
				System.out.println(" A soma dos n�meros digitados �: "+soma);	
		}
}
