
import java.sql.Connection;
import java.util.Scanner;
public class Mainn {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		do {
		System.out.println("Enter 1 for insert a recorrd");
		System.out.println("Enter 2 for delete a recorrd");
		System.out.println("Enter 3 for update a recorrd");
		System.out.println("Enter 4 for display a recorrd");
		System.out.println("Enter 5 for display all recorrd");
		int sendBack = scanner.nextInt();
		switch(sendBack) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			System.out.println("Invalid input from user");
		}
		} while (true);
	}
}
