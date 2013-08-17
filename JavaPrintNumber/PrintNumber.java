import java.util.*;
import java.lang.Math;

public class PrintNumber {

	private final static String[] UNITS = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	private final static String[] TENS = {"IGNORE", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	private final static String[] TEENS= {"IRNOGE", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

	public PrintNumber() {}


	public String print(int number) {

		String sNumber = "";
		String tNumber = "";
		int remainder;
		int place = 0;

		int numberLength = String.valueOf(number).length();

		for (int i = 0; i < numberLength; i++) {

			remainder = number % 10;
			number /= 10;

			if (remainder == 0 && place == 0 && number % 10 == 1)
				sNumber += "Ten" + sNumber;

			if (remainder > 0){
 				switch(place) {

 					case 0:
 						if (number % 10 == 1)
 							sNumber = TEENS[remainder] + " " + sNumber;
 						else
 							sNumber = UNITS[remainder] + " " + sNumber;
 						break;
 					case 1:
 						if (remainder != 1)
 				 			sNumber = TENS[remainder] + " " + sNumber;
 				 		break;
 				 	case 2:

 				 		if (sNumber != "")
 				 			sNumber = UNITS[remainder] + " Hundred And " + sNumber;
 				 		else
 				 			sNumber = UNITS[remainder] + " Hundred " + sNumber;
 				 		break;
 				 	case 3:
 				 		sNumber = UNITS[remainder] + " Thousand " + sNumber;
 				}
			 }
			 place++;
		}
		System.out.println(sNumber);
		return sNumber;

	}
}