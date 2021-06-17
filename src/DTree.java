// change 2
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
    public DTreeNode root;
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
        System.out.println("DTree constr");
        size = 1;
        root = new DTreeFlyWeightNode(0, "new tree");
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
        /**
         * 1. base case: if valid location,
         *      if flyweight node, insert as leaf
         *      if internal node, split, insert as leaf, insert other 4 flyweight nodes
         */
        this.root = insertHelper(sequence, this.root);
        // code here
        
    }
    
    private DTreeNode insertHelper(String seq, DTreeNode node) {
        if(node.getClass().equals(DTreeFlyWeightNode.class)) {
            System.out.println("At fly, inserting leaf");
            DTreeLeafNode newLeaf = new DTreeLeafNode(seq);
            return newLeaf;
        }
        else if(node.getClass().equals(DTreeLeafNode.class)) {
            // split at leaf
            DTreeLeafNode node1 = (DTreeLeafNode) node;
            System.out.println("At Leaf, splitting");
            DTreeInternalNode intern = new DTreeInternalNode(1);

            // find right node, re-insert old leaf
            DTreeLeafNode oldInsert = intern.findFit(node1);
            oldInsert = new DTreeLeafNode(node1.data);
            System.out.println("old = " + oldInsert.data);
            // find right node, insert new leaf
            DTreeLeafNode newInsert = intern.helper(seq);
            newInsert = new DTreeLeafNode(seq);
            System.out.println("new = " + newInsert.data);
            
            return intern;
        }
        else if(node.getClass().equals(DTreeInternalNode.class)) {
            System.out.println("Internal case");
            DTreeInternalNode intern = (DTreeInternalNode) node;
            DTreeLeafNode newInsert = intern.helper(seq);
            newInsert = new DTreeLeafNode(seq);
            System.out.println("new = " + newInsert.data);
            return intern;
        }
        return null;
        
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
        printHelper(this.root, 0);
    }

    private void printHelper(DTreeNode root, int sp) {
        if(root.getClass().equals(DTreeFlyWeightNode.class)) {
            for(int i = 1; i<=sp; i++) {
                System.out.print(" ");
            }
            System.out.println("E"); 
        }
        else if(root.getClass().equals(DTreeLeafNode.class)) {
            DTreeLeafNode leaf = (DTreeLeafNode) root;
            for(int i = 1; i<=sp; i++) {
                System.out.print(" ");
            }
            System.out.println(leaf.data); 
        }
        else if(root.getClass().equals(DTreeInternalNode.class)) {
            DTreeInternalNode in = (DTreeInternalNode) root;
            printHelper(in.A, sp+1);
            printHelper(in.C, sp+1);
            printHelper(in.G, sp+1);
            printHelper(in.T, sp+1);
            printHelper(in.$, sp+1);
        }
        
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
        DTreeLeafNode newNode = new DTreeLeafNode(sequence);
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
    public DTreeLeafNode remove(String sequence) {
        return null; // need to change return type to the removed DTreeLeafNode.

    }

    // method for case 3

    // method for case 4

    // method for case 5

    // method for case 6
}
