import javax.swing.*;
import java.awt.*;

/**
 * Created by quattro on 26.12.2014.
 */
public class FrameTheory extends JFrame {
    FrameTheory(){
        super("Теория расчета");
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
        textArea.setFont(new Font("Verdana", Font.PLAIN, 12));
        textArea.setPreferredSize(new Dimension(400, 200));
        String s = "\n\n\n   Для расчета используют следующие переменные и параметры: \n" +
                "\n" +
                "   Ш – ширина шкафа (м), В – высота шкафа (м), Г – глубина шкафа (м), \n" +
                "   Ti – желаемая (рабочая) температура внутри шкафа, \n" +
                "   Tо – максимальная или минимальная температура окружающей среды, \n" +
                "   Qv – тепловые потери, выделяемые оборудованием внутри шкафа (Вт). \n" +
                "\n" +
                "   Выбрать тип расположения шкафа и нажать кнопку \"Рассчитать\".";
        textArea.setText(s);


    }
}
