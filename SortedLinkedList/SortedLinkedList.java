package SortedLinkedList;

import java.util.Scanner;

public class SortedLinkedList {
	static MyLinkList<Integer> operations = new MyLinkList<Integer>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int val;
		char ch;
		// Performing Linked list operations
		try {
			do {
				System.out.print("Enter integer value to insert : ");
				val = Integer.parseInt(scan.next());
				Node<Integer> head = operations.insert(operations.getHead(),
						val);
				operations.setHead(head);
				// Display List
				operations.display();
				System.out
						.println("\nDo you want to continue (Enter y or n) : ");
				ch = scan.next().charAt(0);
			} while (ch == 'Y' || ch == 'y');

		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Wrong insertion");
			main(args);
		}
		scan.close();
	}
}