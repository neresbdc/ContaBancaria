package service;

import entities.ContaBancariaSimples;
import entities.ContaBancariaPremium;

public class ServicoTransacao {
	
	private InterfaceTransacoes interfaceTransacoes;
	
	public ServicoTransacao() {
		
	}
	
	public ServicoTransacao(InterfaceTransacoes interfaceTransacoes) {
		super();
		this.interfaceTransacoes = interfaceTransacoes;
	}

	public void SaqueContaBancariaSimples(ContaBancariaSimples ContaBancariaSimples) {
		Double saqueContaSimples = interfaceTransacoes.Saque(ContaBancariaSimples.getSaldoConta(), ContaBancariaSimples.getValorSaque());
		ContaBancariaSimples.setSaldoConta(saqueContaSimples);
	}
	
	public void DepositoContaBancariaSimples(ContaBancariaSimples ContaBancariaSimples) {
		Double depositoContaSimples = interfaceTransacoes.Deposito(ContaBancariaSimples.getSaldoConta(), ContaBancariaSimples.getValorDeposito());
		ContaBancariaSimples.setSaldoConta(depositoContaSimples);
	}
	
	public void SaqueContaBancariaPremium(ContaBancariaPremium ContaBancariaPremium) {
		Double saqueContaPremium = interfaceTransacoes.Saque(ContaBancariaPremium.getSaldoConta(), ContaBancariaPremium.getValorSaque());
		ContaBancariaPremium.setSaldoConta(saqueContaPremium);

	}
	
	public void DepositoContaBancariaPremium(ContaBancariaPremium ContaBancariaPremium) {
		Double depositoContaPremium = interfaceTransacoes.Deposito(ContaBancariaPremium.getSaldoConta(), ContaBancariaPremium.getValorDeposito());
		ContaBancariaPremium.setSaldoConta(depositoContaPremium);
	}
	
	public void ImpostoContaPremium(ContaBancariaPremium ContaBancariaPremium) {
		Double calculoImposto = interfaceTransacoes.Imposto(ContaBancariaPremium.getSaldoConta());
		ContaBancariaPremium.setSaldoConta(calculoImposto);
	}
	
}
