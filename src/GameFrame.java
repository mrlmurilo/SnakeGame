import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame() {
        this.setUndecorated(true);
        this.add(new GamePanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
