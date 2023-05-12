package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker{
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	
	// Agora eu coloco as associações
	private Department department;
	List<HourContract> contracts = new ArrayList<>(); // Pelo fato de um trabalhador ter vários contratos, eu terei que representar por uma lista:
	// Pois são vários contratos;
	
	public Worker() {}

	public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
		// Eu não adiciono a lista!
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	// MÉTODOS DA CLSSE:
	
	// Eu tenho métodos responsáveis por fazer ou desfazer a associação da calsse worker com os contratos!
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		
		for (HourContract c : contracts) {
			// Agora eu vou 'setar' nesecalendário a data do contrato c:
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH); // O mês do calendar começa com zero!
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
			
		}
		return sum;
	}
	
}



