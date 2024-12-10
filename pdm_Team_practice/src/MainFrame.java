import javax.swing.*;
import java.awt.*;



public class MainFrame extends JFrame {
    GameFrame gameFrame;

    public MainFrame(GameFrame g) {
        gameFrame = g;
        setVisible(true);
        setTitle("Team Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);

        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        pane.add(new StartButton(this,g), BorderLayout.NORTH);

    }

    public void switchFrame(){
        setVisible(false);
    }
}
