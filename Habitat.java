package model;

public class Habitat{
	//Constants
	public final static char KANGAROOZONE='K'; //type of habitat (kangaroo's habitat)
	public final static char DRAGONZONE='D'; //type of habitat (dragon's habitat)
	
	//atributes
	private double area; //area of the habitat
	private double temperature; //temperature of the habitat
	private double humidity; //humidity of the habitat
	private String name; //name od the habitat
	private double water; //quantity of water on the habitat
	private double foodh; //quantity of food on the habitat
	private char type; //type of habitat (kangaroo's habitat or dragon's habitat)
	
	//relations
		//this relations represent the kangaroo's that could be on a kangaroo's habitat
		private Kangaroo kangaroo1; 
		private Kangaroo kangaroo2;
		private Kangaroo kangaroo3;
		
		//this relations represent the dragon's on the dragon's habitat
		private Dragon dragon1;
		private Dragon dragon2;

	//methods
	public Habitat(double a, double t, double h, String n, double w, double fh, char ty, Kangaroo k1, Kangaroo k2, Kangaroo k3, Dragon d1, Dragon d2){//constructor method
		area = a;
		temperature = t;
		humidity = h;
		name = n;
		water = w;
		foodh = fh;
		type = ty;
		
		kangaroo1= k1;
		kangaroo2 = k2;
		kangaroo3 = k3;
		dragon1 = d1;
		dragon2 = d2;
	}
	
	
	public Kangaroo getK1(){ 
		return kangaroo1;
	}
	public void setK1(Kangaroo kangaroo1){
		this.kangaroo1 = kangaroo1;
	}
	
	public Kangaroo getK2(){
		return kangaroo2;
	}
	public void setK2(Kangaroo kangaroo2){
		this.kangaroo2 = kangaroo2;
	}	
	
	public Kangaroo getK3(){
		return kangaroo3;
	}
	public void setK3(Kangaroo kangaroo3){
		this.kangaroo3 = kangaroo3;
	}	
	
	
	public Dragon getD1(){
		return dragon1;
	}
	public void setD1(Dragon dragon1){
		this.dragon1 = dragon1;
	}
	
	public Dragon getD2(){
		return dragon2;
	}
	public void setD2(Dragon dragon2){
		this.dragon2 = dragon2;
	}
	
	public double getAreaS() {//this method return the real area of the habitat
		return area;
	}
	
	public double requiredAreaS(){ //this method calculates the area that the kangaroo's and the dragon's require
		double arear = 0.0;
		if(type == KANGAROOZONE) {
			if(kangaroo1 != null)
				arear = kangaroo1.getAreaK();
			if(kangaroo2 != null)
				arear = arear + kangaroo2.getAreaK();
			if(kangaroo3 != null)
				arear = arear + kangaroo3.getAreaK();
		}
		else if(type == DRAGONZONE) {
			if(dragon1 != null)
				arear = dragon1.getAreaD();
			if(dragon2 != null)
				arear = arear + dragon2.getAreaD();
		}
		return arear;
	}	
	
	public String notArea() { //method that alerts the user if the area of the habitat is less that the required area
		String msga = "";
		if(getAreaS() < requiredAreaS()) {
			double x = requiredAreaS() - getAreaS();
			msga = "Alert!: The real area should be "+ x +"bigger";
		}
		return msga;
	}
	
	public double getTemperatureH(){
		return temperature;
	}
	public void setTemperatureH(int temperature){
		this.temperature = temperature;
	}
	
	public double getHumidityH(){
		return humidity;
	}
	public void setHumidityH(double humidity){
		this.humidity = humidity;
	}
	
	public String getNameH(){
			return name;
		}
	public void setNameH(String name){
		this.name = name;
	}
	
	public double getFoodH() {
		return foodh;
	}
	
	public void setFoodH(double foodh) {
		this.foodh = foodh;
	}
	
	public double foodH(){//method that calculates the amount of food required for a kangaroo's habitat
		double food=0;
		if (type==KANGAROOZONE) {
		if(kangaroo1!=null) {
			food+=kangaroo1.foodConsumeK();
			}
		if(kangaroo2!=null) {
			food+=kangaroo2.foodConsumeK();
			}
		if(kangaroo3!=null) {
			food+=kangaroo3.foodConsumeK();
			}
		}
		return food;
	}
	
	public double getWaterH(){
		return water;
	}
	public void setWaterH(double water){
		this.water = water;
	}
	
	public double requiredWater() {//method that calculates the total amount of water required for the animals, depending on its habitat
		double water=0;
		if(kangaroo1!=null) {
			water+=kangaroo1.waterConsumeK();
			}
		if(kangaroo2!=null) {
			water+=kangaroo2.waterConsumeK();
			}
		if(kangaroo3!=null) {
			water+=kangaroo3.waterConsumeK();
			}
		if(dragon1!=null) {
			water+=dragon1.waterConsumeD();
		}
		if(dragon2!=null) {
			water+=dragon2.waterConsumeD();
		}
		return water;
	}
	
	public String foodD() { //method that alerts the user if the amount of food in the habitat is less than the required amount on the dragon's habitat
		String message = "The amount of food is OK";
		if (type == DRAGONZONE) {
			if (getFoodH()<5.0) 
				message = "The amount of food is less than 5 kilos";
		}
			return message;
	}
	
	public String waterComparison() { //method that alerts the user if the amount of water in the habitat is less than the required amount
		String msg="Water level is OK";
		if(getWaterH()<requiredWater()) {
			msg="Water levels are under the minimum required";
		}
		return msg;
	}
	
	public String vocalsH() { //method that evaluates which animals names start and end with a vocal
		String y = "";
		if(kangaroo1 != null) {
			if((kangaroo1.getNameK().charAt(0) == 'A' || kangaroo1.getNameK().charAt(0) == 'E' || kangaroo1.getNameK().charAt(0) == 'I' || kangaroo1.getNameK().charAt(0) == 'O' || kangaroo1.getNameK().charAt(0) == 'U') && (kangaroo1.getNameK().endsWith("a") || kangaroo1.getNameK().endsWith("e") || kangaroo1.getNameK().endsWith("i") || kangaroo1.getNameK().endsWith("o") || kangaroo1.getNameK().endsWith("u"))) {
				y = kangaroo1.getNameK();
			}
		}
		if(kangaroo2 != null) {
			if((kangaroo2.getNameK().charAt(0) == 'A' || kangaroo2.getNameK().charAt(0) == 'E' || kangaroo2.getNameK().charAt(0) == 'I' || kangaroo2.getNameK().charAt(0) == 'O' || kangaroo2.getNameK().charAt(0) == 'U') && (kangaroo2.getNameK().endsWith("a") || kangaroo2.getNameK().endsWith("e") || kangaroo2.getNameK().endsWith("i") || kangaroo2.getNameK().endsWith("o") || kangaroo2.getNameK().endsWith("u"))) {
				y = y + " " + kangaroo2.getNameK();
			}
		}
		if(kangaroo3 != null) {
			if((kangaroo3.getNameK().charAt(0) == 'A' || kangaroo3.getNameK().charAt(0) == 'E' || kangaroo3.getNameK().charAt(0) == 'I' || kangaroo3.getNameK().charAt(0) == 'O' || kangaroo3.getNameK().charAt(0) == 'U') && (kangaroo3.getNameK().endsWith("a") || kangaroo3.getNameK().endsWith("e") || kangaroo3.getNameK().endsWith("i") || kangaroo3.getNameK().endsWith("o") || kangaroo3.getNameK().endsWith("u"))) {
				y = y + " " + kangaroo3.getNameK();
				}
		}
		if(dragon1 != null) {
			if((dragon1.getNameD().charAt(0) == 'A' || dragon1.getNameD().charAt(0) == 'E' || dragon1.getNameD().charAt(0) == 'I' || dragon1.getNameD().charAt(0) == 'O' || dragon1.getNameD().charAt(0) == 'U') && (dragon1.getNameD().endsWith("a") || dragon1.getNameD().endsWith("e") || dragon1.getNameD().endsWith("i") || dragon1.getNameD().endsWith("o") || dragon1.getNameD().endsWith("u"))) {
				y = y + " " + dragon1.getNameD();
				}
		}
		if(dragon2 != null) {
			if((dragon2.getNameD().charAt(0) == 'A' || dragon2.getNameD().charAt(0) == 'E' || dragon2.getNameD().charAt(0) == 'I' || dragon2.getNameD().charAt(0) == 'O' || dragon2.getNameD().charAt(0) == 'U') && (dragon2.getNameD().endsWith("a") || dragon2.getNameD().endsWith("e") || dragon2.getNameD().endsWith("i") || dragon2.getNameD().endsWith("o") || dragon2.getNameD().endsWith("u"))) {
				y = y + " " + dragon2.getNameD();
				}
		}
		return y;
	}
	
	public String reportHabitat() { //this method prints information about the habitat and the animals in it
		String msg="\nSize: " + getAreaS() + " mts2";
		msg = msg+"\nTemperature: " +getTemperatureH() + " celsius";
		msg = msg+"\nHumidity: "+getHumidityH();
		msg = msg+"\nFood Required: " + foodH();
		msg = msg+"\nActual Amount of Food: " + getFoodH();
		msg = msg+"\nWater Required: " + requiredWater();
		msg = msg+"\nActual Amount of Water: "+getWaterH();
		msg = msg+ "\n" + waterComparison() + "\n" + "	\nANIMAL'S";
		if (type==KANGAROOZONE) {
			if(kangaroo1!=null) {
				
				msg = msg+ "\n\n" +kangaroo1.report();
			}
			if(kangaroo2!=null) {
				msg = msg+ "\n\n" + kangaroo2.report();
			}
			if(kangaroo3!=null) {
				msg = msg+ "\n\n" + kangaroo3.report();
			}
		}
		if(type==DRAGONZONE) {
			if(dragon1!=null) {
				msg = msg+ "\n\n" + dragon1.report();
			}
			if(dragon2!=null) {
				msg = msg+ "\n\n"+ dragon2.report();
			}
		}
		return msg;
		
	}
	
	
	public int countMale() { //method that evaluates if a habitat has male kangaroo's
		int c = 0;
		if((kangaroo1 != null) && (kangaroo1.getSexK()==Kangaroo.MALE)) 
			c = 1;
		else if((kangaroo2 !=null) && (kangaroo2.getSexK()==Kangaroo.MALE))
			c = 1;
		else if((kangaroo3 != null) &&(kangaroo3.getSexK()==Kangaroo.MALE))
			System.out.println("mensj");
			c = 1;
		return c;
	}
	
		public String addKangaroo(String n, double we, double h, char s, String b, Date f) { //method that adds a kangaroo in a habitat
			String msg = "";
			if (type == DRAGONZONE)
				msg = "Error: this zone is only for dragons.";
			else { 
				if(countMale() == 1 && s == Kangaroo.MALE)
					msg = "Error: can't add more male kangaroos on this habitat.";
				else {
					
					if(getK1() == null)
						kangaroo1 = new Kangaroo( n,  we,  h,  s,  b,  f);
					else if(getK2() == null)
						kangaroo2 = new Kangaroo( n,  we,  h,  s,  b,  f);
					else if(getK3() == null)
						kangaroo3 = new Kangaroo( n,  we,  h,  s,  b,  f);
			//deberia poner un else aqui?	
					msg = "Kangaroo added";
				}
			}
			return msg;
		}
		
}