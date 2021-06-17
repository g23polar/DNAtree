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
public class DTreeInternalNode extends DTreeNode {
    // ~ Fields ................................................................
    /**
     * height of the node in the tree structure.
     */
    public int height;
    /**
     * DTreeInternal node for "A" DNA type
     */
    public DTreeFlyWeightNode A;
    /**
     * DTreeInternal node for "C" DNA type
     */
    public DTreeFlyWeightNode C;
    /**
     * DTreeInternal node for "G" DNA type
     */
    public DTreeFlyWeightNode G;
    /**
     * DTreeInternal node for "T" DNA type
     */
    public DTreeFlyWeightNode T;
    /**
     * DTreeInternal node for "$ DNA type
     */
    public DTreeFlyWeightNode $;

    // ----------------------------------------------------------
    // ~ Constructors ..........................................................
    /**
     * Create a new DTreeInternalNode object.
     *
     * @param nodeHeight
     *            height of the node
     */
    public DTreeInternalNode(int nodeHeight) {
        System.out.println("Internal constr");
        height = nodeHeight;
        A = new DTreeFlyWeightNode(nodeHeight + 1, "empty A");
        C = new DTreeFlyWeightNode(nodeHeight + 1, "empty C");
        G = new DTreeFlyWeightNode(nodeHeight + 1, "empty G");
        T = new DTreeFlyWeightNode(nodeHeight + 1, "empty T");
        $ = new DTreeFlyWeightNode(nodeHeight + 1, "empty $");
    }


    // ~Public Methods ........................................................
    // ----------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public void clear() {
        // TODO Auto-generated method stub

    }


    // ----------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }


    // ----------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public int getHeight() {
        // TODO Auto-generated method stub
        return 0;
    }

}
