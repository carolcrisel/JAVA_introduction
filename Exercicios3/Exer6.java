/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).*/
package Exercicios3;

import java.util.Scanner;

public class Exer6 
{
	public static void main (String args[])
	{
		int n,soma=0,c=0;
		double media;
		Scanner ler= new Scanner (System.in);
		do
		{
			System.out.println("Digite o n�mero: ");
			n=ler.nextInt();
			
				if(n%3==0 && n!=0)
				{	c=c+1;
					soma=soma+n;
				}
		}
		while(n!=0);
		
			media=soma/c;
			System.out.println(" A m�dia de multiplos de 3 �: "+media);
	}

}
