package SolitaireViewer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.Image;

public class CardTableFrame extends JFrame{

    JButton king_of_club_Button;
    JButton queen_of_hearts_Button;
    JButton jack_of_spades_Button;
    JButton queen_of_diamonds_Button;

    ImageIcon king_of_club;
    ImageIcon queen_of_hearts;
    ImageIcon jack_of_spades;
    ImageIcon queen_of_diamonds;
    ImageIcon red_joker;

    static final int CARD_WIDTH = 100;
    static final int CARD_HEIGHT = 145;

    public CardTableFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        king_of_club = loadScaledIcon("miscellaneous/src/SolitaireViewer/CardResources/king_of_clubs2.png");
        queen_of_hearts = loadScaledIcon("miscellaneous/src/SolitaireViewer/CardResources/queen_of_hearts2.png");
        jack_of_spades = loadScaledIcon("miscellaneous/src/SolitaireViewer/CardResources/jack_of_spades2.png");
        queen_of_diamonds = loadScaledIcon("miscellaneous/src/SolitaireViewer/CardResources/queen_of_diamonds.png");
        red_joker = loadScaledIcon("miscellaneous/src/SolitaireViewer/CardResources/red_joker.png");


        king_of_club_Button = new JButton(red_joker);
        queen_of_hearts_Button = new JButton(red_joker);
        jack_of_spades_Button = new JButton(red_joker);
        queen_of_diamonds_Button = new JButton(red_joker);


        king_of_club_Button.setRolloverIcon(king_of_club);
        queen_of_hearts_Button.setRolloverIcon(queen_of_hearts);
        jack_of_spades_Button.setRolloverIcon(jack_of_spades);
        queen_of_diamonds_Button.setRolloverIcon(queen_of_diamonds);;

        add(king_of_club_Button);
        add(queen_of_hearts_Button);
        add(jack_of_spades_Button);
        add(queen_of_diamonds_Button);
        this.pack();
        this.setSize(800,400);
        this.setVisible(true);
    }

    private ImageIcon loadScaledIcon(String path){
        ImageIcon original = new ImageIcon(path);
        Image scaledImage = original.getImage().getScaledInstance(
                CARD_WIDTH, CARD_HEIGHT, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }
}
