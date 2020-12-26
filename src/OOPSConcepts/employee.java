package OOPSConcepts;

public class employee {
	
	int eno;
	String ename;
	float salary;
	
	public employee(int empno, String empname, float empsalary) {
		this.eno = empno;
		this.ename = empname;
		this.salary = empsalary;
		
		System.out.println(eno);
		System.out.println(ename);
		System.out.println(salary);
	}
	

	public static void main(String[] args) {
		employee obj = new employee(10,"praveen", 5000f);

	}

}
