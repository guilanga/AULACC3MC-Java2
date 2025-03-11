import java.util.Scanner;

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
		Cliente cliente = new Cliente();
	    int escolha;
		double saque;
		double deposito;
		conta.saldo = 0;
		boolean loop;

		System.out.println("Digite o número da conta:");
		conta.num = scan.nextInt();
		scan.nextLine();
		
        System.out.println("Digite o nome da conta:");
        cliente.nome = scan.nextLine();
        
        System.out.println("Digite o sobrenome da conta:");
        cliente.sobrenome = scan.nextLine();
        
        System.out.println("Digite o CPF da conta:");
        cliente.cpf = scan.nextLine();
        
		System.out.println("Digite o limite da conta:");
		conta.limite = scan.nextDouble();
        scan.nextLine();
        
        conta.titular = cliente;
		
		do {
			Menu();
			escolha = scan.nextInt();
			if (escolha == 1) {
			    System.out.println("\nNúmero da conta: "+conta.num);
			    System.out.println("Nome: " +conta.titular.nome +" " +conta.titular.sobrenome);
			    System.out.println("CPF: "+conta.titular.cpf);
			    System.out.println("Limite: R$"+conta.limite);
				System.out.println("Saldo: R$"+conta.saldo);
			}
			else if(escolha == 2) {
				do {
					System.out.println("Escreva o quanto deseja sacar:");
					saque = scan.nextDouble();
					loop = conta.Sacar(saque);
				} while (loop == true);
				loop = true;
				System.out.println("\nSaldo atual: R$"+conta.saldo);
			}
			else if(escolha == 3) {
				System.out.println("\nEscreva o quanto deseja depositar:");
				deposito = scan.nextDouble();
				conta.Depositar(deposito);
				System.out.println("\nSaldo atual: R$"+conta.saldo);
			}
			else if(escolha != 0) {
				System.out.println("\nEscolha inválida! Digite outro número!");
			}
		} while(escolha != 0);


	}
}
