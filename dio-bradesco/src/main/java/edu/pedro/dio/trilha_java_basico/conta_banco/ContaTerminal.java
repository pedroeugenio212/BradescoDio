package edu.pedro.dio.trilha_java_basico.conta_banco;

import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	
	System.out.println("Por favor, digite o número da Agência!");
	int numero = scanner.nextInt();
	scanner.nextLine();
		
	System.out.println("Por favor, digite o nome da Agência!");
	String agencia = scanner.nextLine();
	
	System.out.println("Por favor, digite o nome do Cliente!");
	String nomeCliente = scanner.nextLine();
	
	System.out.println("Por favor, digite o saldo do Cliente!");
	Double saldo = scanner.nextDouble();
	
	System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                          "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + 
                          saldo + " já está disponível para saque");
	
    }
}
