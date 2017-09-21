/*
 * Developed by 10Pines SRL
 * License: 
 * This work is licensed under the 
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/3.0/ 
 * or send a letter to Creative Commons, 444 Castro Street, Suite 900, Mountain View, 
 * California, 94041, USA.
 *  
 */
package stack;

public class Stack {

	public static final String STACK_EMPTY_DESCRIPTION = "Stack is Empty";
	private PushedObject topObject;
	
	public Stack() {
		this.topObject = new StackBase();
	}

	public void push (Object anObject)
	{
		PushedObject newTop = new StackElement(anObject);
		newTop.setPrevious(topObject);
		this.topObject = newTop;
	}
	
	public Object pop()
	{
		Object last = this.topObject.getRealObject(this);
		this.topObject = topObject.getPrevious(this);
		return last;
	}
	
	public Object top()
	{
		return this.topObject.getRealObject(this);
	}

	public Boolean isEmpty()
	{
		return topObject.getDeepSize() == 0;
	}

	public Integer size()
	{
		return this.topObject.getDeepSize();
	}
	
	public Object stackIsEmptyException()
	{
		throw new RuntimeException (STACK_EMPTY_DESCRIPTION);
	}
	
}
