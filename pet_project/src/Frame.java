import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by quattro on 10.12.2014.
 */
public class Frame extends JFrame {

    Frame() {
        super("Cooling master");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(650, 480);
        setResizable(false);
        setLocationRelativeTo(null);

        ImageIcon img = new ImageIcon("img/cooling_icon.png");
        setIconImage(img.getImage());

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menuHelp = new JMenu("Посмотреть справку");
        menuBar.add(menuHelp);

        JMenu menuAbout = new JMenu("О программе");
        menuBar.add(menuAbout);


        final RadioButtonPanel radioButtonPanel = new RadioButtonPanel();
        getContentPane().add(BorderLayout.EAST, radioButtonPanel);

        final JTextArea textArea = new JTextArea(1, 5);
        textArea.setFont(new Font("ROMAN_BASELINE", Font.BOLD, 26));
        textArea.setEditable(false);
        textArea.setBorder(new LineBorder(Color.black));
        getContentPane().add(BorderLayout.NORTH, textArea);

        final EnterValuePanel enterValuePanel = new EnterValuePanel();
        getContentPane().add(BorderLayout.WEST, enterValuePanel);

        final JButton button = new JButton("Рассчитать");
        getContentPane().add(BorderLayout.SOUTH, button);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calculation calculation = new Calculation();
                textArea.setText(calculation.getResult());

            }
        });
    }
}

