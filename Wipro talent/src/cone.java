import java.util.Scanner;
//wipro program 10

public class cone {
	void conedim(double R,double H) {
		System.out.println("Surface area="+(3.14 * R * (R + Math.sqrt(R*R + H*H))));
		System.out.println("Volume="+(1.0/3.0*3.14*R*R*H));
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius and height of cone");
		double R=sc.nextDouble();
		double H=sc.nextDouble();
		new cone().conedim(R,H);

		sc.close();
	}

}
