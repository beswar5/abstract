package Interfcepackage4;

import java.util.Scanner;

public class Operators implements Arit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Operators o= new Operators();
		System.out.println("Enter your choice");
		System.out.println("1.Arithmeticoprations\n 2.prime Number\n 3.Even Number\n 4.factorial Number");
	    System.out.println("Enter your choice:");
	    int e=sc.nextInt();
	    switch (e)
	    {
	    case 1:
	    		o.Arithmeticop();
	    		break;
	    case 2:
				o.primenum();
				break;
	    case 3 : 
				o.Evennum();
				break;
	    case 4 : //Operators o = new Operators();
				o.Factorialnum();
				break;
		default:
			System.out.println("Enter valid option");
	    }

	}

	@Override
	public void Arithmeticop() {
		// TODO Auto-generated method stub
		int a=10,b=20;
		System.out.println("Addition is:"+(a+b));
		System.out.println("subtraction is:"+(a-b));
		System.out.println("Multiplication  is:"+(a*b));
		System.out.println("Division is:"+(a/b));
		
	}

	@Override
	public void primenum() {
		// TODO Auto-generated method stub
		int n,count=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number:");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
		
	}

	@Override
	public void Evennum() {
		// TODO Auto-generated method stub
		int n;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		n=s.nextInt();
		if(n%2==0)
		{
			System.out.println(n+" is a even number");
		}
		else
		{
			System.out.println(n+" is not a even number");
		}
		
	}

	@Override
	public void Factorialnum() {
		// TODO Auto-generated method stub
		int n,pro=1;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number:");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			int p=n*i;
			pro=pro+p;
		}
		System.out.println("Factorial of a given number is:"+ pro);
		
	}

}
