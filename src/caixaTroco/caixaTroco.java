package caixaTroco;
 
import java.util.Scanner;


public class caixaTroco {

	public static void main(String[] args) {
					
		Produto produto =new Produto();
	       	   
		produto.ObterProduto();
					       			
		do {
	          produto.ObterPagamento();
	           
	          if (produto.ValorPagamento == 0)
	          break;
	          
	          produto.Devlucao();
	          
	       	
	}while (produto. ValorPagamento != 0);
		
	}
	}
	
	          	
	          	
	            
	           	            
	