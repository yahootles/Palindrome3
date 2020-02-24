/*
 * Andrew Thompson
 * February 24, 2020
 * Determines if a sentence is a palindrome
 */

package palindrome3;

import javax.swing.JOptionPane;

/**
 *
 * @author antho6229
 */
public class Palindrome3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variable declaration
        String forward = "";
        String backwards = "";
        String spaceLess = "";

        try {
            //get user input
            forward = JOptionPane.showInputDialog("Words that are arranged the same way forwards as they are"
                    + " backwards are called palindromes.\nThis program determines if a phrase is a palindrome."
                    + "\n\nEnter a phrase(do not include a punctuation):");

            //remove spaces from forward and store in spaceLess
            spaceLess = forward.replaceAll(" ", "");
            
            //reverse spaceLess
            for (int i = spaceLess.length() - 1; i >= 0; i--) {
                backwards += spaceLess.charAt(i);
            }

            //check if string is a palindrome, then output to user
            if (spaceLess.equalsIgnoreCase(backwards)) {
                JOptionPane.showMessageDialog(null, (forward + " IS a palindrome."));
            } else {
                JOptionPane.showMessageDialog(null, (forward + " is NOT a palindrome."));
            }
        }catch(NullPointerException npe){//Exit properly is cancel option is chosen
            System.exit(0);
        }
    }
    
}
