package java_collection_framwork_map_tree.exercise.arrange_postorder;

public class TestTreeNode {
    public static void main(String[] args) {
        BST enterNumber = new BST();
        enterNumber.insertElement("a");
        enterNumber.insertElement("b");
        enterNumber.insertElement("c");
        enterNumber.insertElement("d");
        enterNumber.insertElement("e");

        enterNumber.postOrder(enterNumber.root);
        System.out.println("Size tree is : "+ enterNumber.size);
    }
}
