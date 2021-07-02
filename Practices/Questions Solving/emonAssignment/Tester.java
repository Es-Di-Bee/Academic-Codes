package emonAssignment;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the Queue");
		int size = sc.nextInt();
		
		PriorityQueue pq = new PriorityQueue(size);
		while(true) {
			System.out.println("Press 1 for Adding to the Queue");
			System.out.println("Press 2 for Removing from the Queue");
			System.out.println("Press 3 for Changing Priority of an element of the Queue");
			System.out.println("Press 0 for Exiting the System");
			int command = sc.nextInt();
			if (command == 1) {
				System.out.println("Please enter the number and the priority of the number you want to Add");
				pq.add(sc.nextInt(), sc.nextInt());
			} else if (command == 2) {
				 int removedNum = pq.remove();
				 System.out.println(removedNum);
			} else if (command == 3) {
				System.out.println("Please enter the number and the new Prioriy of that number");
				pq.changePriority(sc.nextInt(), sc.nextInt());
			} else if (command == 0) {
				break;
			} else {
				System.out.println("Wrong input. Try again\n");
			}
		}

	}

}
