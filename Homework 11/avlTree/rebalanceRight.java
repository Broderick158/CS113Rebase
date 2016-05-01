package avlTree;
/**prog. prob. 1 Program the rebalanceRight method pg. 490
 * Height of the right subtree minus height of the left subtree
 * parent balance  + 2 , right child balance - 1 
 *
 *Algorithm for rebalanceRight
 *1. if the right subtree has a negative balance
 *2.		if the right-right subtree has a positive balance
 *3.			Set the right subtree(new right subtree) balance to 0
 *4.			Set the right-right subtree(new root) balance to 0
 *5.			Set the local root (new right subtree) balance to +1
 *		else (Right-left-left case)
 *6.			Set the right subtree(new right subtree) balance to -1
 *7.			Set the right-right subTree (new root) balance to 0
 *8. 		Set the local root (new left subtree) balance to 0
 *9.		Rotate the right subtree right
 *	 else (right-right case)
 *10. 	Set the right subtree balance to 0
 *11.	Set the local root balance to 0
 *12.Rotate the local root left 
 *
 */
public class rebalanceRight 
{
	public static void main(String[] args) 
	{
		
	}
	/** Method for rebalancing the right side
	 * pre-condition:  The localRoot is the root of an AVL subtree that is critically right-heavy
	 * post-condition: The balance is restored
	 * <p>
	 * @param localRoot Root of the AVL subtree that needs rebalancing
	 * @return a new localRoot
	 */
	private AVLNode<E> rebalanceRight(AVLNode<E> localRoot)
	{
		//Obtain the reference to the right child
		AVLNode<E> rightChild = (AVLNode<E>) localRoot.right
		{
			
		}
	}



}
