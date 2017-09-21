package stack;

public abstract class PushedObject {

	

	public abstract Object getRealObject(Stack stack);

	public abstract int getDeepSize();

	public abstract void setPrevious(PushedObject formerTopObject);

	public abstract PushedObject getPrevious(Stack stack);

}
