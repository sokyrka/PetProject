import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by quattro on 18.12.2014.
 */
public class RadioButtonPanel extends JPanel implements ActionListener {
    static private double cabinetSquare;

    public double getCabinetSquare(){
        return cabinetSquare;
    }

    public void makeLabel(JLabel label, ImageIcon icon){
        label = new JLabel(icon);
        add(label);
    }

    JLabel firstСhoiceLabel, secondСhoiceLabel, thirdСhoiceLabel, fourthСhoiceLabel, fifthСhoiceLabel, sixthСhoiceLabel, seventhСhoiceLabel;

    RadioButtonPanel(){

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JRadioButton firstСhoiceButton = new JRadioButton("Один шкаф, свободно стоящий");
        add(firstСhoiceButton);
        firstСhoiceButton.setActionCommand("1");

        makeLabel(firstСhoiceLabel, new ImageIcon("img/firstСhoiceImg.png"));

        JRadioButton secondСhoiceButton = new JRadioButton("Один шкаф, монтируемый на стену");
        add(secondСhoiceButton);
        secondСhoiceButton.setActionCommand("2");

        makeLabel(secondСhoiceLabel, new ImageIcon("img/secondСhoiceImg.png"));

        JRadioButton thirdСhoiceButton = new JRadioButton("Крайний шкаф свободно стоящего ряда");
        add(thirdСhoiceButton);
        thirdСhoiceButton.setActionCommand("3");

        makeLabel(thirdСhoiceLabel, new ImageIcon("img/thirdСhoiceImg.png"));

        JRadioButton fourthСhoiceButton = new JRadioButton("Крайний шкаф в ряду, монтируемом на стену");
        add(fourthСhoiceButton);
        fourthСhoiceButton.setActionCommand("4");

        makeLabel(fourthСhoiceLabel, new ImageIcon("img/fourthСhoiceImg.png"));

        JRadioButton fifthСhoiceButton = new JRadioButton("Не крайний шкаф свободно стоящего ряда");
        add(fifthСhoiceButton);
        fifthСhoiceButton.setActionCommand("5");

        makeLabel(fifthСhoiceLabel, new ImageIcon("img/fifthСhoiceImg.png"));

        JRadioButton sixthСhoiceButton = new JRadioButton("Не крайний шкаф в ряду, монтируемом на стену");
        add(sixthСhoiceButton);
        sixthСhoiceButton.setActionCommand("6");

        makeLabel(sixthСhoiceLabel, new ImageIcon("img/sixthСhoiceImg.png"));

        JRadioButton seventhСhoiceButton = new JRadioButton("Не крайний шкаф в ряду, монтируемом на стену, под козырьком");
        add(seventhСhoiceButton);
        seventhСhoiceButton.setActionCommand("7");

        makeLabel(seventhСhoiceLabel, new ImageIcon("img/seventhСhoiceImg.png"));

        ArrayList<JRadioButton> arrayList = new ArrayList<JRadioButton>();
        arrayList.add(firstСhoiceButton);
        arrayList.add(secondСhoiceButton);
        arrayList.add(thirdСhoiceButton);
        arrayList.add(fourthСhoiceButton);
        arrayList.add(fifthСhoiceButton);
        arrayList.add(sixthСhoiceButton);
        arrayList.add(seventhСhoiceButton);

        ButtonGroup group = new ButtonGroup();
        for(int i = 0; i<arrayList.size(); i++){
            group.add(arrayList.get(i));
        }

        for(int k = 0; k< arrayList.size(); k++){
            arrayList.get(k).addActionListener(this);
        }

    }

    EnterValuePanel enterValuePanel = new EnterValuePanel();


    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("1")){
            cabinetSquare = 1.8 * enterValuePanel.getCabinetHeight() * (enterValuePanel.getCabinetWidth() + enterValuePanel.getCabinetDepth()) + 1.4 * enterValuePanel.getCabinetWidth() * enterValuePanel.getCabinetDepth();
        }else if(e.getActionCommand().equals("2")){
            cabinetSquare = 1.4 * enterValuePanel.getCabinetWidth() * (enterValuePanel.getCabinetHeight() + enterValuePanel.getCabinetDepth()) + 1.8 * enterValuePanel.getCabinetDepth() * enterValuePanel.getCabinetHeight();
        }else if(e.getActionCommand().equals("3")){
            cabinetSquare = 1.4 * enterValuePanel.getCabinetDepth() * (enterValuePanel.getCabinetHeight() + enterValuePanel.getCabinetWidth()) + 1.8 * enterValuePanel.getCabinetWidth() * enterValuePanel.getCabinetHeight();
        }else if(e.getActionCommand().equals("4")){
            cabinetSquare = 1.4 * enterValuePanel.getCabinetHeight() * (enterValuePanel.getCabinetWidth() + enterValuePanel.getCabinetDepth()) + 1.4 * enterValuePanel.getCabinetWidth() * enterValuePanel.getCabinetDepth();
        }else if(e.getActionCommand().equals("5")){
            cabinetSquare = 1.8 * enterValuePanel.getCabinetWidth() * enterValuePanel.getCabinetHeight() + 1.4 * enterValuePanel.getCabinetWidth() * enterValuePanel.getCabinetDepth() + enterValuePanel.getCabinetDepth() * enterValuePanel.getCabinetHeight();
        }else if(e.getActionCommand().equals("6")){
            cabinetSquare = 1.4 * enterValuePanel.getCabinetWidth() * (enterValuePanel.getCabinetHeight() + enterValuePanel.getCabinetDepth()) + enterValuePanel.getCabinetDepth() * enterValuePanel.getCabinetHeight();
        }else if(e.getActionCommand().equals("7")){
            cabinetSquare = 1.4 * enterValuePanel.getCabinetWidth() * enterValuePanel.getCabinetHeight() + 0.7 * enterValuePanel.getCabinetWidth() * enterValuePanel.getCabinetDepth() + enterValuePanel.getCabinetDepth() * enterValuePanel.getCabinetHeight();
        }
        else{
            cabinetSquare = 1.8 * enterValuePanel.getCabinetHeight() * (enterValuePanel.getCabinetWidth() + enterValuePanel.getCabinetDepth()) + 1.4 * enterValuePanel.getCabinetWidth() * enterValuePanel.getCabinetDepth();
        }
    }
}
