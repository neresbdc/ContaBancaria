package service;

public class TransacoesPadrao implements InterfaceTransacoes{

	@Override
	public Double Saque(Double saldoConta, Double valorSaque) {
		return saldoConta - valorSaque;
	}

	@Override
	public Double Deposito(Double saldoConta, Double valorDeposito) {
		return saldoConta + valorDeposito;
	}

	@Override
	public Double Imposto(Double saldoConta) {
		return saldoConta += saldoConta * 0.02;
	}

}
