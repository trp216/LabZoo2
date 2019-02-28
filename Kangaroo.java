package model;
import java.util.Calendar;
public class Kangaroo{
	//constants
	public final static String BA = "A";
	public final static String BB = "B";
	public final static String BAB = "AB";
	public final static String BO = "O";
	public final static char MALE = 'M';
	public final static char FEMALE = 'F';

	
	//atributes
	private String name;
	private double weight;
	private double height;
	private char sex;
	private String bloodtype;
	private double age;
	
	//methods
	public Kangaroo(String n, double we, double h, char s, String b, double ag){ 
		name = n;
		weight = we;
		height = h;
		sex = s;
		bloodtype = b;
		age = ag;
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
	
	public double getAreaK(){
		return  getHeightK() * 8;
	}

	public double getAgeK(){
		return age;
	}
	public void setAgeK(double age){
		this.age = age;
	}
	
	public double foodConsumeK(){
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
	
	public double imcK(){  //this method calculates the IMC of a kangaroo
		return (weight/(height*height));
	}
	
	public double waterConsumeK(){
		return (imcK() * 1.5);
	}		
	
	public String cardiacRisk(){
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
	
	public String vaccine() {
		String v = "";
		if (getAgeK()>1.0)
			v = "No vaccine required";
		else 
			v = "Vaccine required";
		return v;
	}
	
	public String report() {
		String msg = getNameK();
		msg = msg+getHeightK();
  	   	msg = msg +getWeightK();
		msg= msg +getSexK();
		msg = msg +getBloodTypeK();
		msg= msg+getAgeK();
		msg=msg+vaccine();
		msg=msg+cardiacRisk();
		return msg;
	}
}