package javaprograms;

import java.util.Scanner;

public class Switch_1 
{
//keywords switch case default and break
	public static void main(String[] args) 
	{
		int a;
		Scanner s1=new Scanner(System.in);
		a=s1.nextInt();
		switch(a)
		{
		case 1:
        System.out.println("launch Mozilla Browser");
		case 2:
        System.out.println("launch Chrome Browser");
		case 3:
	    System.out.println("launch Internet Explorer");
	    break;//is used to come out of that case
		default://is used to run the case anyways even if you are choosing the wrong number
	    System.out.println("oops wrong browser");

		}

	}

}
