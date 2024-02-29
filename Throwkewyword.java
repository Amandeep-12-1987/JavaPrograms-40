package javaprograms;

public class Throwkewyword 
{

	public static void main(String[] args) 
	{
		//throw keyword should be written inside method
		//throw is a keyword which throw an exception
		//one line of throw can throw only one exception
		//throw new ArithmeticException();or throw new Arithmetic Exception("1 cannot be divided by zero");
		int a=10;
		int b=a/0;
		System.out.println(b);
		throw new ArithmeticException("10/0 is infinite");
	}
	
	
}


