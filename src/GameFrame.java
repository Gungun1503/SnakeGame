import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(){
//    GamePanel panel=new GamePanel();  and for adding this object in this class ....
        this.add(new GamePanel());
        this.setTitle("SNAKE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);



    }
}
