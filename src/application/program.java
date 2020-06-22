package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();

		System.out.print("Digite o número de contribuintes: ");
		int n = sc.nextInt();
		
		for (int i=1; i <=n; i++) {
			System.out.println("Dados do #" + i + " contribuinte: ");
			System.out.print("Pessoa Física ou Jurídica (f/j)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();
			
			if (ch == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, renda, gastosSaude));
			}
			else {
				System.out.print("Número de funcionários: ");
				int nFuncionarios = sc.nextInt();			
				list.add(new PessoaJuridica(nome, renda, nFuncionarios));
			}
		}
		
		System.out.println();
		System.out.println("IMPOSTOS PAGOS");
		double sum = 0.0;
		for (Contribuinte c : list) {
			System.out.println(c.getNome() + " R$ " + String.format("%.2f", c.impostoPago()));
			sum += c.impostoPago();
		}
		System.out.println();
		System.out.printf("TOTAL DE IMPOSTOS: %.2f", sum);
		
		sc.close();
	}

}
