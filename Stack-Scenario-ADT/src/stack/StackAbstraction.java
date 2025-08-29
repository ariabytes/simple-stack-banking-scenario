package stack;

public interface StackAbstraction<E> {	
	
	void push (E x);
	
	E pop ();
	
	E peak(); 
		
	boolean isEmpty();
	
	int size();

}
