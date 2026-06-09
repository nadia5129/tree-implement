import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;


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


   TreeNode<Integer> megaRoot = new TreeNode<Integer>(1);
   TreeNode<Integer> current = megaRoot;

   for( int i = 2; i < 100_001; i++){
    current.right = new TreeNode<Integer>(i);
    current = current.right;

   }


   levelOrder(root);
  //  preorderIterative(root);
   //preorder(megaRoot);
    //preorder(root);
    //postorder(root);
   // inorder(root);
  // printGreaterThan(root, 1);
  //System.out.println(countNodes(root));

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

  //iterative 
  public static void preorderIterative(TreeNode<?> root){
    Stack<TreeNode<?>> stack = new Stack<>();

    stack.push(root);

    while(!stack.isEmpty()){
    TreeNode<?> current = stack.pop();
    if(current == null) continue; //continue on to the next thing in the loop
      // do something
      System.out.println(current.data);
      stack.push(current.right);
      stack.push(current.left);
    }
  }

  //level order
  //use queue
  public static void levelOrder(TreeNode<?> root){
    Queue<TreeNode<?>> queue = new LinkedList<>();

    queue.offer(root);
    
    while(!queue.isEmpty()){
      TreeNode<?> current = queue.remove();
      if(current == null) continue;
      System.out.println(current.data);
      queue.offer(current.left);
      queue.offer(current.right);
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
