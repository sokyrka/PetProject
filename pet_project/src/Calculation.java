import java.math.*;

/**
 * Created by quattro on 18.12.2014.
 */
public class Calculation {
    public static final double HEAT_TRANSFER_COEFFICIENT = 5.5;
    private double powerResult;
    private String result;

    public String getResult(){
        return result;
    }
    public void setResult(String s){
        this.result = s;
    }

    Calculation(){

        RadioButtonPanel radioButtonPanel = new RadioButtonPanel();
        EnterValuePanel enterValuePanel = new EnterValuePanel();

        powerResult = enterValuePanel.getDissipationPower() - (HEAT_TRANSFER_COEFFICIENT * radioButtonPanel.getCabinetSquare() *
                    (enterValuePanel.getInsideTemperature() - enterValuePanel.getOutsideTemperature()));

        powerResult = new BigDecimal(powerResult).setScale(1, RoundingMode.UP).doubleValue();

        if(powerResult > 0){
            setResult("Холодильный агрегат мощностью: " + Double.toString(powerResult) + " Вт");
        }
        else if(powerResult < 0){
            setResult("Обогревательный агрегат мощностью: " + Double.toString(Math.abs(powerResult)) + " Вт");
        }
        else{
            setResult("0.0");
        }
    }
}
