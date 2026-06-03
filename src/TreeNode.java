public class TreeNode <T>{
    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;

    public TreeNode(T data){
        this.data = data;
    }

    public TreeNode ( T data, TreeNode left){
        this.data = data;
        this.left = left;
    }

    public TreeNode(T data, TreeNode left, TreeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}