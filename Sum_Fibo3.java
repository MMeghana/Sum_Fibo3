package Prgs3;
import java.util.*;
public class sum_fibo3 
{
	public static void main(String[] args) 
	{
	Scanner obj = new Scanner(System.in);
	System.out.println("enter number :");  
	int n = obj.nextInt();   // n= 9
	int a=0, b=1, c= 0, sum=a+b; // sum = 1
	for(int i=2; i<=n;i++)
	{
		c=a+b; // c=1 fibo c = 34
		//sum = sum + c; // sum = 88
		a=b;
		b=c;
	}	
System.out.println("Nth fibonacci for a given number: "+c);
	}

}