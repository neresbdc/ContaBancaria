package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancariaPremium;
import entities.ContaBancariaSimples;
import service.ServicoTransacao;
import service.TransacoesPadrao;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("=========================================");
		System.out.println("============ Banco Santander ============");
		System.out.println("=========================================");
		
		System.out.println("\n- Seja bem vindo! O que deseja fazer?");
		System.out.print("[1] Abrir uma nova conta\n" 
				+ "[2] Sair\n"
				+ "Opção -> ");
		Integer opcao = 0;
		
		do {
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.print("Digite seu nome completo: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("\nQual será o tipo da conta?\n"
						+ "[1] Conta Bancária Simples\n"
						+ "[2] Conta Bancária Premium\n"
						+ "[3] Sair\n"
						+ "Opção -> ");
				Integer opcaoConta = 0;
				
				do {
					opcaoConta = sc.nextInt();
					switch (opcaoConta) {
					case 1:
						ContaBancariaSimples contaBancariaSimples = new ContaBancariaSimples(nome, 0001, 000001, 0.0, 0.0);
						System.out.println();
						System.out.println("CONTA CRIADA COM SUCESSO!");
						System.out.println("Dados da conta SIMPLES");
						System.out.println(contaBancariaSimples);
						System.out.println();
						System.out.println("Primeiro acesso é necessário depósito mínimo de R$50.00 reais.");
						System.out.print("Digite o valor do primeiro depósito: R$ ");
						Double valorPrimeiroDeposito = sc.nextDouble();
						ServicoTransacao servicoTransacao = null;
						
						while (valorPrimeiroDeposito < 50.0) {
							System.out.println();
							System.out.println("ERRO. VALOR INFERIOR AO DEPÓSITO MÍNIMO!");
							System.out.print("Digite o valor do primeiro depósito: R$ ");
							valorPrimeiroDeposito = sc.nextDouble();
						}
						
						contaBancariaSimples.setValorDeposito(valorPrimeiroDeposito);
						servicoTransacao = new ServicoTransacao(new TransacoesPadrao());
						servicoTransacao.DepositoContaBancariaSimples(contaBancariaSimples);
						System.out.println();
						System.out.println(contaBancariaSimples);
						
						for (int a=1; a<=2; a++) {
							System.out.println("[1] Saque.\n"
									+ "[2] Deposito.\n"
									+ "[3] Sair.");
							Integer opcaoSDS = sc.nextInt();
							
							switch (opcaoSDS) {
							case 1: 
								System.out.print("Digite o valor do Saque: R$ ");
								Double valorSaqueContaSimples = sc.nextDouble();
								
								if (valorSaqueContaSimples > contaBancariaSimples.getSaldoConta()) {
									System.out.println("Erro. Valor de saque maior que o saldo da conta.");
									System.out.println("Refaça a Operação!\n");
									a--;
								} else {
									contaBancariaSimples.setValorSaque(valorSaqueContaSimples);
									servicoTransacao.SaqueContaBancariaSimples(contaBancariaSimples);
									System.out.println(contaBancariaSimples);
									a--;
								}
								
								break;
								
							case 2:
								System.out.print("Digite o valor do Deposito: R$ ");
								Double valorDepositoContaSimples = sc.nextDouble();
								contaBancariaSimples.setValorDeposito(valorDepositoContaSimples);
								servicoTransacao.DepositoContaBancariaSimples(contaBancariaSimples);
								System.out.println(contaBancariaSimples);
								a--;
								break;
								
							case 3:
								System.out.println("Agradecemos a preferência. Até a próxima!");
								a++;
								break;
							
							default:
								System.out.println("ERRO! Opção digitada incorreta. Informe novamente uma opção válida.");
								a--;
								break;
							}
						}
						break;
						
					case 2:
						
						ContaBancariaPremium contaBancariaPremium = new ContaBancariaPremium(nome, 0001, 000001, 0.0, 0.0);
						System.out.println();
						System.out.println("CONTA CRIADA COM SUCESSO!");
						System.out.println("Dados da conta PREMIUM");
						System.out.println(contaBancariaPremium);
						System.out.println();
						System.out.println("Primeiro acesso é necessário depósito mínimo de R$50.00 reais.");
						System.out.print("Digite o valor do primeiro depósito: R$ ");
						valorPrimeiroDeposito = sc.nextDouble();
						servicoTransacao = null;
						
						while (valorPrimeiroDeposito < 50.0) {
							System.out.println();
							System.out.println("ERRO. VALOR INFERIOR AO DEPÓSITO MÍNIMO!");
							System.out.print("Digite o valor do primeiro depósito: R$ ");
							valorPrimeiroDeposito = sc.nextDouble();
						}
						
						contaBancariaPremium.setValorDeposito(valorPrimeiroDeposito);
						servicoTransacao = new ServicoTransacao(new TransacoesPadrao());
						servicoTransacao.DepositoContaBancariaPremium(contaBancariaPremium);
						System.out.println();
						System.out.println(contaBancariaPremium);
						
						for (int a=1; a<=2; a++) {
							System.out.println("[1] Saque.\n"
									+ "[2] Deposito.\n"
									+ "[3] Sair.");
							Integer opcaoSDS = sc.nextInt();
							
							switch (opcaoSDS) {
							case 1:
								System.out.print("Digite o valor do Saque: R$ ");
								Double valorSaqueContaPremium = sc.nextDouble();
								
								if (valorSaqueContaPremium > contaBancariaPremium.getSaldoConta()) {
									System.out.println("Erro. Valor de saque maior que o saldo da conta.");
									System.out.println("Refaça a Operação!\n");
									a--;
								} else {
									contaBancariaPremium.setValorSaque(valorSaqueContaPremium);
									servicoTransacao.SaqueContaBancariaPremium(contaBancariaPremium);
									System.out.println(contaBancariaPremium);
									a--;
								}
								
								break;
								
							case 2:
								System.out.print("Digite o valor do Deposito: R$ ");
								Double valorDepositoContaSimples = sc.nextDouble();
								contaBancariaPremium.setValorDeposito(valorDepositoContaSimples);
								servicoTransacao.DepositoContaBancariaPremium(contaBancariaPremium);
								System.out.println(contaBancariaPremium);
								a--;
								break;
								
							case 3:
								System.out.println("Agradecemos a preferência. Até a próxima!");
								a++;
								break;
								
							default:
								System.out.println("ERRO! Opção digitada incorreta. Informe novamente uma opção válida.");
								a--;
								break;
							}
						}
						break;
						
					case 3: 
						System.out.println("Agradecemos a preferência. Até a próxima!");
						break;
						
					default:
						System.out.println("ERRO! Opção digitada incorreta.");
						System.out.print("\nDigite corretamente o tipo da conta desejada.\n"
								+ "[1] Conta Bancária Simples\n"
								+ "[2] Conta Bancária Premium\n"
								+ "[3] Sair\n"
								+ "Opção -> ");
						break;
					}
					
				} while (opcaoConta != 3);
		
			case 2:
				System.out.println("\nAgradecemos a preferência. Até a próxima!");
				break;
				
			default:
				System.out.println("\nOpção Incorreta! Digite uma opção válida");
				System.out.print("[1] Abrir uma nova conta\n" 
						+ "[2] Sair\n"
						+ "Opção -> ");
			break;
			}
			
		} while (opcao != 2);

		sc.close();
	}

}
