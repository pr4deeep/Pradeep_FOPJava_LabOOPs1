public class CredentialApp {
		
		public static void main(String args[]) {
			Employee employee = new Employee("Pradeep","Mudaliar");
			Service s1 = new Service();
			String firstName = employee.getFirstName();
			String lastName = employee.getLastName();
			String department = s1.computeDepartment();
			
		
			if(department != "Invalid")
			{
			s1.showCredentials(employee, s1.generateEmail(firstName, lastName, department),
					s1.generatePassword());
		}
			
			else {
				System.out.println("Invalid Input, Try Again!");
			}
		}
	}

