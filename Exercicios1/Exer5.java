//Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno.
	//Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.

package Exercicios1;

import java.util.Scanner;

public class Exer5 
{
	public static void main(String args[])
	{
	Scanner ler= new Scanner(System.in);
	int notaa,notab,notac,mp;
	System.out.println("Entre com a primeira nota: ");
	notaa= ler.nextInt();
	System.out.println("Entre com a segunda nota: ");
	notab= ler.nextInt();
	System.out.println("Entre com a terceira nota: ");
	notac= ler.nextInt();
	mp=(notaa*2+notab*3+notac*5)/10;
		System.out.println("A m�dia do aluno �: "+mp);
	
	}

}
