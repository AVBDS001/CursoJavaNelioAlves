package entities;

public class Worker {
	private String name;
	private Double grossSalary;
	private Double tax;
	
	public Worker(String name, Double grossSalary, Double tax) {
		super();
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Double getGrossSalary() {
		return grossSalary;
	}
	public Double getTax() {
		return tax;
	}
	
	public double netSalary(Double grossSalary, Double tax) {
		return grossSalary - tax;
	}
	
	public void increaseSalary(Double percentage) {
		this.grossSalary *= (1 + percentage / 100);
	}
	
	@Override
	public String toString() {
		return name + " , $ " + String.format("%.2f", netSalary(grossSalary,tax));
	}
}
