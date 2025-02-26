public class Conta {
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
