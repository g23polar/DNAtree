// -------------------------------------------------------------------------
/**
 * Interface for the DTreeNode.
 *
 * @author peiwenz
 * @version Jun 10, 2021
 * @param <E>
 *            generic type data stored in the node
 */
public interface DTreeNode<E> {
    // ----------------------------------------------------------
    /**
     * clear the data stored in the node.
     */
    public void clear();


    /**
     * return true if node is empty.
     *
     * @return true if node is empty.
     */
    public boolean isEmpty();


    // ----------------------------------------------------------
    /**
     * getter method for the height of the node.
     *
     * @return height of the node.
     */
    public int getHeight();
}
