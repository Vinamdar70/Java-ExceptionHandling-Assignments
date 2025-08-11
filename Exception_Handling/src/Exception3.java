
import java.util.*;
public class Exception3 {

	public static void register(int age)throws InvalidAgeException{
		if(age<0) {
			InvalidAgeException e=new InvalidAgeException("Age is Invalid");
			throw e;
		}else if(age<18){
			throw new InvalidAgeException("Not Eligible");
		}else {
			System.out.println("You are Eligible");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter your Age: ");
			Exception3.register(sc.nextInt());
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

	}

}
