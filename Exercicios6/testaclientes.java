package Exercicios6;

public class testaclientes 
{
	public static void main (String args[])
	{
		cliente cliente1 = new cliente ("kadi",51,1123232323); // PQ QUANDO TENHO O ZERO COMO PRIMEIRO N�MERO 
		cliente cliente2 = new cliente ("Sedami",52,1124242424);// O N�MERO QUE APARECE NO CONSOLE � DIFERENTE
		
		cliente1.printacliente();
		System.out.println("\n");
		cliente2.printacliente();
		
		//alterando dados 
		
		cliente1.setCadastrocliente(1023);
		
		System.out.println("\nCadastro alterado.");
		cliente1.printacliente();
	}
}
