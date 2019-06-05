package com.br.zup;


import java.util.Scanner;

public class Sequencia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		
		System.out.println(" Digite primeiro numero");
		int controle = scan.nextInt();
	 
		System.out.println(" Digite ultimo numero");
		int numeroSaida =scan.nextInt();
	
		for (int  cont = controle; cont <= numeroSaida; cont ++) {
			System.out.print(cont + ",");




	  }
	}
}
