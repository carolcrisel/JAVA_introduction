/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

package Exercicios2;

import java.util.Scanner;

public class Exer4 
{
	public static void main (String args[])
	{
		Scanner ler= new Scanner (System.in);
		int n,p,i;
		System.out.println("Digite o n�mero: ");
		n=ler.nextInt();
		
		if (n%2==0)
		{
			p=(int) Math.sqrt(n);
		System.out.println("A ra�z quadrada do n�mero digitado �: "+p);
		}
		else
		{
			i=(int) Math.pow(n, 2);
			System.out.println("O n�mero elevado ao quadrado �:  "+i);
		}
	}

	
	
}
