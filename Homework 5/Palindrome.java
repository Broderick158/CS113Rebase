import java.util.Stack;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		System.out.println(CheckPal("tacocat"));		 
	}
	public static boolean CheckPal (String pal) 
	{
		String pali = pal.replaceAll(" ", "");
		System.out.println(pali);
		int j = pali.length();
		
		Stack<Character> stack1 = new Stack<Character>();
		Stack<Character> stack2 = new Stack<Character>();
		
		if(j < 2)
		{
			return true; //if length is 0 or 1 it's a palindrome
		}
		for(int i = 0; i < j; i++)
		{
			stack1.push(pal.charAt(i));
		}
		for(int i = 0; i < j/2; i++)
		{
			stack2.push(stack1.pop());
		}
		if(j%2 > 0) //If the length is odd, pop off another stack
		{
			stack1.pop();
		}
		while(!stack1.isEmpty())
		{
			if(stack1.pop() != stack2.pop())
			{
				return false;
			}
		}
		
		return true;
	}
}
