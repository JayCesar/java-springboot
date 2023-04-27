package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class AppUpAndDownCasting {

	public static void main(String[] args) {

		Account acc = new Account(1011, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UP CASTING
		Account acc1 = bacc; // Isso só é possível porque a 'Account' tem a relação "é-um", ou seja, bacc é uma "Account" também!	
		
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0); // Uma BuasinessAccount também é uma Account
		
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.1); // É muito comum pegar um objeto da subclasse e atribuir ele a uma variável da super classe
	
		// DOWN CASTING
	
		BusinessAccount acc4 = (BusinessAccount) acc2; 	
		/* 
		Pelo fato de não ser uma conversão natural, eu tenho que fazer uma conversão manual
		adicionado o (BusinessAccount) antes da vaiável;
		
		Contúdo, repare que acc2 é do mesmo tipo que acc4 que eu criei, por iss dá certo!
	
		*/
		
		acc4.loan(100.00);
		
		// BusinessAccount acc5 = (BusinessAccount) acc3; Em tempo de execução esse comando não irá funcionar, pois acc3 é do tipo SavaingsAccount e não BusinessAccount!
		// Para isso eu teria que verificar SE o obejto é ou não do BusinessAccount - utilizando o método instnaceOf;
		if (acc3 instanceof BusinessAccount ) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.00);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		// Obs: eu leio o 'instanceof' como é uma isntância de?
		
	}

}
