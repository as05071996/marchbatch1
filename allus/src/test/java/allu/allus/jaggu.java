package allu.allus;
import java.util.*;
import java.util.Scanner;
import java.util.Scanner.*;
import java.lang.*;

public class jaggu {

	//public static void main(String[] args) {
		/*float a=20,b=15;
		float c1=a/b;
		float c2=a%b;
		System.out.println("value of c1 is "+c1);
		System.out.println("value of c1 is "+c2);*/
	  /*  float b,h;
        System.out.println("enter b and h value ");
        Scanner sc=new Scanner(System.in);
        b=sc.nextFloat();
        h=sc.nextFloat();
        
        float c=b*h/2;
        System.out.println("area of triangle is "+c);*/
		
		/*int a,b,c;
		System.out.println("enter the value of a,b,c");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		float s=(a+b+c)/2f;
	    double Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	    System.out.println("area of circle is"+ Area);*/
		
	/*	int a,b,c;
		double r1,r2;
		System.out.println("enter the value of a,b,c");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		r1=(-b+ Math.sqrt(b*2-4*a*c))/(2*a);
		r2=(-b- Math.sqrt(b*2-4*a*c))/(2*a);
		System.out.println("root are"+r1+" " +r2);
		*/
		
		//find the area and volume  of cubed 
		/*int l,b,h,area;
		System.out.println("enter value of l,b,h");
		Scanner sc =new Scanner(System.in);
	    l=sc.nextInt();
		b=sc.nextInt();
		h=sc.nextInt();
		int volume=l*b*h;
		System.out.println("volume is "+ volume );
	    area=2*(l*h+h*b+l*b);
	    System.out.println("area is "+ area);*/
	    
		
		
		//1:-(((10+2)+2)-2)*2)/2)
		
		/*public int sum(int a,int b) {
			int c;
			c=a+b;
			
			System.out.println("sum result is "+c);
			return c;
		}
			public int sub(int a1,int b1) {
				int c1;
				c1=a1-b1;
				System.out.println("sub result is "+c1);
				return c1;
			}
			
			public int multi(int a2,int b2) {
				int c2;
				c2=a2*b2;
				System.out.println("multi result is "+c2);
                return c2;
			}
			public void div(int a3,int b3) {
				int c3;
				c3= a3/b3;
				System.out.println("div result is "+c3);		
			}
			
			public static void main(String[] args) {
				jaggu abc=new jaggu();
			int sumresult=abc.sum(10, 2);
			int sumresult2=abc.sum(sumresult, 2);
			int subresult=abc.sub(sumresult2, 2);
			int multiresult=abc.multi(subresult, 2);
			    abc.div(multiresult, 2);
			   } */
			
	
	//2:- (((10/2)-2)+2)-2)*2)
	
	/*public int div(int a,int b) {
		int c;
		c=a/b;
		System.out.println("div result is "+c);
		return c;
	}
	public int sub(int a1,int b1) {
		int c1;
		c1=a1-b1;
		System.out.println("sub result is "+c1);
		return c1;
	}
	public int sum(int a2,int b2) {
		int c2;
		c2=a2+b2;
		System.out.println("sum result is "+c2);
		return c2;
	}
	public void multi(int a3,int b3) {
		int c3;
		c3=a3*b3;
		System.out.println("multi result is "+c3);
	}
	public static void main(String[] args) {
		jaggu abc =new jaggu();
		int divresult=abc.div(10, 2);
		int subresult=abc.sub(divresult, 2);
		int sumresult=abc.sum(subresult, 2);
		int subresult2=abc.sub(sumresult, 2);
		abc.multi(subresult2, 2);
	}*/
	
	
	
	/*public static void main(String[] args) {
		int a=10,b=15;
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("value of a is "+a+"and b is"+b);
	}*/
	
	
	//swipe of two variable 
	/*public static void main(String[] args) {
		
		int a=10,b=15,c;
		c=a;
		a=b;
		b=c;
		System.out.println("value of a and b is "+a+"and"+b);
		
		}*/
		/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		int len=s.length();
		//System.out.println(s+" lenth of the string is "+len);
		char ch =s.charAt(5);
	//	System.out.println(ch);
	    int ind=s.indexOf('g');
	    System.out.println(ind);*/
		
	public jaggu(int a,int b,int c) {
		this(96,97);
		System.out.println("three parameterised constructor ");
	}
	
	public jaggu() {
	
		System.out.println("default constructor");
	}
	public jaggu(int a) {
		this();
		System.out.println("one parameterised constructor ");
	}
	public jaggu(int a,int b,int c,int d) {
		this(96,97,98);
		System.out.println("four parameterised constructor ");
	}
	public jaggu(int a,int b) {
		this(96);
		System.out.println("two parameterised constructor ");
	}
	
	public static void main(String[] args) {
		
	
			jaggu abc=new jaggu(96,97,98,99);
		}
		
	
}
		
		
	
	


