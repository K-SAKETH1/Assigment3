package p1;
import java.util.Scanner;
public class DemoMethods6 {
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Greatest Number \n2.Smallest Number \n3.Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			if(choice>3)
			{
				System.out.println("Invalid Choice");
			}
			else if(choice==3)
			{
				System.exit(0);
				sc.close();
			}
			else if(choice>0 && choice<=2)
			{
				System.out.print("Enter first integer: ");
				int int1 = sc.nextInt();
				System.out.print("Enter second integer: ");
				int int2 = sc.nextInt();
				System.out.print("Enter third integer: ");
				int int3 = sc.nextInt();
				if(choice==1) {
					Greater g = new Greater();
					System.out.println("Greatest number:-"+g.Great(int1,int2,int3));
				}
				else
				{
					Smallest s = new Smallest();
					System.out.println("Smallest number:- "+s.Smaller(int1,int2,int3));
				}
			}
		}
	
	}
}
