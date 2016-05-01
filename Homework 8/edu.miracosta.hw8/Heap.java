	package homework7;
public abstract class Heap
{
	public void addElement(int element) 
	{
		minList.add(element);
		if(minList.size() > 1)//starts sorting heap when more than 1 item in list
		{
			int parentIndex = (minList.indexOf(element) - 1) / 2;//grabs parent of element being passed
			while(compare(element, minList.get(parentIndex)))//continues while element has parent
			{
				int temp = 0;//for data swap at parent index
				int elementIndex = minList.indexOf(element);//index of current added item
				temp = minList.get(parentIndex);
				minList.set(parentIndex, element);
				minList.set(elementIndex, temp);
				parentIndex = (minList.indexOf(element) - 1) / 2;
				if(minList.indexOf(element)==0)//terminating condition saying top of heap
				{
					break;
				}
			}
		}
	}
	
	
	boolean compare(int child, int parent) 
	{
		if(child < parent)
			return true;
		else
		{
			return false;
		}
		
	}
	
	public void remove() 
	{
		int lastItem = minList.get(minList.size()-1);//grabs last item for front add
		int parent = 0;
		minList.remove(minList.size()-1);//removes alst item
		minList.set(0, lastItem);// sets last item to front or top of heap
		while(true)
		{
			int leftC = (2 * minList.indexOf(lastItem)) + 1;
			int rightC = leftC + 1;
			if(leftC >= minList.size())
			{
				break;
			}
			int minC = leftC;
			if(rightC < minList.size() && minList.get(rightC) <
					minList.get(leftC))
			{
				minC = rightC;
			}
			if(minList.get(parent) > minList.get(minC))
			{
				int temp = 0;
				temp = minList.get(parent);
				minList.set(parent, minList.get(minC));
				minList.set(minC, temp);
				parent = minC;
				
			}
			else
			{
				break;
			}
			
		}
	}
}