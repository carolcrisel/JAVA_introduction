package Exercicios2;

import java.util.Scanner;

public class Exer3 
{
	public static void main (String args[])
	{
		Scanner ler=new Scanner (System.in);
		int idade;
		System.out.println(" Digite sua idade: ");
		idade= ler.nextInt();
		
		if (idade>=10 && idade<=14)
		{
			System.out.println(" Sua categoria � a infantil.");
		}
		else
		{
			if (idade>=15 && idade<=17)
			{
				System.out.println("Sua categoria � juvenil.");
			}
			else
			{
				if(idade>=18 && idade<=25)
				{
				System.out.println("Sua categoria � adulto.");
				}
				else
				{
					System.out.println("Sua idade n�o tem categoria.");
				}
			}
				
		}
		
		
	}

}
