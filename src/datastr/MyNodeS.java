package datastr;

public class MyNodeS<Ttype> {
	private Ttype element;
	private MyNodeS<Ttype> nextNode = null;
	private MyNodeS<Ttype> previousNode = null;
	
	
	public Ttype getElement() {
		return element;
	}
	public MyNodeS<Ttype> getNextNode() {
		return nextNode;
	}
	public MyNodeS<Ttype> getPreviousNode() {
		return previousNode;
	}
	
	
	public void setElement(Ttype inputElement) {
		if(inputElement != null) {
			element = inputElement;
		}
		else
		{
			element = (Ttype)new Object();
		}
	}
	
	public void setNextNode(MyNodeS<Ttype> nextNode) {
		this.nextNode = nextNode;
	}
	public void setPreviousNode(MyNodeS<Ttype> previousNode) {
		this.previousNode = previousNode;
	}
	
	
	public MyNodeS(Ttype inputElement) {
		setElement(inputElement);
	}
	
	public String toString() {
		return "" + element;
	}

	
}
