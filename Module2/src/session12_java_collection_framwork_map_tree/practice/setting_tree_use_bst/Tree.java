package session12_java_collection_framwork_map_tree.practice.setting_tree_use_bst;

public interface Tree<E> {
    public boolean insert(E e);
    /**
     * Inorder traversal from the root
     */
    public void inorder();
    /**
     * Get the number of nodes in the tree
     */
    public int getSize();
}
