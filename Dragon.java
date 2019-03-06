package model;
public class Dragon{
	//constants
	public final static char FEMALE ='F'; //dragon sex female
	public final static char MALE = 'M'; //dragon sex male
	
	
	//atributes
	private String name; //name of the dragon
	private double weight; //weight of the dragon
	private double height; //height of the dragon
	private char sex; //sex of the dragon (male or female)
	private double temperature; //body temperature of the dragon
	private double foodconsume; // quantity of food that the dragon consumes
	
	//relations
	private Date birthDate; //relation between Date class and Dragon class. It represents the birth date of the dragon
	
	//methods
	public Dragon(String n, double we, double h, Date bd, char s, double t){ //constructor method
		name = n;
		weight = we;
		height = h;
		birthDate = bd;
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
	
	public Date birthDateD(){ //method that returns the birth date of the dragon
		return birthDate;
	}	
	
	public char getSexD(){
		return sex;
	}
	public void setSexD(char sex){
		this.sex = sex;
	}	
	
	public double getAreaD(){ //method that calculates the area that the dragon requires
		return  getHeightD() * 8;
	}
	
	public double getTemperatureD(){
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
	
	public double imcD(){  //method that calculates the IMC of the dragon
		return weight/(height*height);
	}
	
	public double waterConsumeD(){ //method that calculates the amount of water that the dragon needs
		return (imcD() * 0.75);
	}
	
	public String report() { //method that prints information about the dragon
		String msg = "Name: " + getNameD();
		msg = msg+ "\nHeight: " + getHeightD();
  	   	msg = msg + "\nWeight: " + getWeightD();
		msg= msg + "\nSex: " + getSexD();
		msg= msg+ "\nBirth date: " + birthDateD().getString();
		return msg;
	}
}