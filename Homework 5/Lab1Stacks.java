

import java.lang.StringBuilder;
import java.util.Stack;
public class Lab1Stacks 
{
	public static void main (String[] args)
	{
		StringBuilder sb = new StringBuilder();    
	    Stack<Character> lifo = new Stack<Character>(); //Last in, first out
		String name = "Broderick Higby";
		
		for(int i = 0; i < name.length(); i++) {
			lifo.push(name.charAt(i));
		}
		while ( !lifo.empty() )
		{
			sb.append(lifo.pop());
		}
		System.out.println(sb);
	}

}
