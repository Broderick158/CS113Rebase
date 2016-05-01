import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lab3Stacks 
{
	public static void main (String[] args)
	{
		Stack<Integer> num1 = new Stack<Integer>();
		Stack<Integer> num2 = new Stack<Integer>();
		Queue<Integer> ql = new LinkedList<Integer>();
		num1.push(-1);
		num1.push(15);		
		num1.push(23);	
		num1.push(44);
		num1.push(4);	
		num1.push(99);	
//		Integer[] intArray = {-1,15,23,44,4,99};
//		for(int i = 0; i < ql.size(); i++)
//		{
//			num1.push(intArray[i]);
//		}
		System.out.println("First stack" + num1.toString());	

		while(!num1.empty())
		{
			int temp = num1.pop();
			num2.push(temp);
			ql.offer(temp);	
		}
		while(!num2.empty())
		{
			System.out.println("Second stack" + num2.pop().toString());
			System.out.println("Queue " + ql.poll().toString());
		}
	}
}