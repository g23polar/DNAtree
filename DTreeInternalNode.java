// -------------------------------------------------------------------------
/**
 * DTreeInternalNode is a subclass for DTreeNode.
 * Internal nodes MAY NOT store data of any type (other than the pointers to
 * children).
 *
 * @author peiwenz
 * @version Jun 10, 2021
 * @param <E>
 *            generic data stored in the node
 */
public class DTreeInternalNode<E> implements DTreeNode<E> {
    // ~ Fields ................................................................
    /**
     * height of the node in the tree structure.
     */
    public int height;
    /**
     * DTreeInternal node for "A" DNA type
     */
    public DTreeInternalNode<E> A;
    /**
     * DTreeInternal node for "C" DNA type
     */
    public DTreeInternalNode<E> C;
    /**
     * DTreeInternal node for "G" DNA type
     */
    public DTreeInternalNode<E> G;
    /**
     * DTreeInternal node for "T" DNA type
     */
    public DTreeInternalNode<E> T;
    /**
     * DTreeInternal node for "$ DNA type
     */
    public DTreeInternalNode<E> $;

    // ----------------------------------------------------------
    // ~ Constructors ..........................................................
    /**
     * Create a new DTreeInternalNode object.
     *
     * @param nodeHeight
     *            height of the node
     */
    public DTreeInternalNode(int nodeHeight) {
        height = nodeHeight;
        A = new DTreeInternalNode<E>(nodeHeight + 1);
        C = new DTreeInternalNode<E>(nodeHeight + 1);
        G = new DTreeInternalNode<E>(nodeHeight + 1);
        T = new DTreeInternalNode<E>(nodeHeight + 1);
        $ = new DTreeInternalNode<E>(nodeHeight + 1);
    }


    // ~Public Methods ........................................................
    // ----------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }


    // ----------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }


    // ----------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    @Override
    public int getHeight() {
        // TODO Auto-generated method stub
        return 0;
    }

}
