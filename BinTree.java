
package bintree;

/**
 * @author Richard Howard
 * Write an implementation of a binary tree data structure in Java. A node 
 * should have an integer key. The implementation should include methods for 
 * inserting a node and a tree walk method. A tree walk method is supposed to 
 * output a list of keys sorted in increasing order. Test your program in the 
 * main method of one of your classes using the following tests (tests assume 
 * the implementation contains classes BinTree with methods insertNode and 
 * treeWalk and a class Node):
 */
public class BinTree {
    /*
    Function: Node
    
    the function Node creats a node with the value of the node and the abitily 
    to move left and right 
    
    Receives: none
    Constants: none
    Returns: none
    */

    /**
     *
     * @param <T>
     */
    
    public class Node<T>
    {

        /**
         *
         */
        public int value;

        /**
         *
         */
        public Node left;

        /**
         *
         */
        public Node right;
        
        /**
         *
         * @param value
         */
        public Node(int value) {
            this.value = value;
        }
    }
    /*
    Function: main
    
    the function main creats a binary tree and then allows you to insert the 
    value of the nodes then put them in order using the treewalk function
    
    Receives: String[] arg
    Constants: none
    Returns: the order of the nodes using the treewalk method
    */

    /**
     *
     * @param args
     */
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("testcase 1:");
        BinTree binTree2 = new BinTree();
	binTree2.insert(52);
	binTree2.insert(67);
	binTree2.insert(12);
	binTree2.insert(9);
	binTree2.insert(21);
	binTree2.treeWalk();

    }
     
    /**
     *
     */
    public Node root;
   /*
    Function: insert
    
    the function insert makes a new node and sets the root
    
    Receives: int value( the value of the node )
    Constants: none
    Returns: int value( the value of the node )
    */     

    /**
     *
     * @param value
     * @return
     */
         
   public BinTree insert(int value) {
        Node node = new Node<>(value);
            
        if(root == null) 
        {
            root = node;
            return this;
        }
        
        insertNode(root,node);
        return this;
        
        }
    /*
    Function: insertNode
    
    the function insert inserts the node into the bintree
    
    Receives: node latestRoot ( finds the value of the new node and compares
    it to this node and see which one is bigger if its latestRoot it becomes 
    the root else it gets moed to the left or right depending on the value )
              Node node( a temp node to help move the values of latestRoot )
    Constants: none
    Returns: none
    */   
    private void insertNode(Node latestRoot, Node node){
        if(latestRoot.value > node.value){
            if(latestRoot.left == null ){
                latestRoot.left = node;
                return;
            } else {
                insertNode(latestRoot.left, node);
            }
            } else {
                if(latestRoot.right == null){
                    latestRoot.right = node;
                    return;
                } else {
                    insertNode(latestRoot.right, node);
                }
            }
        }
     /*
    Function: treeWalk
    
    the function treeWalk sets the root up for treeWalkNode
    
    Receives: none
    Constants: none
    Returns: none
    */   

    /**
     *
     */
       
    public void treeWalk(){
        treeWalkNode(root);
        System.out.println(" ");
    }
     /*
    Function: treeWalkNode
    
    the function TreeWalkNode
    
    Receives: Node currRoot ( sets the current node to the left or right based
    on the value of current node)
    Constants: none
    Returns: none
    */   
    private void treeWalkNode(Node currRoot){
        if ( currRoot == null){
            return;
        }
        treeWalkNode(currRoot.left);
        System.out.print(currRoot.value+",");
        treeWalkNode(currRoot.right);
        }
}
