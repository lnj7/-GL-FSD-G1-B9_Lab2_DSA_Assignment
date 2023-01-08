package Driver;
import java.util.Scanner;
import Solution_2.Solution2;
import Solution_1.Solution1;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Please choose the Solution  \n1 for Problem-1  \n2: for Problem-2\n");
		int check=sc.nextInt();
		
		
		switch(check) {
		case 1:
			Solution1 solution1=new Solution1();
			solution1.PayMoney();
			break;
		case 2:
			Solution2 solution2=new Solution2();
			solution2.travelorsPayment();
			break;
			default:
				System.out.print("Invalid Input! Try Again");
				break;
		}
		
		

		

		
		
	
		
		

	}

}
