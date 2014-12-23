import javax.swing.*;
import javax.swing.border.LineBorder;
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

    EnterValuePanel(){

        setPreferredSize(new Dimension(210, 100));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        //setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        //setBorder(new LineBorder(Color.red));

        JLabel labelWidth = new JLabel("Ширина шкафа");
        labelWidth.setFont(new Font("ROMAN_BASELINE", Font.BOLD, 16));
        add(labelWidth);

        final JTextField textFieldWidth = new JTextField("0", 6);
        textFieldWidth.setFont(new Font("ROMAN_BASELINE", Font.LAYOUT_LEFT_TO_RIGHT, 16));
        add(textFieldWidth);

        JLabel labelHeight = new JLabel("Высота шкафа");
        labelHeight.setFont(new Font("ROMAN_BASELINE", Font.BOLD, 16));
        add(labelHeight);

        final JTextField textFieldHeight = new JTextField("0", 6);
        textFieldHeight.setFont(new Font("ROMAN_BASELINE", Font.LAYOUT_LEFT_TO_RIGHT, 16));
        add(textFieldHeight);

        JLabel labelDepth = new JLabel("Глубина шкафа");
        labelDepth.setFont(new Font("ROMAN_BASELINE", Font.BOLD, 16));
        add(labelDepth);

        final JTextField textFieldDepth = new JTextField("0", 6);
        textFieldDepth.setFont(new Font("ROMAN_BASELINE", Font.LAYOUT_LEFT_TO_RIGHT, 16));
        add(textFieldDepth);

        JLabel labelInsideTemperature = new JLabel("Внутренняя температура");
        labelInsideTemperature.setFont(new Font("ROMAN_BASELINE", Font.BOLD, 16));
        add(labelInsideTemperature);

        final JTextField textFieldInsideTemperature = new JTextField("0", 6);
        textFieldInsideTemperature.setFont(new Font("ROMAN_BASELINE", Font.LAYOUT_LEFT_TO_RIGHT, 16));
        add(textFieldInsideTemperature);

        JLabel labelOutsideTemperature = new JLabel("Внешняя температура");
        labelOutsideTemperature.setFont(new Font("ROMAN_BASELINE", Font.BOLD, 16));
        add(labelOutsideTemperature);

        final JTextField textFieldOutsideTemperature = new JTextField("0", 6);
        textFieldOutsideTemperature.setFont(new Font("ROMAN_BASELINE", Font.LAYOUT_LEFT_TO_RIGHT, 16));
        add(textFieldOutsideTemperature);

        JLabel labelPower = new JLabel("Рассеиваемая мощность");
        labelPower.setFont(new Font("ROMAN_BASELINE", Font.BOLD, 16));
        add(labelPower);

        final JTextField textFieldDissipationPower = new JTextField("0", 6);
        textFieldDissipationPower.setFont(new Font("ROMAN_BASELINE", Font.LAYOUT_LEFT_TO_RIGHT, 16));
        add(textFieldDissipationPower);


        textFieldWidth.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textFieldWidth.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(textFieldWidth.getText().equals("")){
                    textFieldWidth.setText("0");
                }
                else{
                    try{
                        setCabinetWidth(Double.parseDouble(textFieldWidth.getText()));
                    }catch (Exception ex){
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
}
