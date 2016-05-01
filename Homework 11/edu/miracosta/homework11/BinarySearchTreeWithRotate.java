package edu.miracosta.homework11;
	/** This class extends the BinarySearchTree by adding the rotate
	 * operations.Rotation will change the balance of a search tree
	 * while preserving the search tree property. Used as a common base
	 * class for self-ballancing trees. 
	 */
	public class BinarySearchTreeWithRotate<E extends Comparable<E>>
				extends BinarySearchTree<E>
	{
		/** Method to perform a right rotation.
		 *Pre: root is the root of a binary search tree.
		 *Post: root.right is the root of a binary search tree,
		 *		root.right.right is raised one level
		 *		root.right.left does not change levels,
		 *		root.left is lowered one level,
		 *		the new root is returned.
		 *@param root The root of the binary tree to be rotated
		 *@return The new root of the rotated tree 
		 */
		protected Node<E> rotateRight(Node <E> root)
		{
			Node<E> temp = root.left;
			root.left = temp.right;
			temp.right = root;
			return temp;
		}
		/** Method to perform a left rotation (rotateLeft).
		 * @param root
		 * @return the new root of the rotated tree
		 */
		protected Node<E> rotateLeft(Node <E> root)
		{
			Node<E> temp = root.right;
			  root.right = temp.left;
			  temp.left = root;
			  return temp;
		}
	}