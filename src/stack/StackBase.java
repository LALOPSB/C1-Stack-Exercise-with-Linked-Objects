package stack;

public class StackBase extends PushedObject {

	private int deepSize;
	
	public StackBase() {
		this.deepSize = 0;
	}
	
	@Override
	public int getDeepSize() {
		return deepSize;
	}
	
	public void setPrevious(PushedObject formerTopObject) {
	}
	
	public Object getRealObject(Stack stack) {
		return stack.stackIsEmptyException();
	}

	public PushedObject getPrevious(Stack stack) {
		return (PushedObject) stack.stackIsEmptyException();
	}

}
