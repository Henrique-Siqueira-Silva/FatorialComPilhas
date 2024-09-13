package view;

import javax.swing.JOptionPane;

import controller.PìlhasFatorial;

public class Main {

	public static void main(String[] args) {
		PìlhasFatorial pi = new PìlhasFatorial();
		int num = 0;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para ser convertido para binario"));
		
			while ( num > 10 && num < 0) {
			System.out.println("Digite um numero de 0 a 10");
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para ser convertido para binario"));
			}
			
		
		
		long fatorial = pi.Fatorial(num);
		System.out.println(fatorial);

	}

}
