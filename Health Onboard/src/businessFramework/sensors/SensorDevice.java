/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.sensors;

import java.util.ArrayList;

/**
 *
 * @author jhalaksurve
 */
public class SensorDevice {
    
    private String sensorName;
    private String sensorId;
    private HRSensorMeasurements hRSensorMeasurements;
    private ArrayList<HRSensorMeasurements> measurementList;
    
    public SensorDevice()
    {
        this.hRSensorMeasurements = new HRSensorMeasurements();
        measurementList= new ArrayList<>();
    }
    
    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public HRSensorMeasurements gethRSensorMeasurements() {
        return hRSensorMeasurements;
    }

    
    @Override
    public String toString() {
        return this.sensorName;
    }
    
}
