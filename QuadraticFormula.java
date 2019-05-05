package example.programming;

public class QuadraticFormula {
	int QuadraticFormula(int a, int b, int c) {
	int d1=(int) 0.5;
	int x = d1*(-b + b*b - 4*a*c/b*b -4*a*c);
	int x1 = d1*(-b - b*b - 4*a*c/b*b -4*a*c);
	System.out.println("The first value of x is "+ x +" and the second value is "+x1);	
		return 0;
		
	}
}
