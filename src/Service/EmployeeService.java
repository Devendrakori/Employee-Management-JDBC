package Service;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Dao.EmployeeDao;
import entity.Employee;

public class EmployeeService {

	EmployeeDao dao = null;
	Scanner sc = new Scanner(System.in);

	public List<Employee> getAllEmployee() {
		dao = new EmployeeDao();
		List<Employee> db = dao.getAllEmployee();
		return db;
	}

	public void insertEmployee(int num) throws InputMismatchException {
		dao = new EmployeeDao();
		int count = 1;
		while (num > 0) {
			System.out.print(count + ")\nEnter Employee Id : ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println();

			System.out.print("Enter Employee name : ");
			String name = sc.nextLine();
			System.out.println();

			System.out.print("Enter Department : ");
			String dept = sc.nextLine();
			System.out.println();

			System.out.print("Enter Salary : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.println();

			System.out.print("Enter Hiring_Date(dd-mm-yyyy) : ");
			String date = sc.nextLine();
			System.out.println();

			System.out.print("Enter Address : ");
			String add = sc.nextLine();
			System.out.println();

			dao.insertEmployee(id, name, dept, salary, date, add);
			System.out.print("Inserted Successfully...\n\n");
			count++;
			num--;
		}
	}
	private void updateName(int id, String name) {
		dao = new EmployeeDao();
		dao.updateName(id, name);
	}

	private void updateDept(int id, String dept) {
		dao = new EmployeeDao();
		dao.updateDept(id, dept);
	}

	private void updateSalary(int id, int salary) {
		dao = new EmployeeDao();
		dao.updateSalary(id, salary);
	}

	private void updateHDate(int id, String date) {
		dao = new EmployeeDao();
		dao.updateHDate(id, date);
	}

	private void updateAddress(int id, String add) {
		dao = new EmployeeDao();
		dao.updateAdd(id, add);
	}
	public void update() {
		int count = 1;
		while (count>0) {
			System.out.print("Update :- \n");
			System.out.println(
					"----------------------------------------------------------------\n1) Update Name \n2) Update Department\n3) Update Salary\n4) Update Hiring Date\n5) Update Address\n6) Exit.");
			System.out.println("----------------------------------------------------------------");
			System.out.print("Enter Choice : ");
			int choice = sc.nextInt();
			System.out.println("----------------------------------------------------------------");
			switch (choice) {
			case 1:
				System.out.print("Enter Id number : ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter New Name : ");
				String nm = sc.nextLine();
				System.out.println("\nUpdated.....");
				this.updateName(id, nm);
				System.out.println("----------------------------------------------------------------");
				break;
			case 2:
				System.out.print("Enter Id number : ");
				int id1 = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter New Department : ");
				String dept = sc.nextLine();
				System.out.println("\nUpdated.....");
				this.updateDept(id1, dept);
				System.out.println("----------------------------------------------------------------");
				break;
			case 3:
				System.out.print("Enter Id number : ");
				int id2 = sc.nextInt();
				System.out.println();
				System.out.print("Enter Updated Salary : ");
				int salary = sc.nextInt();
				System.out.println("\nUpdated.....");
				this.updateSalary(id2, salary);
				System.out.println("----------------------------------------------------------------");
				break;
			case 4:
				System.out.print("Enter Id number : ");
				int id3 = sc.nextInt();
				sc.nextLine();
				System.out.println();
				System.out.print("Enter Updated Hiring Date : ");
				String date = sc.nextLine();
				System.out.println("\nUpdated.....");
				this.updateHDate(id3, date);
				System.out.println("----------------------------------------------------------------");
				break;
			case 5:
				System.out.print("Enter Id number : ");
				int id4 = sc.nextInt();
				sc.nextLine();
				System.out.println();
				System.out.print("Enter Updated Address : ");
				String add = sc.nextLine();
				System.out.println("\nUpdated.....");
				this.updateAddress(id4, add);
				System.out.println("----------------------------------------------------------------");
				break;
			case 6:
//				System.out.println("Thank You For Visiting !");
				count = 0;
			}
		}
	}
	public boolean deleteEmployee(int id) {
		dao = new EmployeeDao();
		boolean b = dao.deleteEmployee(id);
		return b;
	}
}
