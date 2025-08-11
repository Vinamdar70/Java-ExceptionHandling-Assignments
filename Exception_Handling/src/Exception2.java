import java.util.*;

public class Exception2 {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Index");
		int i=sc.nextInt();
		try {
		System.out.println(arr[i]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index! Please enter between 0 and 4");
		}finally {
			System.out.println("Program execution completed...");
		}

	}

}
