package JavaDailyAssignments;

public class Assignment7 {

	public static void main(String[] args) {
		double income = 50000.0;
		int creditScore = 720;
		String custName = "John";
		double debtAmt = 40.0;
		boolean isEmployed;

		if (creditScore > 720) {
			System.out.println("Credit score is good loan is approved.");
		} else if (creditScore >= 650) {
			if (income >= 30000) {
				if (isEmployed=true) {
					if (debtAmt < 40.0) {
						System.out.println("Loan approved...!");

					} else {
						System.out.println("Loan denied not employeed");
					}
					System.out.println("Loan denied not meet income");
				}
				System.out.println("Loan denied credit score not good");
			}

			
		}
		System.out.println("Customer " + custName + " is Eligible for loan");
		
	}
	
}



