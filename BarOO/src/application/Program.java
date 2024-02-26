package application;

import java.util.Locale;
import java.util.Scanner;

import util.Bill;

public class Program {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.err.print("Sexo: ");
		Bill.gender = sc.next().charAt(0);
		
		System.err.print("Quantidade de cervejas: ");
		 Bill.beer = sc.nextInt();
		
		System.err.print("Quantidade de refrigerantes: ");
		 Bill.softDrink = sc.nextInt();
		
		System.err.print("Quantidade de espetinhos: ");
		 Bill.barbecue = sc.nextInt();

	      System.out.println("\nRELATÓRIO: ");
	        System.out.printf("Consumo = R$ %.2f%n",Bill.feeding());

	        if(Bill.feeding() < 30.0) {
	            System.out.printf("Couvert = R$ %.2f%n", Bill.cover());
	        }
	        else {
	            System.out.println("Insento de Couvert");
	        }

	        System.out.printf("Ingresso = R$ %.2f%n", Bill.ticket());
	        System.out.println();
	        System.out.printf("Valor a pagar = R$ %.2f%n", Bill.total());
        
       
        
//  
//		System.out.println("Sexo " + gender + " cervejas " + beer + 
//				" refrigerantes " + softDrink + " espetinhos " + barbecue);
//        
		sc.close();

	}

}
