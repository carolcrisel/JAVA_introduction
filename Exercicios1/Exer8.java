/* O custo ao consumidor de um carro novo � a soma do custo de f�brica com
	percentagem do distribuidor e dos impostos (imposto ao custo de f�brica).
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de f�brica de um carro e escrever o custo ao
	consumidor. */
package Exercicios1;

import java.util.Scanner;

public class Exer8 
{
	public static void main (String args[])
	{
		Scanner ler=new Scanner (System.in);
		double cfc,cc;//custo de fabrica��o do carro,custo ao consumidor
		System.out.println("Digite o custo de fabrica��o do carro: ");
		cfc=ler.nextInt();
		//cc=cfc + (0,45+0,28)*cfc;
		cc= ((0.45+0.28)*cfc)+cfc;
		System.out.println("O custo ao consumidor � de: "+cc+" reais.");
	}
}
