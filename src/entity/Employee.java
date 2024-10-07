package entity;

public class Employee {

	private int id;
	private String name;
	private String department;
	private int salary;
	private String hiring_date;
	private String address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String department, int salary, String hiring_date, String address) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.hiring_date = hiring_date;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getHiring_date() {
		return hiring_date;
	}
	public void setHiring_date(String hiring_date) {
		this.hiring_date = hiring_date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
