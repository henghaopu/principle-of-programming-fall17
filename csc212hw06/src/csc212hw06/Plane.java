/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw06;

/**
 *
 * @author hpu
 */
public class Plane {

    private String flightNumber;
    private int rowNumber;
    private int seatNumber;
    private Passenger[][] passengers;

    public Plane(String flightNumber, int rowNumber, int seatNumber) {
        this.flightNumber = flightNumber;
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
        passengers = new Passenger[this.rowNumber][this.seatNumber];
    }

    public boolean addPassenger(String passengerName, int row, int seat) {
        if (row < rowNumber && row >= 0 && seat < seatNumber && seat >= 0) {
            if (passengers[row][seat] == null) {
                Passenger passenger = new Passenger(passengerName);
                passengers[row][seat] = passenger;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean removePassenger(int row, int seat) {
        if (row < rowNumber && row >= 0 && seat < seatNumber && seat >= 0) {
            if (passengers[row][seat] != null) {
                passengers[row][seat] = null;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void showSeats() {
        for (int i = 0; i < rowNumber + 1; i++) {
            for (int j = 0; j < seatNumber; j++) {
                if (i == 0) {
                    if (j == 0) {
                        System.out.printf("  |%10s|", j);
                    } else {
                        System.out.printf("|%10s|", j);
                    }
                } else {
                    if (j == 0) {
                        System.out.printf("%2d", i - 1);
                    }

                    System.out.printf("|%10s|", (passengers[i - 1][j] == null) ? " " : passengers[i - 1][j].getName());
                }
            }
            System.out.println();
        }
    }

    public void passengerList() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < seatNumber; j++) {
                if (passengers[i][j] != null) {
                    System.out.println(passengers[i][j]);
                }
            }
        }
    }
}
