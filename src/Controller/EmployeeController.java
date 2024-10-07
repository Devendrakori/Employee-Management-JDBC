package Controller;

import java.util.List;
import Service.EmployeeService;
import entity.Employee;

public class EmployeeController {

	EmployeeService service = null;
	
	public List<Employee> getAllEMployee()
	{
		service = new EmployeeService();
		List<Employee> db = service.getAllEmployee();
		return db;
	}
	public void insertEmployee(int num)
	{
		service = new EmployeeService();
		service.insertEmployee(num);
	}
	public boolean update()
	{
		service = new EmployeeService();
		service.update();
		return true;
	}
	public boolean deleteEmployee(int id) {
		service = new EmployeeService();
		boolean b = service.deleteEmployee(id);
		return b;
	}
}
