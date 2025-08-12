package assignment;

class CyberThreat {
    int threatId;
    String threatName;
    String severityLevel;

    int getThreatId() {
        return threatId;
    }
    void setThreatId(int id) {
        this.threatId=id;
    }

    String getThreatName() {
        return threatName;
    }
    void setThreatName(String name) {
        this.threatName=name;
    }

    String getSeverityLevel() {
        return severityLevel;
    }
    void setSeverityLevel(String level) {
        this.severityLevel=level;
    }

    CyberThreat() {
        this.threatId=1;
        this.threatName="Generic Threat";
        this.severityLevel="Medium";
    }

    CyberThreat(int id,String name,String level) {
        this.threatId=id;
        this.threatName=name;
        this.severityLevel=level;
    }

    void display() {
        System.out.println("Threat ID:"+this.threatId);
        System.out.println("Threat Name:"+this.threatName);
        System.out.println("Severity Level:"+this.severityLevel);
    }
}

class PhishingAttack extends CyberThreat {
    String sourceEmail;
    String fakeURL;
    String targetedUser;

    PhishingAttack() {
        super();
        this.sourceEmail="fake@mail.com";
        this.fakeURL="http://fakebank.com";
        this.targetedUser="User123";
    }

    PhishingAttack(int id,String name,String level,String email,String url,String user) {
        super(id,name,level);
        this.sourceEmail=email;
        this.fakeURL=url;
        this.targetedUser=user;
    }

    void display() {
        super.display();
        System.out.println("Source Email:"+this.sourceEmail);
        System.out.println("Fake URL:"+this.fakeURL);
        System.out.println("Targeted User:"+this.targetedUser);
    }
}

class MalwareAttack extends CyberThreat {
    String malwareType;
    String affectedSystem;
    String infectionMethod;

    MalwareAttack() {
        super();
        this.malwareType="Ransomware";
        this.affectedSystem="Windows Server";
        this.infectionMethod="Email Attachment";
    }

    MalwareAttack(int id,String name,String level,String type,String system,String method) {
        super(id,name,level);
        this.malwareType=type;
        this.affectedSystem=system;
        this.infectionMethod=method;
    }

    void display() {
        super.display();
        System.out.println("Malware Type:"+this.malwareType);
        System.out.println("Affected System:"+this.affectedSystem);
        System.out.println("Infection Method:"+this.infectionMethod);
    }
}

class DDoSAttack extends CyberThreat {
    String attackVector;
    int durationMinutes;
    int botCount;

    DDoSAttack() {
        super();
        this.attackVector="HTTP Flood";
        this.durationMinutes=120;
        this.botCount=5000;
    }

    DDoSAttack(int id,String name,String level,String vector,int duration,int bots) {
        super(id,name,level);
        this.attackVector=vector;
        this.durationMinutes=duration;
        this.botCount=bots;
    }

    void display() {
        super.display();
        System.out.println("Attack Vector:"+this.attackVector);
        System.out.println("Duration (min):"+this.durationMinutes);
        System.out.println("Bot Count:"+this.botCount);
    }
}

public class CyberThreatDemo {
    public static void main(String[] args) {
        CyberThreat ct=new CyberThreat();
        ct.display();

        System.out.println("\n--- Phishing Attack ---");
        PhishingAttack pa=new PhishingAttack(101,"Email Scam","High","fraud@fake.com","http://scam.link","Raj");
        pa.display();

        System.out.println("\n--- Malware Attack ---");
        MalwareAttack ma=new MalwareAttack(102,"WannaCry","Critical","Worm","En_Server","USB Infection");
        ma.display();

        System.out.println("\n--- DDoS Attack ---");
        DDoSAttack dd=new DDoSAttack(103,"Botnet Flood","Severe","UDP Amplification",180,8000);
        dd.display();
    }
}
