package main;

import stack.*;	

public class Main {

	public static void main(String[] args) {
		// using the interface as the type
		StackAbstraction<String> stack = new StackImplementation<String>();
		
		// adding transaction history to the ArrayList
		stack.push("Deposit:\tPHP 9,000,000.00");
		stack.push("Withdraw:\tPHP 10,000.00");
		stack.push("Withdraw:\tPHP 500,000.00");
		stack.push("Withdraw:\tPHP 3,000,000.00");
		stack.push("Deposit:\tPHP 11,045,069.00");
		stack.push("Withdraw:\tPHP 5,000,000.00");
		
		// shows recorded history as a string from the ArrayList
		System.out.println("Transactions Recorded: ");
		System.out.println(stack);
		
		// shows the "peak" or "top" of the stack or the most recent transaction or last data added
		System.out.println("Most Recent Transaction: ");
		System.out.print(stack.peak() + "\n");
		
		// removing the "top" of the stack
		System.out.println("\nUndoing the Most Recent Transaction: \n" + stack.peak());
		stack.pop();
		
		System.out.println("\nUndoing the Most Recent Transaction: \n" + stack.peak());
		stack.pop();
		
		System.out.println("\nUndoing the Most Recent Transaction: \n" + stack.peak());
		stack.pop();
		
		// showing the remaining transaction recorded after removing the three most recent transaction
		System.out.println("\nRemaining Transactions Recorded: ");
		System.out.println(stack);
		
	}

}
