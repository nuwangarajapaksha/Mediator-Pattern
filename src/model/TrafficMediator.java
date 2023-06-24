/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author NUWAA
 */
public interface TrafficMediator {
    public abstract void addVehicle(Vehicle vehicle);
    public abstract void addLane(Lane lane);
    public abstract List getVehicleList();
    public abstract List getLaneList();
    public abstract void addVehicleToLane(Vehicle vehicle, Lane lane);
    public abstract String getInformation(Lane lane);
}
