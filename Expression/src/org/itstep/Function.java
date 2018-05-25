package org.itstep;

public class Function {

public int x = 4;
	
	public int getFunction() {
		Factorial factorial = new Factorial();
		int result =(x + 8)*factorial.getFactorial(x);
		return result;
	}
}
