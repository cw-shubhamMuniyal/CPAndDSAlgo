package DS.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by User on 14-08-2020.
 */
public class CompleteBinaryTree {
    Node root;

    public CompleteBinaryTree(){
        root=null;
    }

    public void insert(Object data){
        Queue<Node> queue=new LinkedList();
        if(root==null){
            root=new Node(data);
        }
        else{
            queue.add(root);
            while(!queue.isEmpty()){
                Node node=queue.poll();
                if(node.left==null){
                    node.left=new Node(data);
                    break;
                }
                else if(node.right==null){
                    node.right=new Node(data);
                    break;
                }
                else{
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
        }
    }

    public void traverse(){
        Queue<Node> queue=new LinkedList<>();
        if(root==null){
            System.out.print("Tree is empty");
        }
        else{
            queue.add(root);
            while(!queue.isEmpty()){

                Node node=queue.poll();
                System.out.print(node.data+"->");
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
        }
    }
}
