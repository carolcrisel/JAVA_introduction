package Exercicios4;

import java.util.Scanner;

public class Exercicios4 {
	public static void main (String args[])
	{
		int vetor[] = new int[6],somapar=0,quantimpar=0;
		int vetorpar[]=new int[6];
		Scanner ler = new Scanner(System.in);
		
		for(int x=0;x<6;x++)
		{
			System.out.println("Entre com um valor: ");
			vetor[x] = ler.nextInt();
			
			if(vetor[x]%2==0)
			{
				vetorpar[x]=vetor[x];
				System.out.println("Valor par: "+vetor[x]);
				somapar = somapar+vetor[x];
			}
			else
			{
				System.out.println("Valor �mpar: "+vetor[x]);
				quantimpar++;
			}
		}
		System.out.println("Somat�rio de n�meros pares: "+somapar);
		System.out.println("Quantidade de n�meros �mpares: "+quantimpar);
		System.out.println();
		System.out.println();
		for(int x=0;x<6;x++)
		{
			if(vetor[x]%2==0)
			{
				System.out.printf("\nValor par: %d",vetor[x]);
			}
		}
		System.out.println();
		System.out.println();
		for(int x=0;x<6;x++)
		{
			if(vetor[x]%2==1)
			{
				System.out.printf("\nValor �mpar: %d",vetor[x]);
			}
		}
		System.out.println("\n\nVetor de n�meros pares:\n");
		for(int x=0;x<6;x++)
		{
			System.out.println(vetorpar[x]);
		}
	}
}



