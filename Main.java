/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

class Conta {
    int num;
    String nome;
    double limite;
    double saldo;
    
    void Sacar(double v) {
        saldo -= v;
    }
    
    void Depositar(double v) {
        saldo += v;
    }
}



public class Main
{
    public static void Menu() {
	System.out.println("\nMenu:");
	System.out.println("\n[1] Ver conta");
	System.out.println("[2] Sacar");
	System.out.println("[3] Depositar");
	System.out.println("[0] Sair\n");
    }
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    Conta conta = new Conta();
		
		System.out.println("Digite o número da conta:");
		conta.num = scan.nextInt();

		System.out.println("Digite o limite da conta:");
		conta.limite = scan.nextDouble();

		int escolha;
		double saque;
		double deposito;
		conta.saldo = 0;
        do {
            Menu();
			escolha = scan.nextInt();
			if (escolha == 1) {
			    System.out.println("\nSaldo:"+conta.saldo);
			}
			else if(escolha == 2) {
				System.out.println("\nEscreva o quanto deseja sacar:");
				saque = scan.nextDouble();
				conta.Sacar(saque);
			}
			else if(escolha == 3) {
				System.out.println("\nEscreva o quanto deseja depositar:");
				deposito = scan.nextDouble();
				conta.Depositar(deposito);    
			}
			else if(escolha != 0) {
			    System.out.println("\nEscolha inválida! Digite outro número!");
			}
		} while(escolha != 0);

		
	}
}

