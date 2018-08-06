//Wipro program 7
import java.util.Scanner;
public class least {
void findleast(int arr[]) {
	int min = arr[0];
	for (int i=0;i<arr.length;i++) {
		if(min>arr[i])
			min=arr[i];
	}
	if(min==0)
		System.out.println(min);
	else
		System.out.println(min-1);
	}
public static void main(String args[]) {
	System.out.println("Enter 6 numbers");
	Scanner sc=new Scanner(System.in);
	int [] arr= new int[6];
	for (int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	least a=new least();
	a.findleast(arr);

	sc.close();
}
}
