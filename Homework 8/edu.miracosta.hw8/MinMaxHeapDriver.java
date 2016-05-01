package homework7;

public class MinMaxHeapDriver 
{
	public static void main(String args[])
	{
		int [] a = {10, 4, 2, 11, 1};
		System.out.println("Min array");
		MinHeap min = new MinHeap();
		min.addElement(a[0]);
		min.addElement(a[1]);
		min.addElement(a[2]);
		min.addElement(a[3]);
		min.addElement(a[4]);
		
		System.out.println(min);
		min.remove();
		System.out.println(min);
		
		System.out.println();
		
		System.out.println("Max array");
		
		MaxHeap max = new MaxHeap();
		max.addElement(a[0]);
		max.addElement(a[1]);
		max.addElement(a[2]);
		max.addElement(a[3]);
		max.addElement(a[4]);
		
		System.out.println(max);
		max.remove();
		System.out.println(max);
		
	}
}