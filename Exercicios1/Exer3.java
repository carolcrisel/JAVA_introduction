/* Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
	expressa em segundos e mostre-o expresso em horas, minutos e segundos. */

package Exercicios1;

import java.util.Scanner;

public class Exer3 {
	public static void main (String args[])
	{
		Scanner ler =new Scanner (System.in);
		int s,m,h,d;
		System.out.println("Digite o tempo de execu��o em segundos: ");
		s=ler.nextInt();
		h=s/3600;
		m=(s%3600)/60;
		s=(s%3600)%60;		
		System.out.println("O tempo de execu��o foi de "+h+" hora(s), "+m+" minutos e "+s+" segundos.");
	}
}
