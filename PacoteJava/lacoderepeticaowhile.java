package PacoteJava;

import java.util.Scanner;

public class lacoderepeticaowhile 
{
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int idade;
		System.out.printf("Entre com sua idade: ");
		idade=ler.nextInt();
		
		while(idade>=1 && idade<=100)
		{
			System.out.printf("A idade �: %d",idade);
			if (idade>=18)
			{
				System.out.printf("\nVoc� � maior de idade");
			}
			else
			{
				System.out.printf("\nVoc� � menor de idade");
			}
			System.out.printf("\nEntre com sua idade: ");
			idade=ler.nextInt();
			
		}
		if (idade<1)
		{
			System.out.println("Ta brincando comigo�");
		}
		
	}

}
