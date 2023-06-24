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
public class Lane {

    private TrafficMediator trafficMediator;
    private String laneName;
    private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    public Lane(TrafficMediator trafficMediator, String laneName) {
        this.trafficMediator = trafficMediator;
        this.laneName = laneName;
    }

    public String getLaneName() {
        return laneName;
    }

    public void setLaneName(String laneName) {
        this.laneName = laneName;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public String getInformation(){
       return trafficMediator.getInformation(this);
    }
    
}
