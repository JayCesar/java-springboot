package application;

import java.util.ArrayList;
import java.util.List;

import entities.AccountAbstrata;
import entities.BusinessAccountAbstrata;
import entities.SavingsAccountAbstrata;

public class ProgramClassesAbstratas {

	public static void main(String[] args) {

		List<AccountAbstrata> list = new ArrayList<>();
		
		list.add(new SavingsAccountAbstrata(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccountAbstrata(1001, "Mari", 1000.00, 400.00));
		list.add(new SavingsAccountAbstrata(1004, "Bob", 300.00, 0.01));
		list.add(new BusinessAccountAbstrata(1005, "Anna", 500.00, 500.00));
		
		double sum = 0.0;
		for (AccountAbstrata acc : list) {
			sum += acc.getBalance();
		}
		
		for (AccountAbstrata acc : list) {
			acc.deposit(10.0);
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (AccountAbstrata acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}
}