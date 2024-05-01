package exceptions;

public class VotingApp {
	public void validate(int age) throws InvalidAgeException{		
		if(age<18)
			throw new InvalidAgeException(age+": is not valid age ");
		else
			System.out.println("Welcome to vote1");
	}

	public static void main(String[] args) {
		VotingApp v1 = new VotingApp();
		try {
		v1.validate(21); // 
		v1.validate(15);
		}catch(Exception e) {
			System.err.println(e);
		}
        finally{
        	if(v1 != null)
        		v1 = null;
        	System.out.println("Resource closed!");
        }
		System.out.println("Rest of the code follows.....");	}

}
