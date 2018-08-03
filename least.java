
public class least {
void less(int arr[]) {
	int less=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		less=(arr[i]>arr[i+1])?arr[i+1]:arr[i];
	}
	if(less>0) {System.out.println("Least="+(less-1));}
	else {System.out.println("Least="+0);}
}
public static void main(String args[]) {
	least num=new least();
	num.less(3,4,5,3,5);
}
}
