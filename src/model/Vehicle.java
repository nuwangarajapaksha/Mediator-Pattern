/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author NUWAA
 */
public class Vehicle {

    private TrafficMediator trafficMediator;
    private String vehicleNumber;
    private double speed;

    public Vehicle(TrafficMediator trafficMediator, String vehicleNumber, double speed) {
        super();
        this.trafficMediator = trafficMediator;
        this.vehicleNumber = vehicleNumber;
        this.speed = speed;
    }

    public TrafficMediator getTrafficMediator() {
        return trafficMediator;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

}
