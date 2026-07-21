/*
    JSlider
        JSlider is swing component in java that allows user to select the value by dragging a knob along the horizontal or vertical track.

    • Syntax
        JSlider slider = new JSlider(min, max, initialValue);

                 javax.swing.JComponent
                           ▲
                           │
+-------------------------------------------------------------+
|                  javax.swing.JSlider                        |
+-------------------------------------------------------------+
| + setValue(value: int): void                                |
| + getValue(): int                                           |
| + setMinimum(min: int): void                                |
| + setMaximum(max: int): void                                |
| + setOrientation(orientation: int): void                    |
| + setMajorTickSpacing(spacing: int): void                   |
| + setMinorTickSpacing(spacing: int): void                   |
| + setPaintTicks(flag: boolean): void                        |
| + setPaintLabels(flag: boolean): void                       |
| + setPaintTrack(flag: boolean): void                        |
| + setSnapToTicks(flag: boolean): void                       |
| + setEnabled(enabled: boolean): void                        |
+-------------------------------------------------------------+
*/

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Dimension;
import java.awt.Font;

class myJSlider extends JFrame implements ChangeListener{

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    public myJSlider(){
        frame = new JFrame("ShowJSlider");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);

        slider.setPreferredSize(new Dimension(400,200));

        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(25);
        slider.setMinorTickSpacing(5);
        
        slider.setPaintLabels(true);
        slider.setPaintTrack(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN,15));

        slider.setOrientation(SwingConstants.VERTICAL);

        label.setText("°C : " + slider.getValue());
        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
       label.setText("°C : " + slider.getValue());
    }



}

public class _01JSlider {
    public static void main(String[] args) {
        JFrame frame = new myJSlider();
        frame.setLocationRelativeTo(null);
    }
}
