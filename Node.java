import java.util.LinkedList;
import java.util.Queue; 

public class Node{
    int data;
    Node left;
    Node right;
   
    // If given the Head Node create a function that gives you the count of Nodes in the linked list

    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    public int getNodesCount(Node node){
       // count the head node
       // if there are any nodes on the left and right check and add them to the total
        if(node==null)
        return 0;
        int result=0;
        result++;
        result+=(getNodesCount(node.left)+getNodesCount(node.right));
        // add 1 to the count
         return result;     
    }

    public int getNodesCountIterative(Node node){
        if(node==null)
        return 0;
        int result=0;
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node temp =queue.poll();
            result++;
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
        return result;
    }

    public static Node insert(Node root,int data){
       if(root==null)
       return new Node(data);

       if(root.data>data){
          root.left=insert(root.left,data);
       }else{
          root.right=insert(root.right,data);
       }
       return root;
    }

    public Boolean searchBST(Node root,int value){
           if(root==null){
            return false;
           }
           if(root.data==value)
           return true;
           if(root.data<value){
               return searchBST(root.right, value);
           }
           if(root.data>value){
            return searchBST(root.left, value);
           }
           return false;
    }

    public static void Swap(Node root){
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
    }

    public Boolean validateBST(Node root){

        if(root==null)
        return true;

        if((root.right!=null && root.data>root.right.data) || (root.left!=null && root.data<root.left.data)){
            return false;
        }
        return validateBST(root.left) && validateBST(root.right);
    }
}