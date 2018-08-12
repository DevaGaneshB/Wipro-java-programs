// Program #2
	import java.util.Scanner;
	
public class inchtom {
	double get(double inc) {
		double m=inc *  0.0254 ;
		return m;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give the distance in inch");
	    double inc=sc.nextDouble();
	    inchtom temp1 = new inchtom();
	    System.out.printf("%fm",temp1.get(inc));
	    sc.close();
	}
}
