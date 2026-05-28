public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);

    root.left = new TreeNode(9);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);

    root.right = new TreeNode(15);
    root.right.left = new TreeNode(-3);
    root.right.right = new TreeNode(5);
    root.right.right.right = new TreeNode(22);

    //preorder(root);
    //postorder(root);
    inorder(root);
  }

  //this recurrsion allows us to loop 
  public static void preorder(TreeNode current){
    if(current == null) return;
    System.out.println(current.data);

    //start process over but with left child
    preorder(current.left);
    //right child
    preorder(current.right);
  }

  // post order traverasal method
  public static void postorder(TreeNode current){
    if(current == null) return;
    postorder(current.left);
    postorder(current.right);
    System.out.println(current.data);
  }

  //inorder traversal method 
  public static void inorder(TreeNode current){
    if(current == null) return;
    inorder(current.left);
    System.out.println(current.data);
    inorder(current.right);
  }

}
