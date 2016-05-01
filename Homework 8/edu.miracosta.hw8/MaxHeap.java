package homework7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MaxHeap 
{
	public ArrayList<Integer> maxList;
	public Comparator<Object> order;
	
	public MaxHeap()
	{
		maxList = new ArrayList<Integer>();
	}
	
	public MaxHeap(Comparator c)
	{
		order = c;
	}

	
	public void addElement(int element) 
	{
		maxList.add(element);
		if(maxList.size() > 1)//starts sorting heap when more than 1 item in list
		{
			int parentIndex = (maxList.indexOf(element) - 1) / 2;//grabs parent of element being passed
			while(compare(element, maxList.get(parentIndex)))//continues while element has parent
			{
				int temp = 0;//for data swap at parent index
				int elementIndex = maxList.indexOf(element);//index of current added item
				temp = maxList.get(parentIndex);
				maxList.set(parentIndex, element);
				maxList.set(elementIndex, temp);
				parentIndex = (maxList.indexOf(element) - 1) / 2;
				if(maxList.indexOf(element)==0)//terminating condition saying top of heap
				{
					break;
				}
			}
		}
	}

	
	boolean compare(int child, int parent) 
	{
		if(child > parent)
			return true;
		else
		{
			return false;
		}
		
	}
	
	public void remove() 
	{
		int lastItem = maxList.get(maxList.size()-1);//grabs last item for front add
		int parent = 0;
		maxList.remove(maxList.size()-1);//removes alst item
		maxList.set(0, lastItem);// sets last item to front or top of heap
		while(true)
		{
			int leftC = (2 * maxList.indexOf(lastItem)) + 1;
			int rightC = leftC + 1;
			if(leftC >= maxList.size())
			{
				break;
			}
			int maxC = leftC;
			if(rightC < maxList.size()  && 
						maxList.get(rightC) 
					  < maxList.get(leftC))
			{
				maxC = rightC;
			}
			if(maxList.get(parent) > maxList.get(maxC))
			{
				int temp = 0;
				temp = maxList.get(parent);
				maxList.set(parent, maxList.get(maxC));
				maxList.set(maxC, temp);
				parent = maxC;
				
			}
			else
			{
				break;
			}
			
		}
	}
	 public String toString()
	 {
		 return Arrays.toString(maxList.toArray());
	 }
}
