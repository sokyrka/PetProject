import javax.swing.*;
import java.awt.event.*;

/**
 * Created by quattro on 17.12.2014.
 */
public class EnterValuePanel extends JPanel {

    static private double cabinetWidth;
    static private double cabinetHeight;
    static private double cabinetDepth;
    static private double insideTemperature;
    static private double outsideTemperature;
    static private double dissipationPower;

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
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        final JTextField textFieldWidth = new JTextField("Enter Width", 12);
        add(textFieldWidth);

        final JTextField textFieldHeight = new JTextField("Enter Height", 12);
        add(textFieldHeight);

        final JTextField textFieldDepth = new JTextField("Enter Depth", 12);
        add(textFieldDepth);

        final JTextField textFieldInsideTemperature = new JTextField("Enter inside temperature", 12);
        add(textFieldInsideTemperature);

        final JTextField textFieldOutsideTemperature = new JTextField("Enter outside temperature", 12);
        add(textFieldOutsideTemperature);

        final JTextField textFieldDissipationPower = new JTextField("Enter power", 12);
        add(textFieldDissipationPower);


        textFieldWidth.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textFieldWidth.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(textFieldWidth.getText().equals("")){
                    textFieldWidth.setText("Enter Width");
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
                    textFieldHeight.setText("Enter Height");
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
                    textFieldDepth.setText("Enter Depth");
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
                    textFieldInsideTemperature.setText("Enter inside temperature");
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
                    textFieldOutsideTemperature.setText("Enter outside temperature");
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
                    textFieldDissipationPower.setText("Enter Power");
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
