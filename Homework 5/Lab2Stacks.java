import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Vector;

public class Lab2Stacks<E> extends Vector<E>
{
	ArrayList<E> al = new ArrayList<E>();
//	String brody = "Brody";

	
	public E push (E Object)
	{//Pushes an item onto the top of this stack. 
		al.add(Object);
		return Object ;
	}
	public E pop() 
	{//Removes the object at the top of this stack and returns that object as the value of this function
	  E temp = null;
		if (isEmpty()) {
	    throw new EmptyStackException(); //"Mo money, mo problems" -Biggie Smalls
	  }
	  else
	  {
		  temp = al.get(al.size()-1);
		  al.remove(al.size()-1);
	  }
	  return temp;
	}

	public E peek()
	{//Looks at the object at the top of this stack without removing it from the stack.
		E temp = null;
		if(!isEmpty()){
			temp = al.get(al.size()-1);
		}
		return temp;
	}
}
