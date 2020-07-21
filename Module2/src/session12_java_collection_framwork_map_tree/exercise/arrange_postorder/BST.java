package session12_java_collection_framwork_map_tree.exercise.arrange_postorder;

public class BST<E extends Comparable<E>> {
    TreeNode<E> root;
    int size;

    public void insertElement(E element) {

        if (this.root == null) {
            this.root = new TreeNode(element);

        } else {
            TreeNode<E> temp = this.root;
            TreeNode<E> parent = null;

            while (temp != null) {

                if (element.compareTo(temp.element) < 0) {
                    parent = temp;
                    temp = temp.left;
                } else if (element.compareTo(temp.element) > 0) {
                    parent = temp;
                    temp = temp.right;
                } else {
                    return;
                }
            }
            if (element.compareTo(parent.element) < 0) {
                parent.left = new TreeNode<>(element);
            } else {
                parent.right = new TreeNode<>(element);
            }
        }
        size++;
    }
    public void postOrder(TreeNode<E> e){
        if(e != null){
            postOrder(e.left);
            postOrder(e.right);
            System.out.println(e.element);
        }
    }
}
