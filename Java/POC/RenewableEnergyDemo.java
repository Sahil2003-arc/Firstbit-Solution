package assignment;

class RenewableEnergyPlant {
    int plantId;
    String location;
    double capacityMW;

    int getPlantId() {
        return plantId;
    }
    void setPlantId(int id) {
        this.plantId=id;
    }

    String getLocation() {
        return location;
    }
    void setLocation(String loc) {
        this.location=loc;
    }

    double getCapacityMW() {
        return capacityMW;
    }
    void setCapacityMW(double cap) {
        this.capacityMW=cap;
    }

    RenewableEnergyPlant() {
        this.plantId=100;
        this.location="Unknown";
        this.capacityMW=50.0;
    }

    RenewableEnergyPlant(int id,String loc,double cap) {
        this.plantId=id;
        this.location=loc;
        this.capacityMW=cap;
    }

    void display() {
        System.out.println("Plant ID:"+this.plantId);
        System.out.println("Location:"+this.location);
        System.out.println("Capacity:"+this.capacityMW+" MW");
    }
}

class SolarFarm extends RenewableEnergyPlant {
    String panelType;
    double sunlightHours;
    String inverterType;

    SolarFarm() {
        super();
        this.panelType="Monocrystalline";
        this.sunlightHours=6.5;
        this.inverterType="Central Inverter";
    }

    SolarFarm(int id,String loc,double cap,String pt,double sh,String inv) {
        super(id,loc,cap);
        this.panelType=pt;
        this.sunlightHours=sh;
        this.inverterType=inv;
    }

    void display() {
        super.display();
        System.out.println("Panel Type:"+this.panelType);
        System.out.println("Sunlight Hours:"+this.sunlightHours+" hrs/day");
        System.out.println("Inverter Type:"+this.inverterType);
    }
}

class WindTurbine extends RenewableEnergyPlant {
    int turbineCount;
    double bladeLength;
    double windSpeed;

    WindTurbine() {
        super();
        this.turbineCount=20;
        this.bladeLength=45.0;
        this.windSpeed=12.5;
    }

    WindTurbine(int id,String loc,double cap,int tc,double bl,double ws) {
        super(id,loc,cap);
        this.turbineCount=tc;
        this.bladeLength=bl;
        this.windSpeed=ws;
    }

    void display() {
        super.display();
        System.out.println("Turbine Count:"+this.turbineCount);
        System.out.println("Blade Length:"+this.bladeLength+" m");
        System.out.println("Wind Speed:"+this.windSpeed+" m/s");
    }
}


public class RenewableEnergyDemo {
    public static void main(String[] args) {
        RenewableEnergyPlant p1=new RenewableEnergyPlant();
        p1.display();

        System.out.println("\n--- Solar Farm ---");
        SolarFarm sf=new SolarFarm(201,"Rajasthan",75.5,"Polycrystalline",7.0,"String Inverter");
        sf.display();

        System.out.println("\n--- Wind Turbine Farm ---");
        WindTurbine wf=new WindTurbine(301,"Tamil Nadu",120.0,30,50.0,14.0);
        wf.display();

        
    }
}
