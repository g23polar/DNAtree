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
 * DTree will create a tree object.
 * DTree has 1 root node at the top, and every level has 5 leaf node {ACGT$}.
 * DTree can insert, delete, and sort its nodes.
 *
 * @author peiwenz
 * @version Jun 10, 2021
 */
public class DTree {
    // ~ Fields ................................................................
    /**
     * root node for the base of DTree structure.
     */
    public DTreeInternalNode<Integer> root;
    /**
     * number of nodes in the DTree.
     */
    public int size;

    // ----------------------------------------------------------
    /**
     * Create a new DTree object.
     */
    // ~ Constructors ..........................................................
    public DTree() {
        size = 1;
        root = new DTreeInternalNode<Integer>(1);
    }


    // ----------------------------------------------------------
    /**
     * Insert sequence into the DNA tree. Print a message indicating if the
     * insertion was successful, and if so, indicate the level of the leaf node
     * inserted.
     *
     * @param sequence
     *            input string
     */
    // ~Public Methods ........................................................
    public void insertSequence(String sequence) {
        // code here
    }


    // ----------------------------------------------------------
    /**
     * Remove sequence from the DNA tree if it exists. Prints message dependent
     * on if sequence is or is not in the tree.
     *
     * @param sequence
     *            input string
     */
    public void removeSequence(String sequence) {
        // code here
    }


    // ----------------------------------------------------------
    /**
     * Remove sequence from the DNA tree if it exists. Prints message dependent
     * on if sequence is or is not in the tree.
     */
    public void print() {
        // code here
    }


    // ----------------------------------------------------------
    /**
     * Output is identical to that of the print command, except that the length
     * of the sequence is printed after the sequence for all sequences stored in
     * the database.
     */
    public void printLengths() {
        // code here
    }


    // ----------------------------------------------------------
    /**
     * Output is identical to that of the print command, except that the letter
     * breakdown (by percentage) of the sequence is printed after the sequence
     * for all sequences stored in the database.
     */
    public void printStats() {
        // code here
    }


    // ----------------------------------------------------------
    /**
     * Find all sequences that match {sequenceDescriptor}.
     * Print the number of nodes visited in the tree during the search.
     *
     * @param sequenceDescriptor
     *            input sequence string.
     */
    public void search(String sequenceDescriptor) {
        // code here
    }


    // ----------------------------------------------------------
    /**
     * insert a new DTreeLeafNode under the proper DTreeInternal node, check if
     * the node needs to be a fly weight node. return the height of new inserted
     * node.
     *
     * @param sequence
     *            input sequence data
     * @return height of new inserted node
     */
    public int insert(String sequence) {
        // need to check for fly weight node before create a new DTree leaf node
        // object
        // need code here for checking
        DTreeLeafNode<String> newNode = new DTreeLeafNode<String>(sequence);
        // need code here for insertion.
        return newNode.height;
    }


    // ----------------------------------------------------------
    /**
     * remove the proper DTreeLeafNode and return it.
     *
     * @param sequence
     *            input sequence data.
     * @return removed DTreeLeafNode.
     */
    public DTreeLeafNode<String> remove(String sequence) {
        return null; // need to change return type to the removed DTreeLeafNode.

    }

    // method for case 3

    // method for case 4

    // method for case 5

    // method for case 6
}
