package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	
	//Associção 1 trabalhado para 1 departamento!
	private Department department;
	//Associação 1 trabalhador para muitos contratos!
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
	}
	
	//Contrutor não deve ter atributo do tipo Lista
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
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

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
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
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		//Instacia calendario.
		Calendar cal = Calendar.getInstance();
		// iterar todos os contratos da lista contracts
		for (HourContract c : contracts) {
			//obtem a data dos contratos.
			cal.setTime(c.getDate());
			// guarda valor do ano e mês nas variáveis
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			//testa se o mês do parâmetro é igual ao mês do contrato, caso true a soma do metodo é realizada!
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
	
}
