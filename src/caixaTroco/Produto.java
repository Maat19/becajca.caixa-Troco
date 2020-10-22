package caixaTroco;

import java.util.Scanner;

public class Produto {
	
	public double ValorProduto;
	public double ValorPagamento;
	public double Saldo;
	public Scanner Leitor = new Scanner(System.in);
	
	public void ObterProduto() {
		System.out.println("Insira o valor do produto: ");
	     ValorProduto = Leitor.nextDouble();
	     	     	}
	
	public void ObterPagamento() {
		System.out.println("Valor a Pagar:");
        ValorPagamento = Leitor.nextDouble();
	}
	 
	public void Devlucao () {
		Saldo = ValorPagamento - ValorProduto;
		
		if (Saldo > 0) {
            System.out.println("Seu troco é de : R$"+Saldo);
        } 
		if (Saldo < 0) {
			System.out.println("Valor Insufiente.");
		}
		
        else
        	System.out.println("Não Existe Troco");
							}
		
	}
		

