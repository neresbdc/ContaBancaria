package entities;

public class ContaBancariaPremium extends ContaBancariaSimples{
	
	public ContaBancariaPremium() {
		
	}

	public ContaBancariaPremium(String nome, Integer agencia, Integer conta, Double valorSaque, Double valorDeposito) {
		super(nome, agencia, conta, valorSaque, valorDeposito);
	}
	
	public String toString() {
		return "Nome: "
				+ super.getNome()
				+ "\nAgência: "
				+ (super.getAgencia() + 1000)
				+ "\nConta: "
				+ (super.getConta() + 1000)
				+ "\nSaldo: "
				+ super.getSaldoConta();
	}
	
}
