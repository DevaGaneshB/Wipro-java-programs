// Program #3
		import java.util.Scanner;
	
public class intsum {
	
		int get(int num) {
			int sum=0;
			while(num!=0) {
				sum=sum+(num%10);
				num=num/10;
			}
			return sum;
		}
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
		    int num=sc.nextInt();
		    intsum temp1 = new intsum();
		    System.out.printf("Sum=%d",temp1.get(num));
		    sc.close();
		}
	
}
