package entities;

public class ContaBancariaSimples {
	
	private String nome;
	private Integer agencia;
	private Integer conta;
	protected Double saldoConta = 0.0;
	private Double valorDeposito;
	private Double valorSaque;

	public ContaBancariaSimples() {
		
	}

	public ContaBancariaSimples(String nome, Integer agencia, Integer conta, Double valorSaque, Double valorDeposito) {
		super();
		this.nome = nome;
		this.agencia = agencia;
		this.conta = conta;
		this.valorDeposito = valorDeposito;
		this.valorSaque = valorSaque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public Double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(Double saldoContaBancaria) {
		this.saldoConta = saldoContaBancaria;
	}

	public Double getValorDeposito() {
		return valorDeposito;
	}

	public void setValorDeposito(Double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}

	public Double getValorSaque() {
		return valorSaque;
	}

	public void setValorSaque(Double valorSaque) {
		this.valorSaque = valorSaque;
	}

	public String toString() {
		return "\nNome: "
				+ nome
				+ "\nAgência: "
				+ (agencia + 1000)
				+ "\nConta: "
				+ (conta + 1000)
				+ "\nSaldo: R$"
				+ String.format("%.2f", saldoConta);
	}
}
