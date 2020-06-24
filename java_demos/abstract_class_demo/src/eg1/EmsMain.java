package eg1;

public class EmsMain {
	public static void main(String[] args) {
		
		EMS ems= new BNPEmployee();
		ems.addEmployee();
		ems.updateEmployee();
		ems.getAllEmployees();
		ems.getEmployeeById(11);
		ems.deleteEmployee();
		
		System.out.println();
		EMS simplilearn=new SimplilearnEmployee();
		simplilearn.addEmployee();
		
	}
}
