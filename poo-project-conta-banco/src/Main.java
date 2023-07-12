
public class Main {

	public static void main(String[] args) {
		Cliente erick = new Cliente();
		erick.setNome("Erick");

		double depositoAutomatico;
		
		Conta cc = new ContaCorrente(erick);
		Conta poupanca = new ContaPoupanca(erick);

       cc.depositar(1800);     
	   

       if (cc.saldo > 1000){

		depositoAutomatico = 0.2 * cc.saldo; // Depósito automático/recorrente de 20% do saldo da conta
		cc.transferir(depositoAutomatico, poupanca);
	}
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
