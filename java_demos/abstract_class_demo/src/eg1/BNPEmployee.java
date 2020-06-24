package eg1;

public class BNPEmployee extends EMS {

	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		System.out.println("BNP Employee added to Oracle DB");
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		System.out.println("BNP Employee updated in Oracle DB");
	}

	@Override
	public void getEmployeeById(int id) {
		System.out.println("BNP Employee by id retrieved from Oracle DB");
		
	}

	@Override
	public void getAllEmployees() {
		System.out.println("BNP All Employees retrieved from Oracle DB");
		
	}

	@Override
	public void deleteEmployee() {
		System.out.println("BNP Employee removed to Oracle DB");
		
	}

}
