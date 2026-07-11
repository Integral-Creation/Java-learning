/*
    Java GUI API
        The GUI API contains classes that can be classified into three group: Component, classes, Container classes, and helper classes.
        
    • Java GUI API Hierarchy 

                java.lang.Object
                        |
                    Component
                        |
                    Container
                    /      \
                Window    Panel
                 |          |
                Frame      Applet
    • Swing class extends AWT class
        Object
        |
        Component
        |
        Container
        |
        JComponent
        |
        --------------------------------------
        |      |      |      |       |       |
        JButton JLabel JTextField JTextArea JCheckBox ...
    
    • Component Class
        In java GUI Programming, the Component class is the root class for all the user interface classes. It belong to the java.awt Package.
        • JComponent is the root class for the lightweight swing component. Both Component and JComponent are abstract class
    • Container class
        An instance of Container can holds instance of Component. It is used to hold and organize the other GUI component, such as button, labels, textfield, checkbox and the other container.

    • GUI Helper class
        GUI helper class are the utility classes to provided by java to simplify the creation and management of User interface.
        some commonly used helper class are Graphics, Color, Font, FontMetrics, Dimension, and LayoutManager etc.
    
    
*/

public class _02JavaGUIAPI {
    
}
