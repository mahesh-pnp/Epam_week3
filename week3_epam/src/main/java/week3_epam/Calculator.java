package week3_epam;

import java.util.Scanner;
public class Calculator {

	public static void main(String[] args)throws ArithmeticException {
		// TODO Auto-generated method stub
		double num1,num2,result;
		int ch;
		System.out.println("Enter number1:");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		System.out.println("Enter number2:");
		num2=sc.nextInt();
		String b="yes";
		while(b=="yes") {
		System.out.println("Enter Choice:\n");
		System.out.println("1.Addition(+)\n2.Subtraction(-)\n3.Multiplication(*)\n4.Division(/)");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
			result=Addition.addition(num1,num2);
			System.out.println(num1+"+"+num2+"="+result);
			b="No";
			break;
		case 2:
			result=Subtraction.subtraction(num1,num2);
			System.out.println(num1+"-"+num2+"="+result);
			b="No";
			break;
		case 3:
			result=Multiplication.multiply(num1,num2);
			System.out.println(num1+"*"+num2+"="+result);
			b="No";
			break;
		case 4:
			try {
			result=Division.divide(num1,num2);
			if(num2==0) {
				throw new ArithmeticException("You Should not divide a number with zero...try again!!");
			}
			System.out.println(num1+"/"+num2+"="+result);
			b="No";
			}
			catch(ArithmeticException e){
				System.out.println(e);
				System.out.println("Enter number2:");
				num2=sc.nextInt();
				b="yes";
			}
			break;
		default:
			break;
			
		}
	  }
	}

}
