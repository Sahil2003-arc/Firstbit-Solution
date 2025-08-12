package assignment;

class Account {
    int accountNo;
    String holderName;
    double balance;

    int getAccountNo() {
        return accountNo;
    }
    void setAccountNo(int no) {
        this.accountNo=no;
    }

    String getHolderName() {
        return holderName;
    }
    void setHolderName(String name) {
        this.holderName=name;
    }

    double getBalance() {
        return balance;
    }
    void setBalance(double bal) {
        this.balance=bal;
    }

    Account() {
        this.accountNo=1001;
        this.holderName="Default Name";
        this.balance=1000.0;
    }

    Account(int no,String name,double bal) {
        this.accountNo=no;
        this.holderName=name;
        this.balance=bal;
    }

    void display() {
        System.out.println("Account No:"+this.accountNo);
        System.out.println("Holder Name:"+this.holderName);
        System.out.println("Balance:"+this.balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;
    double minimumBalance;
    int withdrawalLimit;

    SavingsAccount() {
        super();
        this.interestRate=4.5;
        this.minimumBalance=1000.0;
        this.withdrawalLimit=5;
    }

    SavingsAccount(int no,String name,double bal,double rate,double min,int limit) {
        super(no,name,bal);
        this.interestRate=rate;
        this.minimumBalance=min;
        this.withdrawalLimit=limit;
    }

    void display() {
        super.display();
        System.out.println("Interest Rate:"+this.interestRate+"%");
        System.out.println("Minimum Balance:"+this.minimumBalance);
        System.out.println("Withdrawal Limit:"+this.withdrawalLimit);
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;
    String businessName;
    int transactionLimit;

    CurrentAccount() {
        super();
        this.overdraftLimit=50000.0;
        this.businessName="ABC Pvt Ltd";
        this.transactionLimit=10;
    }

    CurrentAccount(int no,String name,double bal,double od,String biz,int limit) {
        super(no,name,bal);
        this.overdraftLimit=od;
        this.businessName=biz;
        this.transactionLimit=limit;
    }

    void display() {
        super.display();
        System.out.println("Overdraft Limit:"+this.overdraftLimit);
        System.out.println("Business Name:"+this.businessName);
        System.out.println("Transaction Limit:"+this.transactionLimit);
    }
}

class FixedDepositAccount extends Account {
    double depositAmount;
    String maturityDate;
    int tenureMonths;

    FixedDepositAccount() {
        super();
        this.depositAmount=10000.0;
        this.maturityDate="2026-12-31";
        this.tenureMonths=36;
    }

    FixedDepositAccount(int no,String name,double bal,double amt,String date,int months) {
        super(no,name,bal);
        this.depositAmount=amt;
        this.maturityDate=date;
        this.tenureMonths=months;
    }

    void display() {
        super.display();
        System.out.println("Deposit Amount:"+this.depositAmount);
        System.out.println("Maturity Date:"+this.maturityDate);
        System.out.println("Tenure (months):"+this.tenureMonths);
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.display();

        System.out.println("\n--- Savings Account ---");
        SavingsAccount sa=new SavingsAccount(2001,"Raj",5000.0,5.0,1000.0,3);
        sa.display();

        System.out.println("\n--- Current Account ---");
        CurrentAccount ca=new CurrentAccount(3001,"Pooja",80000.0,100000.0,"TechCorp",20);
        ca.display();

        System.out.println("\n--- Fixed Deposit Account ---");
        FixedDepositAccount fda=new FixedDepositAccount(4001,"Sahil",20000.0,50000.0,"2027-06-30",60);
        fda.display();
    }
}
