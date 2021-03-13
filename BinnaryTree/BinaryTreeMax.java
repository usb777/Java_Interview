package BinnaryTree;

import java.util.Queue;

public class BinaryTreeMax 
{
	
    Node root; 
    
    // Returns the max value in a binary tree 
    static int findMax(Node node) 
    { 
        if (node == null)   return Integer.MIN_VALUE; 
  
        int res = node.data; 
        int lres = findMax(node.left); 
        int rres = findMax(node.right); 
  
        if (lres > res)    res = lres; 
        if (rres > res)    res = rres; 
        
        System.out.println("node = "+res);
        return res; 
    } 
    // Returns the min value in a binary tree  
    static int findMin(Node node) 
    { 
        if (node == null) 
            return Integer.MAX_VALUE; 
      
        int res = node.data; 
        int lres = findMin(node.left); 
        int rres = findMin(node.right); 
      
        if (lres < res) 
            res = lres; 
        if (rres < res) 
            res = rres; 
        return res; 
    }    

    
    //main method
	public static void main(String[] args) 
	{
		 BinaryTreeMax tree = new BinaryTreeMax(); 
	        tree.root = new Node(2); 
	       // tree.root.left =  new Node(7);
	        
	        tree.root.left = new Node(7); 
	       
	       
	        tree.root.left.left = new Node(2); 
	        tree.root.left.right = new Node(6); 
	        tree.root.left.right.right = new Node(11);
	        tree.root.left.right.left = new Node(5);
	        
	        tree.root.right = new Node(5); 
	        tree.root.right.right = new Node(9); 
	        tree.root.right.right.left = new Node(4); 
	  
	        // Function call 
	        System.out.println("Maximum element is " + tree.findMax(tree.root)); 
	        
	        
	     //   System.out.println(""+maxDepth(tree) );
	    } 
	
	
	


public static int heightBT(Node root)
{
   if (root==null) 
   {
	   return 0;
   }
   int left = heightBT(root.left);
   int right = heightBT(root.right);

return (Math.max(left, right) +1);
}

public static int maxDepth(Node node)  
{ 
    if (node == null) 
        return 0; 
    else 
    { 
        /* compute the depth of each subtree */
        int lDepth = maxDepth(node.left); 
        int rDepth = maxDepth(node.right); 

        /* use the larger one */
        if (lDepth > rDepth) 
            return (lDepth + 1); 
         else 
            return (rDepth + 1); 
    } 
	
	

	}
}
	
	class Node 
	{ 
	    int data; 
	    Node left, right; 
	  
	    public Node(int data) 
	    { 
	        this.data = data; 
	        left = right = null; 
	    } 
	} 

