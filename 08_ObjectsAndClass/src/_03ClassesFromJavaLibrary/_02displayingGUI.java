package _03ClassesFromJavaLibrary;

import javax.swing.JFrame;

public class _02displayingGUI {
    public static void main(String[] args) {
        /*
        To create a Graphical User Interface we have to use Java classes such as:
            JFrame
            JButton
            JRadioButton
            JComboBox
            JList
        to create frames, button, radio button, combo boxes, lists and so on.
        */

       /*
       This program creates two objects of the JFrame class.
       It uses the following methods to set the properties of the objects.
       */
        JFrame frame1 = new JFrame();
        frame1.setTitle("window1"); // set the title for the windows
        frame1.setSize(200,150); // methods set size of the windows
        frame1.setLocation(200,100); // set the location of windows in upper-left corner.
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminates the program
        frame1.setVisible(true); // display the windows

        JFrame frame2 = new JFrame();
        frame2.setTitle("windows 2");
        frame2.setSize(200,150);
        frame2.setLocation(410,100);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);

    }
}
