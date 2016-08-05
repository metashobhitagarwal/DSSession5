package Concordance;

import java.util.Scanner;
/**
 * This class contains the main method 
 * that takes a string as input form the user
 * and returns the concordance of characters 
 * present in the list
 * @author shobhit agarwal
 *
 */
public class ConcordanceMain {

	public static void main(String[] args) {
		Concordance obj = new Concordance();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter input String : ");
		String str = scan.nextLine();
		System.out.println(obj.concordanceCharacter(str));
		scan.close();
		
	}

}