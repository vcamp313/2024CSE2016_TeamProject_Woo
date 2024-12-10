import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartButton extends Button implements ActionListener {
    public MainFrame frame;
    public GameFrame game;

    public StartButton(MainFrame f, GameFrame g) {
        super("Start");
        frame = f;
        game = g;
        addActionListener(this);

    }
    public void actionPerformed(ActionEvent e) {
        frame.setVisible(false);
        game.setVisible(true);
    }
}
