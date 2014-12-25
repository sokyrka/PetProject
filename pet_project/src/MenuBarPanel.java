import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by quattro on 25.12.2014.
 */
public class MenuBarPanel extends JMenuBar {

    MenuBarPanel(){
        JMenu menuHelp = new JMenu("Посмотреть справку");
        add(menuHelp);

        JMenuItem menuItemTheory =  new JMenuItem("Теория");
        menuItemTheory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = new JFrame("Theory");
                jFrame.setSize(500, 300);
                jFrame.setLocationRelativeTo(null);
                jFrame.setResizable(false);
                jFrame.setVisible(true);
            }
        });
        menuHelp.add(menuItemTheory);

        JMenuItem menuItemAbout = new JMenuItem("О программе");
        menuItemAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = new JFrame("About");
                jFrame.setSize(500, 300);
                jFrame.setLocationRelativeTo(null);
                jFrame.setResizable(false);
                jFrame.setVisible(true);
            }
        });
        menuHelp.add(menuItemAbout);
        menuHelp.addSeparator();
        JMenuItem menuItemExit = new JMenuItem("Выход");
        menuItemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuHelp.add(menuItemExit);


    }
}
