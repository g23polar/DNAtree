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
    public DTreeLeafNode A;
    /**
     * DTreeInternal node for "C" DNA type
     */
    public DTreeLeafNode C;
    /**
     * DTreeInternal node for "G" DNA type
     */
    public DTreeLeafNode G;
    /**
     * DTreeInternal node for "T" DNA type
     */
    public DTreeLeafNode T;
    /**
     * DTreeInternal node for "$ DNA type
     */
    public DTreeLeafNode $;

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
    
    public DTreeLeafNode findFit(DTreeLeafNode x) {
        switch(x.data.substring(x.height).charAt(0)) {
            case 'A':
                return A;
//                break;
            case 'C':
                return C;
//                break;
            case 'G':
                return G;
//                break;
            case 'T':
                return T;
//                break;
            default:
                return $;
//                break;
        }
    }
    
    public DTreeLeafNode helper(String x) {
//        System.out.println("Current depth = " + depth);
        String sub = x.substring(this.height);
        switch(sub.charAt(0)) {
            case 'A':
                return A;
//                break;
            case 'C':
                return C;
//                break;
            case 'G':
                return G;
//                break;
            case 'T':
                return T;
//                break;
            default:
                return $;
        }
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
