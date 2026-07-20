/*
    JOptionPane
        JOptionPane is a Swing class used to create the dialog box for
            • Displaying message
            • Getting user input
            • Asking for conformation
            • Showing error, warning, or information dialog box

    • Declaration 
        import javax.swing.JOptionPane;
    
    • Syntax
        JOptionPane.showMessageDialog(parentComponent, message);
    
*/

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class _06JOptionPane {
    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null, "Welcome to Java GUI Window", "showMessage", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Welcome to Java GUI Window", "showMessage", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "What?", "showMessage", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "You're Computer has A VIRUS!!!!", "showMessage", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Something Went Wrong", "showMessage", JOptionPane.ERROR_MESSAGE);

        // JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Title", JOptionPane.YES_NO_CANCEL_OPTION);
        // String name = JOptionPane.showInputDialog("What is your Name");

        // JOptionPane.showConfirmDialog(null, "Hello " + name, "Window", JOptionPane.PLAIN_MESSAGE);

        // create ImageIcon to change the default image
        ImageIcon icon = new ImageIcon("14_GUIBasics/src/icons8-happy.gif");

        String[] responses = {"No, you're awesome!", "Thankyou!", "*Cool*"};
        JOptionPane.showOptionDialog(null,"Your are awesome","Secret Message", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,icon, responses,0);
    }
}
