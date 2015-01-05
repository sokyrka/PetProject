import javax.swing.*;
import java.awt.*;

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
        ImageIcon img = new ImageIcon(getClass().getResource("img/cooling_icon.png"));
        setIconImage(img.getImage());

        JTextArea textArea = new JTextArea();
        add(textArea);
        textArea.setLineWrap(true);
        textArea.setEditable(false);
        textArea.setBackground(Color.LIGHT_GRAY);
        textArea.setFont(new Font("Verdana", Font.PLAIN, 16));
        textArea.setPreferredSize(new Dimension(400, 200));
        String s = "\n\n\n    Cooling Master -  расчет мощности холодильного \n" +
                "    или обогревающего агрегата для установки в шкаф. \n" +
                "    V 1.0\n" +
                "    Евгений Сокирка\n" +
                "    Mailto: sokyrka_evgeniy@yahoo.com\n" +
                "    2014 - 2015";
        textArea.setText(s);
    }
}
