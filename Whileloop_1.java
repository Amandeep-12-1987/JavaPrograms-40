package javaprograms;

public class Whileloop_1 
{

	public static void main(String[] args) 
	{
		int a=10;
		while(a>5)//while loop is used when we are not aware the number of iteration to be done
		{
			System.out.println(a);
			a--;
			break;//is used for coming out of the loop
		}
		while(a>4)
		{
			System.out.println(a);
			a--;//in this iteration will continue till a>4
			
		}
		int j;
		//for loop is used when we are aware the number of iteration to be done
		for(j=a;a<=15;a++)
		{
			System.out.println(a);
			
		}
     }

}
