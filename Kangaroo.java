package model;
public class Kangaroo{
	//constants
	public final static String BA = "A"; //blood type A
	public final static String BB = "B"; //blood type B
	public final static String BAB = "AB"; //blood type AB
	public final static String BO = "O"; //blood type O
	public final static char MALE = 'M'; //kangaroo sex male
	public final static char FEMALE = 'F'; //kangaroo sex female

	
	//atributes
	private String name; //name of the kangaroo
	private double weight; //weight of the kangaroo
	private double height; // height of the kangaroo
	private char sex; //sex of the kangaroo (male or female)
	private String bloodtype; //blood type of the kangaroo (A, B, O, AB)
	
	//relations
	private Date birthDate; //relation between Date class and Kangaroo class. It represents the birth date of the kangaroo
	
	//methods
	public Kangaroo(String n, double we, double h, char s, String b,  Date f){ //constructor method 
		name = n;
		weight = we;
		height = h;
		sex = s;
		bloodtype = b;
		birthDate = f;
	}
	
	public Date birthDateK() { //method that returns the birth date of the kangaroo
		return birthDate;
	}
	
	public String getNameK(){
		return name;
	}
	public void setNameK(String name){
		this.name = name;
	}
	
	public double getWeightK(){
		return weight;
	}
	public void setWeightK(double weight){
		this.weight = weight;
	}	
	
	public double getHeightK(){
		return height;
	}
	public void setHeightK(double height){
		this.height = height;
	}	
	
	public char getSexK() {
		return sex;
	}
	
	public void setSexK(char sex) {
		this.sex = sex;
	}
	
	public String getBloodTypeK() {
		return bloodtype;
	}
	
	public void setBloodTypeK(String bloodtype) {
		this.bloodtype = bloodtype;
	}
	
	public double getAreaK(){ //method that calculates the area that the kangaroo requires
		return  getHeightK() * 8;
	}
	
	public double foodConsumeK(){ //method that calculates the quantity of the food that the kangaroo requires
		double food=0;
		if (weight<30.0) {
			food=weight*0.8;
		}
		if (30<weight && weight<48) { //
			food=weight*1.1;
		}
		else {
			food=((weight-48)*0.4)+40;
		}
		return food;
	}
	
	public double imcK(){  //this method calculates the IMC of the kangaroo
		return (weight/(height*height));
	}
	
	public double waterConsumeK(){
		return (imcK() * 1.5);
	}		
	
	public String cardiacRisk(){ //method that calculates the level of cardiac risk of the kangaroo
		String answer = "";
		if(imcK()<18.0) {
			if(bloodtype==BA || bloodtype==BAB) 
				answer = "Low Risk";
			else
				answer = "Moderate Risk";
		}
		if(imcK()>18.0 && imcK()<25.0) 
			answer =  "Low Risk";
		if(imcK()>25.0) {
			if(bloodtype==BAB) 
				answer = "Moderate Risk";
			else
				answer = "High Risk";
		}
		return answer;
	}
	
	
	public String report() { //this method prints information about the kangaroo
		String msg = "Name: " +getNameK();
		msg = msg+ "\nHeight: " + getHeightK();
  	   	msg = msg + "\nWeight: " + getWeightK();
		msg = msg + "\nSex: " + getSexK();
		msg = msg + "\nBlood type: " + getBloodTypeK();
		msg = msg+ "\nCardiac risk: " + cardiacRisk();
		msg = msg + "\nBirth date: " + birthDateK().getString();
		return msg;
	}
}