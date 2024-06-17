/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observerlab;

/**
 *
 * @author USER
 */
class TrafficLights implements trafficinterface {
    private final subject  trafficLight;

    public TrafficLights(subject  trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void update() {
        System.out.println("Light is " + trafficLight.getColor());
    }
}

public class Observerlab{
    public static void main(String[] args) {
        subject trafficLight = new subject ();
        TrafficLights display1 = new TrafficLights(trafficLight);
        
        trafficLight.addObserver((trafficinterface) display1);
       

        trafficLight.setColor("Red");
        trafficLight.setColor("Yellow");
        trafficLight.setColor("Green");
    }
}
