
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
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// -------------------------------------------------------------------------
/**
 * FileProcessor class will crate a file processor object that takes a file name
 * and use scanner to scan each line in the file, then operate based on what
 * command the scanner scanned.
 *
 * @author peiwenz
 * @version Jun 10, 2021
 */
public class FileProcessor {

    // ~ Fields ................................................................
    /**
     * scanner scan will scan new line and put result into a string
     */
    private Scanner scan;
    private DTree tree;

    // ~ Constructors ..........................................................
    /**
     * Create a new FileProcessor object.
     *
     * @param fileName
     *            the file input name string
     *
     * @throws FileNotFoundException
     *             throw if file was not found
     */
    public FileProcessor(String fileName) throws FileNotFoundException {
        System.out.println("in fp constr");
        File file = new File(fileName);
        scan = new Scanner(file);
        tree = new DTree();
    }
    // ~Public Methods ........................................................


    /**
     * run the program
     */
    public void run() {
        System.out.println("in fp run");
        while (scan.hasNextLine()) { // scan the next line in the file
            System.out.println("reading lines");
            String nextLine = scan.nextLine();
            if (nextLine.length() > 0) {
                this.extractCommand(nextLine);
                System.out.println(nextLine);
                // extract the command and specify what type of command it is.
                // DTree tree run methods based on command type.
            }
        }
    }


    // ----------------------------------------------------------
    /**
     * extract the command and specify what type of command it is. DTree tree
     * run methods based on command type.
     *
     * @param commandLine
     *            input command line
     */
    public void extractCommand(String commandLine) {
        // case1 if commandLine is "insert"
        tree.insert(commandLine);
        // case2 if commandLine is "remove"
        tree.remove(commandLine);
        // case3 if commandLine is "print"

        // case4 if commandLine is "print lengths"

        // case5 if commandLine is "print stats"

        // case6 if command Line is "search"

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
