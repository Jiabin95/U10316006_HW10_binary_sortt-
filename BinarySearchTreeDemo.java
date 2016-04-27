public class BinarySearchTreeDemo {
	//Main method
	public static void main(String[] args) {
		//Construct a bst
		BinarySearchTree bst = new BinarySearchTree();
		//Insert number
		bst .insert(40)

        .insert(25)

        .insert(78)

        .insert(10)

        .insert(3)

        .insert(17)

        .insert(32)

        .insert(30)

        .insert(38)

        .insert(78)

        .insert(50)
		
        .insert(93);
	
	//Print Original
	System.out.println("Original Array:");
	System.out.println("40,25,78,10,3,17,32,30,38,78,50,93");	
	//Print Inorder	
    System.out.println("Inorder traversal");
    bst.printInorder();
	//Print Preorder
    System.out.println("Preorder Traversal");
    bst.printPreorder();
	//Print Postorder
    System.out.println("Postorder Traversal");
    bst.printPostorder();

    
  }
}
