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
		if (v > (saldo + limite)) {
			System.out.println("Saldo insuficiente! Você tem R$ "+saldo);
			return true;
		}
		else if (v < 0) {
			System.out.println("Digite um valor válido");
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
	    int escolha;
		double saque;
		double deposito;
		conta.saldo = 0;
		boolean loop;

		System.out.println("Digite o número da conta:");
		conta.num = scan.nextInt();
		scan.nextLine();
		
        System.out.println("Digite o nome da conta:");
        conta.nome = scan.nextLine();
        
		System.out.println("Digite o limite da conta:");
		conta.limite = scan.nextDouble();
        scan.nextLine();
		
		do {
			Menu();
			escolha = scan.nextInt();
			if (escolha == 1) {
			    System.out.println("\nNúmero da conta: "+conta.num);
			    System.out.println("Nome: "+conta.nome);
			    System.out.println("Limite: "+conta.limite);
				System.out.println("Saldo: "+conta.saldo);
			}
			else if(escolha == 2) {
				do {
					System.out.println("\nEscreva o quanto deseja sacar:");
					saque = scan.nextDouble();
					loop = conta.Sacar(saque);
				} while (loop == true);
				loop = true;
				System.out.println("\nSaldo atual: "+conta.saldo);
			}
			else if(escolha == 3) {
				System.out.println("\nEscreva o quanto deseja depositar:");
				deposito = scan.nextDouble();
				conta.Depositar(deposito);
				System.out.println("\nSaldo atual: "+conta.saldo);
			}
			else if(escolha != 0) {
				System.out.println("\nEscolha inválida! Digite outro número!");
			}
		} while(escolha != 0);


	}
}
