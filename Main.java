public class Main {
    
    public static void main(String[] args){
        Node root = new Node(15);  
        Node.insert(root, 10); 
        Node.insert(root, 20);
        Node.insert(root, 8); 
        Node.insert(root, 12);
        Node.insert(root, 18); 
        Node.insert(root, 25);
        Node.insert(root, 16); 
        Node.insert(root, 19);
        Node.insert(root, 30);  
    System.out.println(root.getNodesCountIterative(root));
    System.out.println(root.getNodesCount(root));
    System.out.println(root.searchBST(root, 25));
    System.out.println(root.validateBST(root));
    Node.Swap(root);
    System.out.println(root.validateBST(root));
    }
}
