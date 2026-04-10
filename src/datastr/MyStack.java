package datastr;

public class MyStack<Ttype> {
	private MyNodeS<Ttype> topNode = null ;
	private int length;
	
	
	public MyStack() {
		length = 0;
	}
	
	public boolean isEmpty() {
		return (length == 0);
	}
	
	public boolean isFull() {
		try
		{
			new MyNodeS<Character>('A');
			return false;
		}
		catch (OutOfMemoryError e) {
			return true;
		}
	}
	
	public int howManyElements() {
		return length;
	}
	
	public void push() {
		
	}
	public void pop() {
		
	}
	public void top() {
		
	}
	public void print() {
		
	}
}
