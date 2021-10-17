package github.kunwar45;

import java.util.ArrayList;

public class Player {

    public static String username;
    public static double initValue;
    public static ArrayList<Double> historyValues = new ArrayList<>();
    public static double currentValue;

    public Player(String name, double money){
        username = name;
        initValue = money;
        currentValue = money;
        historyValues.add(money);
    }

    public String getUsername(){
        return username;
    }

    public double getInitValue(){
        return initValue;
    }

    public double getCurrentValue(){
        return currentValue;
    }

    public static ArrayList<Double> getHistoryValues() {
        return historyValues;
    }

    public void addValue(double value, boolean won){

        if (won){
            currentValue += value;
        }
        else {
            currentValue -= value;
        }

        historyValues.add(currentValue);
    }
}
