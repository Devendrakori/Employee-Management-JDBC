package Client;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import Controller.EmployeeController;
import entity.Employee;

public class Client {

	public static void Menu() {
		Scanner sc = new Scanner(System.in);
		EmployeeController control = new EmployeeController();
		System.out.println("Welcome to Employee Management Project :-\n");
		try {
			while (true) {
				System.out.println("1) Show All Employee\n2) Add Employee \n3) Update\n4) Delete\n5) Exit");
				System.out.print("----------------------------------------------------------------\nEnter Choice : ");
				int n = sc.nextInt();
				System.out.print("----------------------------------------------------------------");
				System.out.println();
				switch (n) {
				case 1:
					System.out.println("All Players List :-\n-------------------");
					List<Employee> allPlayer = control.getAllEMployee();
					System.out.printf("%-5s%-20s%-25s%-10s%-15s%-7s\n\n","Id","Name","Department","Salary","Hiring Date","Address");
					for (Employee emp : allPlayer) {
						System.out.printf("%-5d%-20s%-25s%-10s%-15s%-7s\n",emp.getId(), emp.getName(), emp.getDepartment(),
								emp.getSalary(), emp.getHiring_date(), emp.getAddress());
					}
					System.out.println("----------------------------------------------------------------");
					break;
				case 2:
					System.out.print("Number of Entry : ");
					int num = sc.nextInt();
					System.out.println();
					control.insertEmployee(num);
					System.out.println("----------------------------------------------------------------");
					break;
				case 3:
					control.update();
					break;
				case 4:System.out.print("Enter Employee Id : ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.println();
					if(!control.deleteEmployee(id)) {
						System.out.println("Deleted...\n----------------------------------------------------------------");
					}else
						System.out.println("Not Deleted..\n----------------------------------------------------------------");
					break;
				case 5:
					System.out.println("Thank You For Visiting !");
					sc.close();
					System.exit(0);
				}
			}
		} catch (InputMismatchException e) {
			System.out.println(
					"----------------------------------------------------------------\nEnter Valid Data...\n----------------------------------------------------------------");
			Menu();
		}
	}
	public static void main(String[] args){
		Menu();
	}
}
