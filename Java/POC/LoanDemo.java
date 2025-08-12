package assignment;

class Loan {
    int loanId;
    String borrowerName;
    double principalAmount;

    int getLoanId() {
        return loanId;
    }
    void setLoanId(int id) {
        this.loanId=id;
    }

    String getBorrowerName() {
        return borrowerName;
    }
    void setBorrowerName(String name) {
        this.borrowerName=name;
    }

    double getPrincipalAmount() {
        return principalAmount;
    }
    void setPrincipalAmount(double amt) {
        this.principalAmount=amt;
    }

    Loan() {
        this.loanId=1001;
        this.borrowerName="Default Borrower";
        this.principalAmount=500000.0;
    }

    Loan(int id,String name,double amt) {
        this.loanId=id;
        this.borrowerName=name;
        this.principalAmount=amt;
    }

    void display() {
        System.out.println("Loan ID:"+this.loanId);
        System.out.println("Borrower Name:"+this.borrowerName);
        System.out.println("Principal Amount:"+this.principalAmount);
    }
}

class HomeLoan extends Loan {
    String propertyAddress;
    double interestRate;

    HomeLoan() {
        super();
        this.propertyAddress="123 Main Street";
        this.interestRate=7.5;
    }

    HomeLoan(int id,String name,double amt,String address,double rate) {
        super(id,name,amt);
        this.propertyAddress=address;
        this.interestRate=rate;
    }

    void display() {
        super.display();
        System.out.println("Property Address:"+this.propertyAddress);
        System.out.println("Interest Rate:"+this.interestRate+"%");
    }
}

class EducationLoan extends Loan {
    String courseName;
    String institutionName;

    EducationLoan() {
        super();
        this.courseName="Computer Science";
        this.institutionName="ABC University";
    }

    EducationLoan(int id,String name,double amt,String course,String institution) {
        super(id,name,amt);
        this.courseName=course;
        this.institutionName=institution;
    }

    void display() {
        super.display();
        System.out.println("Course Name:"+this.courseName);
        System.out.println("Institution Name:"+this.institutionName);
    }
}

class PersonalLoan extends Loan {
    String purpose;
    int creditScore;
    String employmentStatus;

    PersonalLoan() {
        super();
        this.purpose="Medical Emergency";
        this.creditScore=720;
        this.employmentStatus="Employed";
    }

    PersonalLoan(int id,String name,double amt,String p,int score,String status) {
        super(id,name,amt);
        this.purpose=p;
        this.creditScore=score;
        this.employmentStatus=status;
    }

    void display() {
        super.display();
        System.out.println("Purpose:"+this.purpose);
        System.out.println("Credit Score:"+this.creditScore);
        System.out.println("Employment Status:"+this.employmentStatus);
    }
}

public class LoanDemo {
    public static void main(String[] args) {
        Loan l1=new Loan();
        l1.display();

        System.out.println("\n--- Home Loan ---");
        HomeLoan hl=new HomeLoan(2001,"Sahil",1500000.0,"456 Park Avenue",6.8);
        hl.display();

        System.out.println("\n--- Education Loan ---");
        EducationLoan el=new EducationLoan(3001,"Pooja",500000.0,"MBA","Dbatu Institute");
        el.display();

        System.out.println("\n--- Personal Loan ---");
        PersonalLoan pl=new PersonalLoan(4001,"Raj",300000.0,"Wedding",690,"Self-Employed");
        pl.display();
    }
}
