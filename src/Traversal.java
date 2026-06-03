public class Traversal {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<>(10);

    root.left = new TreeNode<>(9);
    root.left.left = new TreeNode<>(5);
    root.left.right = new TreeNode<>(2);

    root.right = new TreeNode<>(15);
    root.right.left = new TreeNode<>(-3);
    root.right.right = new TreeNode<>(5);
    root.right.right.right = new TreeNode<>(22);

        TreeNode<String> stringRoot = new TreeNode<>("Hello"); 

    stringRoot.left = new TreeNode<>("hehe");
    stringRoot.left.left = new TreeNode<>("haha");
    stringRoot.left.right = new TreeNode<>("hihi");

   stringRoot.right = new TreeNode<>("bye");
   stringRoot.right.left = new TreeNode<>("byebye");
   stringRoot.right.right = new TreeNode<>("byby");
   stringRoot.right.right.right = new TreeNode<>("bb");

    //preorder(root);
    //postorder(root);
   // inorder(root);
  // printGreaterThan(root, 1);
  System.out.println(countNodes(root));

  }

  public static int countNodes(TreeNode <?> current){ 
    if(current ==null) return 0;
    //count of all nodes in the left subtree
    int leftCount = countNodes(current.left);
    int rightCount = countNodes(current.right);

    int totalCount = 1 + leftCount + rightCount;
    return totalCount;

  }

  //Do a preorder Traversal 
  //but only print the nodes that are greater than our treshold
  public static void printGreaterThan(TreeNode <Integer> current, int threshold){
    if(current == null) return;
    if(current.data > threshold){
      System.out.println(current.data);
      printGreaterThan(current.left, threshold);
      printGreaterThan(current.right, threshold);
    }

  }

  //this recurrsion allows us to loop 
  public static void preorder(TreeNode <?> current){
    if(current == null) return;
    System.out.println(current.data);

    //start process over but with left child
    preorder(current.left);
    //right child
    preorder(current.right);
  }

  // post order traverasal method
  public static <E> void postorder(TreeNode <E> current){
    if(current == null) return;
    postorder(current.left);
    postorder(current.right);
    E myData = current.data;
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
