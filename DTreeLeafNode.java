// On my honor:
// - I have not used source code obtained from another student,
// or any other unauthorized source, either modified or
// unmodified.
//
// - All source code and documentation used in my program is
// either my original work, or was derived by me from the
// source code published in the textbook for this course.
//
// - I have not discussed coding details about this project
// with anyone other than my partner (in the case of a joint
// submission), instructor, ACM/UPE tutors or the TAs assigned
// to this course. I understand that I may discuss the concepts
// of this program with other students, and that another student
// may help me debug my program so long as neither of us writes
// anything during the discussion or modifies any computer file
// during the discussion. I have violated neither the spirit nor
// letter of this restriction.
// -------------------------------------------------------------------------
/**
 * DTreeLeafNode is a subclass for DTreeNode.
 *
 * @author peiwenz
 * @version Jun 10, 2021
 * @param 
 *            generic data stored in the node
 */
public class DTreeLeafNode extends DTreeNode {
    // ~ Fields ................................................................
    /**
     * height of the node in the tree structure.
     */
    public int height;
    /**
     * stored data in the leaf node.
     */
    public String data;

    // ----------------------------------------------------------
    /**
     * Create a new DTreeLeafNode object.
     *
     * @param nodeData
     *            data need to be stored in the node
     */
    // ~ Constructors ..........................................................
    public DTreeLeafNode(String nodeData) {
//        System.out.println("New Leaf - " + nodeData);
        height = 1;
        data = nodeData;
    }
    // ~Public Methods ........................................................


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
        return this.height;
    }

}
