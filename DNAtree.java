
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
import java.io.*;

// -------------------------------------------------------------------------
/**
 * This is the driver class, call java DNAtree {command-file} will run the
 * program.
 * The program will read from the command-file a series of commands, one
 * commands for each line.
 *
 * @author peiwenz
 * @version Jun 10, 2021
 */
public class DNAtree {

    // ----------------------------------------------------------
    /**
     * main is the driver method.
     *
     * @param args
     *            input file that holds the commands to be processed by the
     *            program.
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            throw new IllegalArgumentException("Need input to be a file name.");
        }
        String file = args[0];
        FileProcessor fp = new FileProcessor(file);
        fp.run();

    }
}
