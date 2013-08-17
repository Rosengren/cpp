import java.util.*;

public class main {

	public static void main(String[] args) {
		
		// test data
		int[] testNumbers = {99,100,101,9999,37,14};

		String s = "";


		PrintNumber  p = new PrintNumber();

		for (int i = 0; i < testNumbers.length; i++)
			s += p.print(i);

		System.out.println(s.length());

	}
}