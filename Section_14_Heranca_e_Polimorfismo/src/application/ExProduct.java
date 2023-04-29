package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ExProduct {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> listP = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			System.out.println("Produt #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				listP.add(new ImportedProduct(name, price, customsFee));
			}
			else if(ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String manufactureDate = sc.next();
				listP.add(new UsedProduct(name, price, sdf.parse(manufactureDate)));
			}
			else{
				listP.add(new Product(name, price));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product p : listP) {
			/*if (p instanceof ImportedProduct) {
				System.out.println(p.getName() + p.getClass().total );
			}*/
			System.out.println(p.getName() + " " + p.priceTag());
		}
		sc.close();

	}
	

}
