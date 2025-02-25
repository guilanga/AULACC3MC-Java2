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

	boolean Sacar(double v) {
		if (v > saldo) {
			System.out.println("Saldo insuficiente! VocC* tem R$"+saldo);
			return true;
		}
		else if (v < 0) {
			System.out.println("Digite um valor vC!lido");
			return true;
		}
		else {
			saldo -= v;
			return false;
		}
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

		System.out.println("Digite o nC:mero da conta:");
		conta.num = scan.nextInt();

		System.out.println("Digite o limite da conta:");
		conta.limite = scan.nextDouble();

		int escolha;
		double saque;
		double deposito;
		conta.saldo = 0;
		boolean restart;
		do {
			Menu();
			escolha = scan.nextInt();
			if (escolha == 1) {
				System.out.println("\nSaldo: "+conta.saldo);
			}
			else if(escolha == 2) {
				do {
					System.out.println("\nEscreva o quanto deseja sacar:");
					saque = scan.nextDouble();
					restart = conta.Sacar(saque);
				} while (loop == true);
				loop = true;
				System.out.println("\nSaldo atual: "+conta.saldo);
			}
			else if(escolha == 3) {
				System.out.println("\nEscreva o quanto deseja depositar:");
				deposito = scan.nextDouble();
				conta.Depositar(deposito);
			}
			else if(escolha != 0) {
				System.out.println("\nEscolha invC!lida! Digite outro nC:mero!");
			}
		} while(escolha != 0);


	}
}
