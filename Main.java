public class Main {
    
    public static void main(String[] args){
        Node root = new Node(15);  
    root.left = new Node(10);  
    root.right = new Node(20);
    root.left.left=new Node(8);
    root.left.right=new Node(12);
    root.right.left=new Node(18);
    root.right.right=new Node(25);
    root.right.left.left=new Node(16);
    root.right.left.right=new Node(19);
    root.right.right.right=new Node(30);  
    System.out.println(root.getNodesCountIterative(root));
    System.out.println(root.searchBST(root, 25));
    }
}
