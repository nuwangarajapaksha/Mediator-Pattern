/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NUWAA
 */
public class TrafficMediatorImpl implements TrafficMediator {

    private List<Vehicle> vehicleList;
    private List<Lane> laneList;

    public TrafficMediatorImpl() {
        vehicleList = new ArrayList<Vehicle>();
        laneList = new ArrayList<Lane>();
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    @Override
    public void addLane(Lane lane) {
        laneList.add(lane);
    }

    @Override
    public List<Vehicle> getVehicleList() {
        return this.vehicleList;
    }

    @Override
    public List<Lane> getLaneList() {
        return this.laneList;
    }

    @Override
    public void addVehicleToLane(Vehicle vehicle, Lane lane) {
        for (Lane l : laneList) {
            if (l.getLaneName().equalsIgnoreCase(lane.getLaneName())) {
                l.getVehicleList().add(vehicle);
            }
        }
    }

    @Override
    public String getInformation(Lane lane) {
        for (Lane l : laneList) {
            if (l.getLaneName().equalsIgnoreCase(lane.getLaneName())) {
                double total = 0;
                for (Vehicle v : l.getVehicleList()) {
                    total += v.getSpeed();
                }
                return "Lane Name : " + lane.getLaneName() +"\n"
                        +"Total Vehical Count = " + l.getVehicleList().size() +"\n"
                        +"Avarage Speed = " + total / (l.getVehicleList().size()) + "Kmph";
            }

        }
        return null;
    }

}
