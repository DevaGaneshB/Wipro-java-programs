// Program#1
import java.util.Scanner;
public class Fartocel {
double get(double far) {
	double cel=(far-32)/1.8;
	return cel;
}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Give the temprature in Farenheit");
    double far=sc.nextDouble();
    Fartocel temp = new Fartocel();
    System.out.println(temp.get(far)+"celsius") ;
    sc.close();
}
}
