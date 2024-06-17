/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerlab;

/**
 *
 * @author USER
 */
public abstract class concreteobserver implements trafficinterface {
    private final subject  trafficLight;

    public concreteobserver(subject  trafficLight) {
        this.trafficLight = trafficLight;
        display();
    }

    
    public void display() {
        System.out.println("Traffic Light is now " + trafficLight.getColor());
    }
}
