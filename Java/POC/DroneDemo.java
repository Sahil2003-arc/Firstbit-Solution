package assignment;

class Drone {
    int droneId;
    String model;
    int flightTime;

    int getDroneId(){
        return droneId;
    }

    void setDroneId(int id){
        this.droneId = id;
    }

    String getModel(){
        return model;
    }

    void setModel(String m){
        this.model=m;
    }

    int getFlightTime(){
        return flightTime;
    }

    void setFlightTime(int ft){
        this.flightTime=ft;
    }

    Drone(){
        this.droneId=101;
        this.model="GenericModel";
        this.flightTime=60;
    }

    Drone(int id,String m,int ft){
        this.droneId=id;
        this.model=m;
        this.flightTime=ft;
    }

    void display() {
        System.out.println("Drone ID: "+this.droneId);
        System.out.println("Model: "+this.model);
        System.out.println("Flight Time (mins):"+this.flightTime);
    }
}

class SurveillanceDrone extends Drone{
    int cameraResolution; 
    boolean nightVision;
    boolean thermalSensor;

    int getCameraResolution(){
        return cameraResolution;
    }

    void setCameraResolution(int cr){
        this.cameraResolution=cr;
    }

    boolean isNightVision(){
        return nightVision;
    }

    void setNightVision(boolean nv){
        this.nightVision=nv;
    }

    boolean isThermalSensor(){
        return thermalSensor;
    }

    void setThermalSensor(boolean ts){
        this.thermalSensor=ts;
    }

    SurveillanceDrone(){
        super();
        this.cameraResolution=12;
        this.nightVision=true;
        this.thermalSensor=true;
    }

    SurveillanceDrone(int id,String m,int ft,int cr,boolean nv,boolean ts){
        super(id,m,ft);
        this.cameraResolution=cr;
        this.nightVision=nv;
        this.thermalSensor=ts;
    }

    void display() {
        super.display();
        System.out.println("Camera Resolution: "+this.cameraResolution + " MP");
        System.out.println("Night Vision: "+(this.nightVision ? "Enabled" : "Disabled"));
        System.out.println("Thermal Sensor: "+(this.thermalSensor ? "Present" : "Absent"));
    }
}

class CombatDrone extends Drone{
    String munitionType;
    boolean targetLockingRadarSystem;

    String getMunitionType(){
        return munitionType;
    }

    void setMunitionType(String mt){
        this.munitionType=mt;
    }

    boolean isTargetLockingRadarSystem(){
        return targetLockingRadarSystem;
    }

    void setTargetLockingRadarSystem(boolean radar){
        this.targetLockingRadarSystem=radar;
    }

    CombatDrone() {
        super();
        this.munitionType="Laser";
        this.targetLockingRadarSystem=true;
    }

    CombatDrone(int id,String m,int ft,String mt,boolean radar){
        super(id, m, ft);
        this.munitionType=mt;
        this.targetLockingRadarSystem=radar;
    }

    void display() {
        super.display();
        System.out.println("Munition Type: "+this.munitionType);
        System.out.println("Target Locking Radar: "+(this.targetLockingRadarSystem ? "Enabled" : "Disabled"));
    }
}

public class DroneDemo{
    public static void main(String[] args){
        Drone d1=new Drone();
        d1.display();

        System.out.println("\n--- Surveillance Drone ---");
        SurveillanceDrone sd=new SurveillanceDrone(201,"SkyEye-X",90,24,true,true);
        sd.display();

        System.out.println("\n--- Combat Drone ---");
        CombatDrone cd=new CombatDrone(301,"BattleHawk",75,"Missile",true);
        cd.display();
    }
}
