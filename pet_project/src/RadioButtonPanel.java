import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by quattro on 18.12.2014.
 */
public class RadioButtonPanel extends JPanel implements ActionListener {
    static private double cabinetSquare;

    public double getCabinetSquare(){
        return cabinetSquare;
    }

    RadioButtonPanel(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JRadioButton firstСhoiceButton = new JRadioButton("Один шкаф, свободно стоящий");
        add(firstСhoiceButton);
        JLabel firstСhoiceLabel = new JLabel(new ImageIcon("img/firstСhoiceImg.png"));
        add(firstСhoiceLabel);
        firstСhoiceButton.setActionCommand("1");

        JRadioButton secondСhoiceButton = new JRadioButton("Один шкаф, монтируемый на стену");
        add(secondСhoiceButton);
        JLabel secondСhoiceLabel = new JLabel(new ImageIcon("img/secondСhoiceImg.png"));
        add(secondСhoiceLabel);
        secondСhoiceButton.setActionCommand("2");

        JRadioButton thirdСhoiceButton = new JRadioButton("Крайний шкаф свободно стоящего ряда");
        add(thirdСhoiceButton);
        JLabel thirdСhoiceLabel = new JLabel(new ImageIcon("img/thirdСhoiceImg.png"));
        add(thirdСhoiceLabel);
        thirdСhoiceButton.setActionCommand("3");

        JRadioButton fourthСhoiceButton = new JRadioButton("Крайний шкаф в ряду, монтируемом на стену");
        add(fourthСhoiceButton);
        JLabel fourthСhoiceLabel = new JLabel(new ImageIcon("img/fourthСhoiceImg.png"));
        add(fourthСhoiceLabel);
        fourthСhoiceButton.setActionCommand("4");

        JRadioButton fifthСhoiceButton = new JRadioButton("Не крайний шкаф свободно стоящего ряда");
        add(fifthСhoiceButton);
        JLabel fifthСhoiceLabel = new JLabel(new ImageIcon("img/fifthСhoiceImg.png"));
        add(fifthСhoiceLabel);
        fifthСhoiceButton.setActionCommand("5");

        JRadioButton sixthСhoiceButton = new JRadioButton("Не крайний шкаф в ряду, монтируемом на стену");
        add(sixthСhoiceButton);
        JLabel sixthСhoiceLabel = new JLabel(new ImageIcon("img/sixthСhoiceImg.png"));
        add(sixthСhoiceLabel);
        sixthСhoiceButton.setActionCommand("6");

        JRadioButton seventhСhoiceButton = new JRadioButton("Не крайний шкаф в ряду, монтируемом на стену, под козырьком");
        add(seventhСhoiceButton);
        JLabel seventhСhoiceLabel = new JLabel(new ImageIcon("img/seventhСhoiceImg.png"));
        add(seventhСhoiceLabel);
        seventhСhoiceButton.setActionCommand("7");

        ButtonGroup group = new ButtonGroup();
        group.add(firstСhoiceButton);
        group.add(secondСhoiceButton);
        group.add(thirdСhoiceButton);
        group.add(fourthСhoiceButton);
        group.add(fifthСhoiceButton);
        group.add(sixthСhoiceButton);
        group.add(seventhСhoiceButton);

        firstСhoiceButton.addActionListener(this);
        secondСhoiceButton.addActionListener(this);
        thirdСhoiceButton.addActionListener(this);
        fourthСhoiceButton.addActionListener(this);
        fifthСhoiceButton.addActionListener(this);
        sixthСhoiceButton.addActionListener(this);
        seventhСhoiceButton.addActionListener(this);
    }

    EnterValuePanel enterValuePanel = new EnterValuePanel();

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("1")){
            cabinetSquare = 1.8 * enterValuePanel.getCabinetHeight() * (enterValuePanel.getCabinetWidth() + enterValuePanel.getCabinetDepth()) + 1.4 * enterValuePanel.getCabinetWidth() * enterValuePanel.getCabinetDepth();
        }if(e.getActionCommand().equals("2")){
            cabinetSquare = 1.4 * enterValuePanel.getCabinetWidth() * (enterValuePanel.getCabinetHeight() + enterValuePanel.getCabinetDepth()) + 1.8 * enterValuePanel.getCabinetDepth() * enterValuePanel.getCabinetHeight();
        }if(e.getActionCommand().equals("3")){
            cabinetSquare = 1.4 * enterValuePanel.getCabinetDepth() * (enterValuePanel.getCabinetHeight() + enterValuePanel.getCabinetWidth()) + 1.8 * enterValuePanel.getCabinetWidth() * enterValuePanel.getCabinetHeight();
        }if(e.getActionCommand().equals("4")){
            cabinetSquare = 1.4 * enterValuePanel.getCabinetHeight() * (enterValuePanel.getCabinetWidth() + enterValuePanel.getCabinetDepth()) + 1.4 * enterValuePanel.getCabinetWidth() * enterValuePanel.getCabinetDepth();
        }if(e.getActionCommand().equals("5")){
            cabinetSquare = 1.8 * enterValuePanel.getCabinetWidth() * enterValuePanel.getCabinetHeight() + 1.4 * enterValuePanel.getCabinetWidth() * enterValuePanel.getCabinetDepth() + enterValuePanel.getCabinetDepth() * enterValuePanel.getCabinetHeight();
        }if(e.getActionCommand().equals("6")){
            cabinetSquare = 1.4 * enterValuePanel.getCabinetWidth() * (enterValuePanel.getCabinetHeight() + enterValuePanel.getCabinetDepth()) + enterValuePanel.getCabinetDepth() * enterValuePanel.getCabinetHeight();
        }if(e.getActionCommand().equals("7")){
            cabinetSquare = 1.4 * enterValuePanel.getCabinetWidth() * enterValuePanel.getCabinetHeight() + 0.7 * enterValuePanel.getCabinetWidth() * enterValuePanel.getCabinetDepth() + enterValuePanel.getCabinetDepth() * enterValuePanel.getCabinetHeight();
        }
    }
}
