package udemy_java;

//Never forget the base case in a factorial, otherwise -> stack Overflow

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(1));
		System.out.println(factorial(2));
		System.out.println(factorial(3));
		System.out.println(factorial(4));
		System.out.println(factorial(5));
	}

	/**
	 * Factorial method of a number
	 * @param num
	 * @return the result of a number factorial
	 */
	public static int factorial(int num) {
		//base case/end condition
		if (num == 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}

}
