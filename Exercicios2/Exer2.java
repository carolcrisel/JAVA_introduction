package Exercicios2;

import java.util.Scanner;

public class Exer2 
{
	public static void main(String args[])
	{
		Scanner ler =new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Entre com o primeiro n�mero:");
		n1=ler.nextInt();
		System.out.println("Entre com o segundo n�mero: ");
		n2=ler.nextInt();
		System.out.println("Entre com o terceiro n�mero: ");
		n3=ler.nextInt();
		
		if (n1>n2 && n1>n3 && n2>n3)
		{
			System.out.println(" A ordem decrescente � "+n1+n2+n3);
		}
		else
		{
			if (n1>n2 && n1>n3 && n3>n2)
			{
				System.out.println(" A ordem decrescent �: "+n1+n3+n2);
			}
			else 
			{
				if (n2>n1 && n2>n3 && n1>n3)
				{
					System.out.println(" A ordem decrescent �: "+n2+n1+n3);
				}
				else
				{
						if (n2>n1 && n2>n3 && n3>n1)
						{
					System.out.println(" A ordem decrescent �: "+n2+n3+n1);
						}
						else
						{
							if(n3>n1 && n3>n2 && n1>n2)
							{
								System.out.println(" A ordem decrescent �: "+n3+n1+n2);
							}
							else 
							{
								System.out.println(" A ordem decrescent �: "+n3+n2+n1);
							}
						}
				}
			}
		}
		if (n1==n2||n2==n3||n1==n3) 
		{
			System.out.println(" Existem n�meros iguais na sequ�ncia!");
		}
		
	}
}
