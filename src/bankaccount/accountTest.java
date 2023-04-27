package bankaccount;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class accountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		account account1 = new account(55.44);
		account account2 = new account(34.55);
		
		System.out.println("Balance de la cuenta" +account1.getBalance());
		//String input2= JOptionPane.showInputDialog("ingrese el valor a consignar de la cuenta 1");
		
		Scanner input = new Scanner (System.in);
		double deposAmount;
		System.out.println("ingrese el valor a consignar en la cuenta 1 ");
		deposAmount= input.nextDouble();
		account1.credit(deposAmount);
		System.out.println("saldo en la cuenta actual es");
		System.out.println(account1.getBalance());
	  //  System.out.printf(" saldo %.2f\n "+ account1.getBalance());
		
	//	System.out.println("ingrese el valor a consignar en la cuenta 2");
		//deposAmount= input.nextDouble();
	}
	

}
