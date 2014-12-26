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

    Calculation(){
        RadioButtonPanel radioButtonPanel = new RadioButtonPanel();
        EnterValuePanel enterValuePanel = new EnterValuePanel();

        powerResult = enterValuePanel.getDissipationPower() - (HEAT_TRANSFER_COEFFICIENT * radioButtonPanel.getCabinetSquare() *
                (enterValuePanel.getInsideTemperature() - enterValuePanel.getOutsideTemperature()));

        powerResult = new BigDecimal(powerResult).setScale(1, RoundingMode.UP).doubleValue();

        if(powerResult > 0){
            result = "Холодильный агрегат мощностью: " + Double.toString(powerResult) + " Вт";
        }
        else if(powerResult < 0){
            result = "Обогревательный агрегат мощностью: " + Double.toString(Math.abs(powerResult)) + " Вт";
        }
        else{
            result = "0.0";
        }
    }
}
