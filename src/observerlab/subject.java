/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerlab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */

public class subject {
    private String color;
    private final List<trafficinterface > observers = new ArrayList<>();

    public void addObserver(trafficinterface  observer) {
        observers.add(observer);
    }

    public void setColor(String color) {
        this.color = color;
        notifyObservers();
    }

    public String getColor() {
        return this.color;
    }

    private void notifyObservers() {
        for (trafficinterface observer : observers) {
            observer.update();
        }
    }
}
    

