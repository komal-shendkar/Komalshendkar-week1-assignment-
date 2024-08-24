package xenosisinternshipprojectpackage;

import java.util.Scanner;

public class calculatorswitch {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no=");
		double num1=sc.nextDouble();
		
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter second no=");
		double num2=sc.nextDouble();

    	System.out.println("Enter Operator");
		char operator=sc.next().charAt(0);
		
		double result;
		
		switch(operator)
		{
		case '+':
		    {
			       result=num1+num2;
			       System.out.println("result of addition is="+result);
			       break;
		    }
		    
		case '-':
	        {
		           result=num1-num2;
		           System.out.println("result of subtraction is="+result);
		           break;
	        }  
		case '*':
	        {
		           result=num1*num2;
		           System.out.println("result of multiplication is="+result);
		           break;
	        }
		case '%':
	        {
	    	       if(num2 != 0)
	    	           {
	    		          result=num1%num2;
			              System.out.println("result of division is="+result);
			             
	    	           }
	    	       else
	    	           {
	    		          System.out.println("Division by zero not allowed");
	    	           }
	    	       break;
		       
	        }
	     default:
	     {
	    	 System.out.println("Invalid operator");
	    	 break;
	     }
	        

	}

}
}
