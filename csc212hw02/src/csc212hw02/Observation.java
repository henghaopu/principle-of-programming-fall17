/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw02;

/**
 *
 * @author Heng-Hao Pu
 */
public class Observation {
    private String date;
    private int windSpeed; // MPH(Miles per hour)
    private int temperature; // degrees F
    private double windChill;
    
    public Observation(String date, int windSpeed, int temperature) {
        this.date = date;
        this.windSpeed = windSpeed;
        this.temperature = temperature;
        this.windChill = getWindChill();
    }
    
    public double getWindChill() {
//        double temperatureInCelsius = (temperature - 32) * (5 / 9.0);
//        double windSpeedInKPH = 1.60934 * windSpeed;
//        double windSpeedInMPS = 0.44704 * windSpeed;
//        double wciOriginal = (10 * Math.sqrt(windSpeedInMPS) - windSpeedInMPS +10.5) * (33 - temperatureInCelsius);
//        double windChillIndexInCanada = 
//                13.12 + (0.6215 * temperatureInCelsius) - 11.37 * Math.pow(windSpeedInKPH, 0.16) 
//                + 0.3965 * temperatureInCelsius * Math.pow(windSpeedInKPH, 0.16);
        double windChillIndexInTheUS = 
                35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) 
                + 0.4275 * temperature * Math.pow(windSpeed, 0.16);  
        return windChillIndexInTheUS;
    }
    
    public String getDate() {
        return date;
    }
}
