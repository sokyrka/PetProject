import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Created by quattro on 17.12.2014.
 */
public class EnterValuePanel extends JPanel {

    private static double cabinetWidth;
    private static double cabinetHeight;
    private static double cabinetDepth;
    private static double insideTemperature;
    private static double outsideTemperature;
    private static double dissipationPower;

    public void setCabinetWidth(double width){
        this.cabinetWidth = width;
    }

    public double getCabinetWidth(){
        return cabinetWidth;
    }

    public void setCabinetHeight(double height){
        this.cabinetHeight = height;
    }

    public double getCabinetHeight(){
        return  cabinetHeight;
    }

    public void setCabinetDepth(double depth){
        this.cabinetDepth = depth;
    }

    public double getCabinetDepth(){
        return cabinetDepth;
    }

    public void setInsideTemperature(double insideTemperature){
        this.insideTemperature = insideTemperature;
    }

    public double getInsideTemperature(){
        return insideTemperature;
    }

    public void setOutsideTemperature(double outsideTemperature){
        this.outsideTemperature = outsideTemperature;
    }

    public double  getOutsideTemperature(){
        return outsideTemperature;
    }

    public void setDissipationPower(double dissipationPower){
        this.dissipationPower = dissipationPower;
    }

    public double getDissipationPower(){
        return dissipationPower;
    }

    JLabel labelWidth, labelHeight, labelDepth, labelInsideTemperature, labelOutsideTemperature, labelPower;
    JTextField textFieldWidth, textFieldHeight, textFieldDepth, textFieldInsideTemperature, textFieldOutsideTemperature, textFieldDissipationPower;

    public void makeLabel(JLabel l, String s, Font f){
        l = new JLabel(s);
        l.setFont(f);
        add(l);
    }

    EnterValuePanel(){

        setPreferredSize(new Dimension(210, 100));
        setLayout(new FlowLayout(FlowLayout.LEFT));

        Font fontLabel = new Font("ROMAN_BASELINE", Font.BOLD, 16);
        Font fontTextField = new Font("ROMAN_BASELINE", Font.LAYOUT_LEFT_TO_RIGHT, 16);

        makeLabel(labelWidth, "Ширина шкафа, м", fontLabel);

        textFieldWidth = new JTextField("0", 6);
        textFieldWidth.setFont(fontTextField);
        add(textFieldWidth);

        makeLabel(labelHeight, "Высота шкафа, м", fontLabel);

        textFieldHeight = new JTextField("0", 6);
        textFieldHeight.setFont(fontTextField);
        add(textFieldHeight);

        makeLabel(labelDepth, "Глубина шкафа, м", fontLabel);

        textFieldDepth = new JTextField("0", 6);
        textFieldDepth.setFont(fontTextField);
        add(textFieldDepth);

        makeLabel(labelInsideTemperature, "Внутренняя температура", fontLabel);

        textFieldInsideTemperature = new JTextField("0", 6);
        textFieldInsideTemperature.setFont(fontTextField);
        add(textFieldInsideTemperature);

        makeLabel(labelOutsideTemperature, "Внешняя температура", fontLabel);

        textFieldOutsideTemperature = new JTextField("0", 6);
        textFieldOutsideTemperature.setFont(fontTextField);
        add(textFieldOutsideTemperature);

        makeLabel(labelPower, "Рассеиваемая мощность", fontLabel);

        textFieldDissipationPower = new JTextField("0", 6);
        textFieldDissipationPower.setFont(fontTextField);
        add(textFieldDissipationPower);


        try{
            textFieldWidth.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    textFieldWidth.setText("");
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (textFieldWidth.getText().equals("")) {
                        textFieldWidth.setText("0");
                    } else {
                        try {
                            setCabinetWidth(Double.parseDouble(textFieldWidth.getText()));
                        } catch (Exception ex) {
                            ex.getStackTrace();
                        }
                    }

                }
            });

            textFieldHeight.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    textFieldHeight.setText("");
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if(textFieldHeight.getText().equals("")) {
                        textFieldHeight.setText("0");
                    }
                    else{
                        try{
                            setCabinetHeight(Double.parseDouble(textFieldHeight.getText()));
                        }catch (Exception ex){
                            ex.getStackTrace();
                        }
                    }
                }
            });

            textFieldDepth.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    textFieldDepth.setText("");
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if(textFieldDepth.getText().equals("")) {
                        textFieldDepth.setText("0");
                    }
                    else{
                        try{
                            setCabinetDepth(Double.parseDouble(textFieldDepth.getText()));
                        }catch (Exception ex){
                            ex.getStackTrace();
                        }
                    }
                }
            });

            textFieldInsideTemperature.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    textFieldInsideTemperature.setText("");
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if(textFieldInsideTemperature.getText().equals("")){
                        textFieldInsideTemperature.setText("0");
                    }
                    else{
                        try{
                            setInsideTemperature(Double.parseDouble(textFieldInsideTemperature.getText()));
                        }catch (Exception ex){
                            ex.getStackTrace();
                        }
                    }

                }
            });

            textFieldOutsideTemperature.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    textFieldOutsideTemperature.setText("");
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if(textFieldOutsideTemperature.getText().equals("")) {
                        textFieldOutsideTemperature.setText("0");
                    }
                    else{
                        try{
                            setOutsideTemperature(Double.parseDouble(textFieldOutsideTemperature.getText()));
                        }catch (Exception ex){
                            ex.getStackTrace();
                        }
                    }
                }
            });

            textFieldDissipationPower.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    textFieldDissipationPower.setText("");
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if(textFieldDissipationPower.getText().equals("")) {
                        textFieldDissipationPower.setText("0");
                    }
                    else{
                        try{
                            setDissipationPower(Double.parseDouble(textFieldDissipationPower.getText()));
                        }catch (Exception ex){
                            ex.getStackTrace();
                        }
                    }
                }
            });
        }
        catch (NullPointerException ex){
            ex.printStackTrace();
        }
    }
}
