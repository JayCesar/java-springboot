package application;

import java.util.ArrayList;
import java.util.List;

public class ProgramWildCards {
	
	public static void main(String[] args) {
		
		List<?> myObjs = new ArrayList<>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers; 

	}
}
	