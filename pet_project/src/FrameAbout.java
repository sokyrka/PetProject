import javax.swing.*;

/**
 * Created by quattro on 26.12.2014.
 */
public class FrameAbout extends JFrame {
    FrameAbout(){
        super("О программе");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        ImageIcon img = new ImageIcon("img/cooling_icon.png");
        setIconImage(img.getImage());
    }
}
