package model;
import java.util.Calendar;
public class Dragon{
	//constants
	public final static char FEMALE ='F';
	public final static char MALE = 'M';
	
	
	//atributes
	private String name;
	private double weight;
	private double height;
	private double age;
	private char sex;
	private double temperature;
	private double foodconsume;
	
	//methods
	public Dragon(String n, double we, double h, double a, char s, double t){
		name = n;
		weight = we;
		height = h;
		age = a;
		sex = s;
		temperature = t;
	}
	
	public String getNameD(){
		return name;
	}
	public void setNameD(String name){
		this.name = name;
	}
	
	public double getWeightD(){
		return weight;
	}
	public void setWeightD(double weight){
		this.weight = weight;
	}

	public double getHeightD(){
		return height;
	}
	public void setHeightD(double height){
		this.height = height;
	}		
	
	public double getAgeD(){
		return age;
	}
	public void setAgeD(int age){
		this.age = age;
	}	
	
	public char getSexD(){
		return sex;
	}
	public void setSexD(char sex){
		this.sex = sex;
	}	
	
	public double getAreaD(){
		return  getHeightD() * 8;
	}
	
	public double getTemperaureD(){
		return temperature;
	}
	public void setTemperatureD(double temperature){
		this.temperature = temperature;
	}	
	
	public double getFoodConsumeD(){
		return foodconsume;
	}
	public void setFoodConsumeD(double foodconsume){
		this.foodconsume = foodconsume;
	}
	
	public double imcD(){  //this method calculates the IMC of a dragon
		return weight/(height*height);
	}
	
	public double waterConsumeD(){
		return (imcD() * 0.75);
	}
	
	public String report() {
		String msg = getNameD();
		msg = msg+getHeightD();
  	   	msg = msg +getWeightD();
		msg= msg +getSexD();
		msg= msg+getAgeD();
		return msg;
	}
}