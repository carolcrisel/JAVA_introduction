/*Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados.*/
package Exercicios4;

import java.util.Scanner;

public class Exer2 
{
	public static void main (String args[])
	{
		float[] n=new float[7];
		float[] parimpar=new float[7];
		float sp=0,im=0,q;//somapares,impares e quantidade
		Scanner ler = new Scanner(System.in);
		
		for(int i=0;i<6;i++)
		{
			System.out.println("Entre com o valor: ");
			n[i]=ler.nextFloat();
			
			if (n[i]%2==0)
			{
				sp=sp + n[i];
				parimpar[i]=1;
			}
			
			if (n[i]%2!=0)
			{
				im++;
				parimpar[i]=0;
				
			}
		}
		//tentando mostrar os n�meros digitados
		for(int i=0;i<6;i++) 
		{
			if(parimpar[i]==1)
			{
				//COMO ESCREVER OS VALORES EM LISTA??
			//System.out.println("\nOs n�meros pares digitados foram: "+n[i]);
			System.out.println(n[i]);
			}
			if (n[i]%2!=0)
			{
			//System.out.println("\nOs n�meros �mpares digitados foram: "+n[i]);
			System.out.println(n[i]);
			}
		}
		
		
		
		System.out.println("\nA soma dos n�meros pares �:"+sp); 
		System.out.println("\nA quantidade de n�meros �mpares digitados foi de: "+im);
	}
}
