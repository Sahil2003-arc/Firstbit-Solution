package assignment;

class Satellite {
    int satId;
    String name;
    String launchDate;

    int getSatId() {
        return satId;
    }
    void setSatId(int id) {
        this.satId=id;
    }

    String getName() {
        return name;
    }
    void setName(String n) {
        this.name=n;
    }

    String getLaunchDate() {
        return launchDate;
    }
    void setLaunchDate(String d) {
        this.launchDate=d;
    }

    Satellite() {
        this.satId=1001;
        this.name="GenericSat";
        this.launchDate="2020-01-01";
    }

    Satellite(int id, String n, String date) {
        this.satId=id;
        this.name=n;
        this.launchDate=date;
    }

    void display() {
        System.out.println("Satellite ID: "+this.satId);
        System.out.println("Name: "+this.name);
        System.out.println("Launch Date: "+this.launchDate);
    }
}

class WeatherSatellite extends Satellite {
    int resolution;
    String sensors;
    String coverageArea;

    WeatherSatellite() {
        super();
        this.resolution=20;
        this.sensors="Infrared, Visible";
        this.coverageArea="Global";
    }

    WeatherSatellite(int id,String n,String date,int res,String sen,String area) {
        super(id,n,date);
        this.resolution=res;
        this.sensors=sen;
        this.coverageArea=area;
    }

    void display() {
        super.display();
        System.out.println("Resolution: "+this.resolution+" MP");
        System.out.println("Sensors: "+this.sensors);
        System.out.println("Coverage Area: "+this.coverageArea);
    }
}

class NavigationSatellite extends Satellite {
    String systemName;
    double accuracyMeter;
    double altitudeKm;

    NavigationSatellite() {
        super();
        this.systemName="GPS";
        this.accuracyMeter=5.0;
        this.altitudeKm=20200.0;
    }

    NavigationSatellite(int id,String n,String date,String sys,double acc,double alt) {
        super(id,n,date);
        this.systemName=sys;
        this.accuracyMeter=acc;
        this.altitudeKm=alt;
    }

    void display() {
        super.display();
        System.out.println("System Name: "+this.systemName);
        System.out.println("Accuracy (m): "+this.accuracyMeter);
        System.out.println("Altitude (km): "+this.altitudeKm);
    }
}

class CommunicationSatellite extends Satellite {
    double bandwidth; 
    String coverageRegion;

    CommunicationSatellite() {
        super();
        this.bandwidth=12.0;
        this.coverageRegion="Asia-Pacific";
    }

    CommunicationSatellite(int id,String n,String date,double bw,String region) {
        super(id,n,date);
        this.bandwidth=bw;
        this.coverageRegion=region;
    }

    void display() {
        super.display();
        System.out.println("Bandwidth:"+this.bandwidth+" GHz");
        System.out.println("Coverage Region: "+this.coverageRegion);
    }
}

public class SatelliteDemo {
    public static void main(String[] args) {
        Satellite s1=new Satellite();
        s1.display();

        System.out.println("\n--- Weather Satellite ---");
        WeatherSatellite ws=new WeatherSatellite(2001,"WeatherX","2022-03-15",30,"Thermal,Visible","Northern Hemisphere");
        ws.display();

        System.out.println("\n--- Navigation Satellite ---");
        NavigationSatellite ns=new NavigationSatellite(3001,"NavStar","2023-06-10","GNSS",3.2,21000.0);
        ns.display();

        System.out.println("\n--- Communication Satellite ---");
        CommunicationSatellite cs=new CommunicationSatellite(4001,"ComSat-A","2021-11-20",18.5,"Global");
        cs.display();
    }
}
