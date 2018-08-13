// Program#6
import java.util.Scanner;
public class BMI {

    public static void main(String[] Strings) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input weight in pounds: ");
        double weight = sc.nextDouble();

        System.out.print("Input height in inches: ");
        double inches = sc.nextDouble();

        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.print("Body Mass Index is " + BMI+"\n");
    }
}