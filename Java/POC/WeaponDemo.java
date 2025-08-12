package assignment;

class Weapon {
    int weaponId;
    String name;
    double weightKg;

    int getWeaponId() {
        return weaponId;
    }
    void setWeaponId(int id) {
        this.weaponId=id;
    }

    String getName() {
        return name;
    }
    void setName(String n) {
        this.name=n;
    }

    double getWeightKg() {
        return weightKg;
    }
    void setWeightKg(double w) {
        this.weightKg=w;
    }

    Weapon() {
        this.weaponId=101;
        this.name="Unknown Weapon";
        this.weightKg=2.5;
    }

    Weapon(int id,String n,double w) {
        this.weaponId=id;
        this.name=n;
        this.weightKg=w;
    }

    void display() {
        System.out.println("Weapon ID:"+this.weaponId);
        System.out.println("Name:"+this.name);
        System.out.println("Weight:"+this.weightKg+" kg");
    }
}

class Firearm extends Weapon {
    String caliber;
    int magazineCapacity;
    String fireMode;

    Firearm() {
        super();
        this.caliber="5.56mm";
        this.magazineCapacity=30;
        this.fireMode="Auto";
    }

    Firearm(int id,String n,double w,String cal,int mag,String mode) {
        super(id,n,w);
        this.caliber=cal;
        this.magazineCapacity=mag;
        this.fireMode=mode;
    }

    void display() {
        super.display();
        System.out.println("Caliber:"+this.caliber);
        System.out.println("Magazine Capacity:"+this.magazineCapacity);
        System.out.println("Fire Mode:"+this.fireMode);
    }
}

class Missile extends Weapon {
    double rangeKm;
    String guidanceSystem;
    String wType;

    Missile() {
        super();
        this.rangeKm=300.0;
        this.guidanceSystem="Infrared";
        this.wType="Explosive";
    }

    Missile(int id,String n,double w,double range,String guidance,String wt) {
        super(id,n,w);
        this.rangeKm=range;
        this.guidanceSystem=guidance;
        this.wType=wt;
    }

    void display() {
        super.display();
        System.out.println("Range:"+this.rangeKm+" km");
        System.out.println("Guidance System:"+this.guidanceSystem);
        System.out.println("Warhead Type:"+this.wType);
    }
}

class MeleeWeapon extends Weapon {
    String material;
    double bladeLengthCm;
    

    MeleeWeapon() {
        super();
        this.material="Steel";
        this.bladeLengthCm=40.0;
        
    }

    MeleeWeapon(int id,String n,double w,String mat,double bladeLen,boolean doubleEdge) {
        super(id,n,w);
        this.material=mat;
        this.bladeLengthCm=bladeLen;
       
    }

    void display() {
        super.display();
        System.out.println("Material:"+this.material);
        System.out.println("Blade Length:"+this.bladeLengthCm+" cm");
    }
}

public class WeaponDemo {
    public static void main(String[] args) {
        Weapon w1=new Weapon();
        w1.display();

        System.out.println("\n--- Firearm ---");
        Firearm f=new Firearm(201,"AK-47",3.1,"7.62mm",30,"Auto");
        f.display();

        System.out.println("\n--- Missile ---");
        Missile m=new Missile(301,"Agni-V",15.0,5000,"GPS","Nuclear");
        m.display();

        System.out.println("\n--- Melee Weapon ---");
        MeleeWeapon mw=new MeleeWeapon(401,"Katana",1.5,"Carbon Steel",70.0,false);
        mw.display();
    }
}
