public class PreOrderTraversal {
    void PreOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.data);
        PreOrder(node.left);
        PreOrder(node.right);
    }
}
