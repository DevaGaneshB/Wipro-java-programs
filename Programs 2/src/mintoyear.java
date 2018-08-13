	// Program #4
			import java.util.Scanner;
		
public class mintoyear {

			void get(int num) {
				int year=0;
				int day=0;
				year=(num/(365*24*60));
				day=((num%(24*60*365))/(60*24));
				System.out.printf("Year=%d\t Days=%d",year,day);
				
				}
			public static void main(String args[]) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a number");
			    int min=sc.nextInt();
			    mintoyear temp1 = new mintoyear();
			    temp1.get(min);
			    sc.close();
			}
		


}
