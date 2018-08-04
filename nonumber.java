import java.util.*;
public class nonumber 
{
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int[] arr=new int[15];
		int i,j=0;       
		System.out.println("Enter the 15 values=");
		for(i=0;i<15;i++)
		{
			arr[i]=s.nextInt();
		}
		
		for(i=0;i<15;i++)
		{
			if(arr[i]%3==0)
			{
				j++;
				System.out.println(a[i]);			
	
			}
			
		}
		if(j==0){System.out.println("No number is divisible");}
	}
}
