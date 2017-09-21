package stack;

public class StackElement extends PushedObject {

	private Object content;
	private PushedObject previous;
	private int deepSize;
	
	
	public StackElement(Object anObject) {
		this.deepSize = 1;
		this.content = anObject;
	}
	
	@Override
	public int getDeepSize() {
		return deepSize + previous.getDeepSize();
	}
	
	@Override
	public void setPrevious(PushedObject formerTopObject) {
		this.previous = formerTopObject;
	}
	
	@Override
	public Object getRealObject(Stack stack) {
		return content;
	}

	@Override
	public PushedObject getPrevious(Stack stack) {
		return previous;
	}

}
