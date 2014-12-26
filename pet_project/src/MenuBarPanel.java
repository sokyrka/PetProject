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

        JMenuItem menuItemTheory =  new JMenuItem("Теория рассчета");
        menuHelp.add(menuItemTheory);
        menuItemTheory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameTheory frameTheory = new FrameTheory();
            }
        });

        JMenuItem menuItemAbout = new JMenuItem("О программе");
        menuHelp.add(menuItemAbout);
        menuItemAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameAbout frameAbout = new FrameAbout();
            }
        });

        menuHelp.addSeparator();

        JMenuItem menuItemExit = new JMenuItem("Выход");
        menuHelp.add(menuItemExit);
        menuItemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });





    }
}
