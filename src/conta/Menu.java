package conta;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

import java.util.Scanner;

import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		//Teste da Classe Conta Corrente 
		ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "Mariana", 15000.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		//Teste da Classe Conta Poupança 
		ContaPoupanca cp1 = new ContaPoupanca(3, 123, 2, "Victor", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		
		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {
			
			System.out.println(Cores.TEXT_BLUE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("**********************************************************");
			System.out.println("                                                          ");
			System.out.println("                  BANCO DO BRAZIL COM Z                   ");
			System.out.println("                                                          ");
			System.out.println("**********************************************************");
			System.out.println("                                                          ");
			System.out.println("              1 - Criar Conta                             ");
			System.out.println("              2 - Listar todas as Contas                  ");
			System.out.println("              3 - Buscar Conta por Numero                 ");
			System.out.println("              4 - Atualizar Dados da Conta                ");
			System.out.println("              5 - Apagar Conta                            ");
			System.out.println("              6 - Sacar                                   ");
			System.out.println("              7 - Depositar                               ");
			System.out.println("              8 - Transferir valores entre Contas         ");
			System.out.println("              9 - Sair                                    ");
			System.out.println("                                                          ");
			System.out.println("**********************************************************");
			System.out.println("Digite a opção Desejada:                                  ");
			System.out.println("                                                          ");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
			leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "Criar Conta \n\n");
				
				break; 
			case 2:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "Lista de todas as Contas \n\n");
		
				break; 
			case 3:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "Consultar dados da Conta \n\n");
		
				break; 
			case 4:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "Atualiar dados da Conta \n\n");
		
				break; 
			case 5:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "Apagar a Conta \n\n");
		
				break; 
			case 6:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "Saque \n\n");
		
				break; 
			case 7:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "Depósito \n\n");
		
				break; 
			case 8:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "Transferência entre Contas \n\n");
		
				break; 
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
				break; 
				
			}

		}
	}
	
	public static void sobre() {
		System.out.println("\n**********************************************************");
		System.out.println("Projeto Desenvolvido por:                                   ");
		System.out.println("Verônica Santos - vevef.santos@hotmail.com                  ");
		System.out.println("https://github.com/veronicaferreiradev                      ");
	}

}
