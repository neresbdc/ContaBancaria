package service;

public interface InterfaceTransacoes {

	Double Saque(Double saldoConta, Double valorSaque);
	Double Deposito(Double saldoConta, Double valorDeposito);
	Double Imposto(Double saldoConta);
}
