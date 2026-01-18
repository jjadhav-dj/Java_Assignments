package JavaDailyAssignments;

public class Employees {
	
	String[] EmpNames = {"Bharath", "ABC", "XYZ"};
	int[] EmpID = {1234, 1235, 1236};
	
	public static void main(String[] args){
		
		Employees emp = new Employees();
		System.out.println("Employee Name:"+emp.EmpNames[0]+" , "+"Employee ID: "+ emp.EmpID[0]);
		System.out.println("Employee Name:"+emp.EmpNames[1]+" , "+"Employee ID: "+ emp.EmpID[1]);
		System.out.println("Employee Name:"+emp.EmpNames[2]+" , "+"Employee ID: "+ emp.EmpID[2]);
		
		
	}
	

}


