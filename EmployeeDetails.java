package week2.day1;

public class EmployeeDetails {

	public void EmployeeName(String name, int empid) {
		System.out.println("EmployeeName" + ":" + name + empid);
	}

	public void EmployeeSalary(double emps) {
		System.out.println("EmployeeSalary" + ":" + emps);
	}

	public void EmployeeAddress(String adr) {
		System.out.println("EmployeeAddress" + ":" + adr);
	}

	public void EmployeePhoneNum(long l) {
		System.out.println("EmployeePhoneNum" + ":" + l);
	}

	public static void main(String[] args) {
		EmployeeDetails em = new EmployeeDetails();
		em.EmployeeAddress("ramanathapuram");

		em.EmployeeSalary(35000.44);

		em.EmployeePhoneNum(9786844899l);

		em.EmployeeName("dhinesh", 17);

	}

}
