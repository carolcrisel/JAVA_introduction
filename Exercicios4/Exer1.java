/*Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros
inteiros. O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es
A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100.
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/

	package Exercicios4;

import java.util.Scanner;

public class Exer1 
{
	public static void main (String args[])
	{
		int v,mp;//valor-mudaposi��o
		float[] n=new float[7];
		Scanner ler = new Scanner(System.in);
		for(int i=0;i<6;i++)
		{
			System.out.println("Entre com o valor: ");
			n[i]=ler.nextFloat();
		}
		
		mp=(int) (n[0]+n[1]+n[5]); 
		System.out.println("A soma �: "+mp);
		
		n[4]=100;
		System.out.println("A nova matriz �: \n");
		for(int i=0;i<6;i++)
		{
		System.out.println(" \t"+n[i]+"\t");
		}
		
		
	}
}
