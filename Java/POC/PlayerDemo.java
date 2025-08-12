package assignment;

class Player{
	
	int age;
	int jer_no;
	String Gender;
	String name;
	int getAge() {
		return age;
	}
	void setAge(int a) {
		this.age = a;
	}
	int getJer_no() {
		return jer_no;
	}
	void setJer_no(int jn) {
		this.jer_no = jn;
	}
	String getGender() {
		return Gender;
	}
	void setGender(String g) {
		Gender = g;
	}
	String getName() {
		return name;
	}
	void setName(String nm) {
		this.name = nm;
	}
	
	Player(){
		this.age=23;
		this.jer_no=07;
		this.Gender="Not Defined";
		this.name="Sahil";
	}
	Player(int a,int jn,String g,String nm){
		this.age=a;
		this.jer_no=jn;
		this.Gender=g;
		this.name=nm;
	}
	
	 void display() {
			System.out.println("Age :"+this.age);
			System.out.println("Jer_no:"+this.jer_no);
			System.out.println("Gender:"+this.Gender);
			System.out.println("Name:"+this.name);
		}
}


class CricketPlayer extends Player{
	int no_ofruns;
	int no_ofwickets;
	int no_ofcatches;
	int getNo_ofruns() {
		return no_ofruns;
	}
	void setNo_ofruns(int r) {
		this.no_ofruns = r;
	}
	int getNo_ofwickets() {
		return no_ofwickets;
	}
	void setNo_ofwickets(int w) {
		this.no_ofwickets = w;
	}
	int getNo_ofcatches() {
		return no_ofcatches;
	}
	void setNo_ofcatches(int c) {
		this.no_ofcatches = c;
	}
	
	CricketPlayer(){
		super();
		this.no_ofruns=100;
		this.no_ofwickets=50;
		this.no_ofcatches=50;
	}
	
	CricketPlayer(int a,int jn,String g,String nm,int r,int c,int w){
		super(a,jn,g,nm);
		this.no_ofruns=r;
		this.no_ofwickets=c;
		this.no_ofcatches=w;
	}
	
	void display() {
		super.display();
		System.out.println("Age :"+this.no_ofruns);
		System.out.println("Jer_no:"+this.no_ofwickets);
		System.out.println("Gender:"+this.no_ofcatches);
		
	}
}

class FootballPlayer extends Player{
	int no_ofgoals;
	int no_ofpenalti;
	int getNo_ofgoals() {
		return no_ofgoals;
	}
	void setNo_ofgoals(int gl) {
		this.no_ofgoals = gl;
	}
	int getNo_ofpenati() {
		return no_ofpenalti;
	}
	void setNo_ofpenati(int p) {
		this.no_ofpenalti = p;
	}
	
	
	FootballPlayer(){
		super();
		this.no_ofgoals=10;
		this.no_ofpenalti=5;
	}
	
	FootballPlayer(int a,int jn,String g,String nm,int gl,int p){
		super(a,jn,g,nm);
		this.no_ofgoals=gl;
		this.no_ofpenalti=p;
	}
	
	void Display() {
		super.display();
		System.out.println("No of Goals :"+this.no_ofgoals);
		System.out.println("No of Penalti:"+this.no_ofpenalti);

	}
	
}


public class PlayerDemo {

	public static void main(String[] args) {
		Player p1=new Player();
		p1.display();
		System.out.println();
//		Player p2=new Player(23,07,"Male","Raj");
//		p2.display();
//		Player p3=new Player(33,02,"Female","pooja");
//		p2.display();

		
		CricketPlayer c1=new CricketPlayer(33,02,"Female","pooja",120,55,60);
		c1.display();
	
		System.out.println();
        
        FootballPlayer f1=new FootballPlayer(23,07,"Male","Raj",10,3);
        f1.Display();
	}

}
