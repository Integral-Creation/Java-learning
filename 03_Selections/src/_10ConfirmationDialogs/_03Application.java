package _10ConfirmationDialogs;

import javax.swing.JOptionPane;

public class _03Application {
    public static void main(String[] args) {
        /*
            Ask the user to enter their name.
            Ask the user to enter their age.

            If the age is 18 or above:
            Display a message dialog saying:
            "Hello <name>, you are eligible to vote."

            Otherwise:
            Display a message dialog saying:
            "Hello <name>, you are not eligible to vote."
         */
        String name = JOptionPane.showInputDialog(null,"enter your name");
        String age = JOptionPane.showInputDialog(null,"enter your age");

        int numAge = Integer.parseInt(age);


        if(numAge >= 18){
            JOptionPane.showMessageDialog(null, "Hello "+name+", you are eligible to vote");
        }
        else {
            JOptionPane.showMessageDialog(null, "Hello "+name+", you are not eligible to vote");
        }
    }
}
