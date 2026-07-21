package SliderCalculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderCalculator extends JFrame implements ChangeListener{

    JFrame frame;
    JPanel panel1;
    JPanel panel2;
    JLabel label;
    JSlider slider1;
    JSlider slider2;

    public SliderCalculator(){
        frame = new JFrame("SliderCalculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,650);

        panel1 = new JPanel();
        panel2 = new JPanel();
        label = new JLabel();

        slider1 = new JSlider(0,100,0);
        slider2 = new JSlider(-100,100,0);
        
        slider1.setPreferredSize(new Dimension(400,350));
        slider2.setPreferredSize(new Dimension(400,350));
        
        /** Slider 1 */
        slider1.setPaintTicks(true);
        slider1.setMajorTickSpacing(25);
        slider1.setMinorTickSpacing(5);

        slider1.setPaintLabels(true);
        slider1.setPaintTrack(true);
        slider1.setFont(new Font("MV Boli", Font.PLAIN,15));
        slider1.setOrientation(SwingConstants.HORIZONTAL);

        /** Slider 2 */
        slider2.setPaintTicks(true);
        slider2.setMajorTickSpacing(25);
        slider2.setMinorTickSpacing(5);

        slider2.setPaintLabels(true);
        slider2.setPaintTrack(true);
        slider2.setFont(new Font("MV Boli", Font.PLAIN,15));
        slider2.setOrientation(SwingConstants.HORIZONTAL);

        /** Sum Calculation */
        label = new JLabel("", SwingConstants.CENTER);
        label.setText("Sum = " + (slider1.getValue() + slider2.getValue()));
        slider1.addChangeListener(this);
        slider2.addChangeListener(this);

        panel1.setBounds(0,0,400,350);
        panel1.setLayout(new BorderLayout());
        panel2.setBounds(400,400,400,350);
        panel2.setLayout(new BorderLayout());


        frame.setLayout(new GridLayout(2,1));
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new BorderLayout());

        panel1.add(slider1, BorderLayout.CENTER);

        panel2.add(slider2, BorderLayout.CENTER);
        panel2.add(label,BorderLayout.SOUTH);

        frame.add(panel1);
        frame.add(panel2);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("Sum = " + (slider1.getValue() + slider2.getValue()));
    }
    
}
