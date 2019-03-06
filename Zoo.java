package model;

public class Zoo{
	//atributes
	private String name; //name of the zoo
	private String location;//location of the zoo
	private String foundationdate;//foundation date of the zoo
	private double area;//area of the zoo
	
	//relations that represents the habitats on Australia's section
	private Habitat habitatc1;
	private Habitat habitatc2;
	private Habitat habitatc3;
	private Habitat habitatd;
	
	//methods
	public Zoo(String n, String l, String f){ //constructor method
		name = n; 
		location = l;
		foundationdate = f;
	
		//These objects represent the birth dates of the animals
		Date f1 = new Date (12, 6, 2018);
		Date f2 = new Date (23, 9, 2016);
		Date f3 = new Date (7, 3, 2017);
		Date f4 = new Date (18, 5, 2018);
		Date f5 = new Date (4, 2, 2016);
		Date f6 = new Date (29, 11, 2017);
		Date f7 = new Date (15, 7, 2014);
		Date f8 = new Date (6, 12, 2015);

		
		//Here, values are assigned to the objects that represent the animals
		Kangaroo kangaroo1 = new Kangaroo ("Elias", 32.0, 1.4, Kangaroo.MALE, Kangaroo.BO, f1);
		Kangaroo kangaroo2 = new Kangaroo ("Trinity", 28.0, 1.3, Kangaroo.FEMALE, Kangaroo.BA, f2);
		Kangaroo kangaroo3 = new Kangaroo ("Sketch", 50.0, 1.4, Kangaroo.FEMALE, Kangaroo.BB, f3);
		Kangaroo kangaroo4 = new Kangaroo ("Atlas", 58.0, 1.5, Kangaroo.MALE, Kangaroo.BAB, f4);
		Kangaroo kangaroo5 = new Kangaroo ("Ivara", 47.0, 1.4, Kangaroo.FEMALE, Kangaroo.BO, f5);
		Kangaroo kangaroo6 = new Kangaroo ("Demian", 57.0, 1.58, Kangaroo.MALE, Kangaroo.BAB, f6);
		Dragon dragon1 = new Dragon ("Norberto", 70.0, 3.0, f7, Dragon.MALE, 30.7);
		Dragon dragon2 = new Dragon ("Auri", 67.0, 2.5, f8, Dragon.FEMALE, 31.2);

		//Here, values are assigned to the objects that represent the habitats
		habitatc1 = new Habitat (32.8, 35.0, 65.0, "Habitat1 Kangaroo", 133.725, 102.4, Habitat.KANGAROOZONE, kangaroo1, kangaroo2, kangaroo3, null, null); 
		habitatc2 = new Habitat (23.2, 35.0, 67.0, "Habitat2 Kangaroo", 74.64, 95.7, Habitat.KANGAROOZONE, kangaroo4,kangaroo5,null, null, null);
		habitatc3 = new Habitat (12.64, 35.0, 69.0, "Habitat3 Kangaroo", 34.245, 43.3, Habitat.KANGAROOZONE, kangaroo6, null, null, null, null);
		habitatd = new Habitat (1432.86, 37.0, 63.0, "Habitat1 Dragon", 13.875, 4.5, Habitat.DRAGONZONE, null, null, null, dragon1, dragon2);


	}
	

	public Habitat getH1(){
		return habitatc1;
	}
	
	public Habitat getH2(){
		return habitatc2;
	}
	
	public Habitat getH3(){
		return habitatc3;
	}
	
	public Habitat getHD(){
		return habitatd;
	}

	public String getLocationZ(){
		return location;
	}
	public void setLocationZ(String location){
		this.location = location;
	}	
	
	public String getFoundationDateZ(){
		return foundationdate;
	}
	public void setFoundationDateZ(String foundationdate){
		this.foundationdate = foundationdate;
	}	
	
	public double getAreaZ(){
		return area;
	}
	public void setAreaZ(double area){
		this.area = area;
	}	

	public String getNameZ() {
		return name;
	}
	public void setNameZ(String name) {
		this.name = name;
	}
	
	public String reportZoo() { //method that prints information of the zoo
		String msg="				KANGAROO'S ZONE\n\n			   HABITAT 1";
		msg=msg+habitatc1.reportHabitat();
		msg= msg+"\n\n\n			   HABITAT 2";
		msg=msg+habitatc2.reportHabitat();
		msg=msg+"\n		   	   HABITAT 3";
		msg=msg+habitatc3.reportHabitat();
		msg=msg+"\n\n				DRAGON'S ZONE\n\n";
		msg=msg+habitatd.reportHabitat();
		return msg;
	}

	public String addKangaroo(String n, double we, double h, char s, String b, Date f) { //method to add a kangaroo
		String msg = "Habitats occuped";
		if(habitatc1.getK1() == null || habitatc1.getK2() == null || habitatc1.getK3() == null) {
					msg = habitatc1.addKangaroo( n,  we,  h,  s,  b,  f);
		}
		else if (habitatc2.getK1() == null || habitatc2.getK2() == null || habitatc2.getK3() == null) {
			msg = habitatc2.addKangaroo( n,  we,  h,  s,  b,  f);
			
		}
		else if (habitatc3.getK1() == null || habitatc3.getK2() == null || habitatc3.getK3() == null) {
			msg = habitatc2.addKangaroo( n,  we,  h, s,  b,  f);
		}
		return msg;
	}
	
	public String eraseKangaroo(String nameKE) { //method to errase a kangaroo
		String msg = "Kangaroo erased";
		if (habitatc1.getK1() != null && nameKE.equalsIgnoreCase(habitatc1.getK1().getNameK()))
			habitatc1.setK1(null);
		else if (habitatc1.getK2() != null && nameKE.equalsIgnoreCase(habitatc1.getK2().getNameK()))
			habitatc1.setK2(null);
		else if (habitatc1.getK3() != null && nameKE.equalsIgnoreCase(habitatc1.getK3().getNameK()))
			habitatc1.setK3(null);
		else if (habitatc2.getK1() != null && nameKE.equalsIgnoreCase(habitatc2.getK1().getNameK()))
			habitatc2.setK1(null);
		else if (habitatc2.getK2() != null && nameKE.equalsIgnoreCase(habitatc2.getK2().getNameK()))
			habitatc2.setK2(null);
		else if (habitatc2.getK3() != null && nameKE.equalsIgnoreCase(habitatc2.getK3().getNameK()))
			habitatc2.setK3(null);
		else if (habitatc3.getK1() != null && nameKE.equalsIgnoreCase(habitatc3.getK1().getNameK()))
			habitatc3.setK1(null);
		else if (habitatc3.getK2() != null && nameKE.equalsIgnoreCase(habitatc3.getK2().getNameK()))
			habitatc3.setK2(null);
		else if (habitatc3.getK3() != null && nameKE.equalsIgnoreCase(habitatc3.getK3().getNameK()))
			habitatc3.setK3(null);
		else 
			msg = "Cannot find the name of the kangaroo that you're trying to erase";
		
		return msg;
	}
	
	public String vaccineZ(int d, int m, int y) { //method to evaluate if a kangaroo needs vaccine
		String msgvd = "Kangaroo's vaccination dates: ";
		if(habitatc1.getK1() !=null) {
				int e = habitatc1.getK1().birthDateK().getYear() + 1;
				msgvd = msgvd + habitatc1.getK1().getNameK() + " on " + e + ", ";
		}
		if(habitatc1.getK2() != null) {
			int q = habitatc1.getK2().birthDateK().getYear() + 1;
			msgvd = msgvd + habitatc1.getK2().getNameK() + " on " + q + ", ";
		}
		if(habitatc1.getK3() != null) {
			int o = habitatc1.getK3().birthDateK().getYear() + 1;
			msgvd = msgvd + habitatc1.getK3().getNameK() + " on " + o + ", ";
		}
		if(habitatc2.getK1() != null) {
			int n = habitatc2.getK1().birthDateK().getYear() + 1;
			msgvd = msgvd + habitatc2.getK1().getNameK() + " on " + n + ", ";
		}
		if(habitatc2.getK2() != null) {
			int r = habitatc2.getK2().birthDateK().getYear() + 1;
			msgvd = msgvd + habitatc2.getK2().getNameK() + " on " + r + ", ";
		}
		if(habitatc2.getK3() != null) {
			int l = habitatc2.getK3().birthDateK().getYear() + 1;
			msgvd = msgvd + habitatc2.getK3().getNameK() + " on " + l + ", ";
		}
		if(habitatc3.getK1() != null) {
			int k = habitatc3.getK1().birthDateK().getYear() + 1;
			msgvd = msgvd + habitatc3.getK1().getNameK() + " on " + k + ", ";
		}
		if(habitatc3.getK2() != null) {
			int j = habitatc3.getK2().birthDateK().getYear() + 1;
			msgvd = msgvd + habitatc3.getK2().getNameK() + " on " + j + ", ";
		}
		if(habitatc3.getK3() != null) {
			int g = habitatc1.getK1().birthDateK().getYear() + 1;
			msgvd = msgvd + habitatc3.getK3().getNameK() + " on " + g + ", ";
		}
		
		return msgvd;
	}
	
	public String vocalsZ() { //method that evaluates which animal's names start and end with a vocal
		String msg = "Animals's which name starts and ends with a vocal: " + habitatc1.vocalsH() + habitatc2.vocalsH() + habitatc3.vocalsH() + habitatd.vocalsH();
		return msg;
	}

	public String moveKangarooZoo(String nameKM, String nameHM) { //method to move a kangaroo from an habitat to another
		String msg = "";
		if(nameKM.equalsIgnoreCase(habitatc1.getK1().getNameK())) {
			if(nameHM.equalsIgnoreCase(habitatc2.getNameH()) && ((habitatc2.getK1()==null || habitatc2.getK2()==null || habitatc2.getK3()==null) && (habitatc2.getK1().getSexK() != Kangaroo.MALE && habitatc2.getK2().getSexK() != Kangaroo.MALE && habitatc2.getK3().getSexK() != Kangaroo.MALE))) {
				if(habitatc2.getK1()==null) {
					habitatc2.setK1(habitatc1.getK1());
					habitatc1.setK1(null);
					msg = habitatc1.getK1().getNameK() + " moved to " + habitatc2.getNameH();
				}
				else if(habitatc2.getK2()==null) {
					habitatc2.setK2(habitatc1.getK1());
					habitatc1.setK1(null);
					msg = habitatc1.getK1().getNameK() + " moved to " + habitatc2.getNameH();
				}
				else if(habitatc2.getK3()==null) {
					habitatc2.setK3(habitatc1.getK1());
					habitatc1.setK1(null);
					msg = habitatc1.getK1().getNameK() + " moved to " + habitatc2.getNameH();
				}
				else  //preguntar si este else esta bien.
				msg = "Habitat2 is full. You can't move any kangaroo here.";
			}
			else if(nameHM.equalsIgnoreCase(habitatc3.getNameH()) && ((habitatc3.getK1()==null || habitatc3.getK2()==null || habitatc3.getK3()==null) && (habitatc3.getK1().getSexK() != Kangaroo.MALE && habitatc3.getK2().getSexK() != Kangaroo.MALE && habitatc3.getK3().getSexK() != Kangaroo.MALE))) {
				if(habitatc3.getK1()==null) {
					habitatc3.setK1(habitatc1.getK1());
					habitatc1.setK1(null);
					msg = habitatc1.getK1().getNameK() + " moved to " + habitatc3.getNameH();
				}
				else if(habitatc3.getK2()==null) {
					habitatc3.setK2(habitatc1.getK1());
					habitatc1.setK1(null);
					msg = habitatc1.getK1().getNameK() + " moved to " + habitatc3.getNameH();
				}
				else if(habitatc3.getK3()==null) {
					habitatc3.setK3(habitatc1.getK1());
					habitatc1.setK1(null);
					msg = habitatc1.getK1().getNameK() + " moved to " + habitatc3.getNameH();
				}
				else  //preguntar si este else esta bien.
				msg = "Habitat3 is full. You can't move any kangaroo here.";
			}
		}
		
		else if(nameKM.equalsIgnoreCase(habitatc1.getK2().getNameK())) {
			if(nameHM.equalsIgnoreCase(habitatc2.getNameH()) && ((habitatc2.getK1()==null || habitatc2.getK2()==null || habitatc2.getK3()==null) && (habitatc2.getK1().getSexK() != Kangaroo.MALE && habitatc2.getK2().getSexK() != Kangaroo.MALE && habitatc2.getK3().getSexK() != Kangaroo.MALE))) {
				if(habitatc2.getK1()==null) {
					habitatc2.setK1(habitatc1.getK2());
					habitatc1.setK2(null);
					msg = habitatc1.getK2().getNameK() + " moved to " + habitatc2.getNameH();
				}
				else if(habitatc2.getK2()==null) {
					habitatc2.setK2(habitatc1.getK2());
					habitatc1.setK2(null);
					msg = habitatc1.getK2().getNameK() + " moved to " + habitatc2.getNameH();
				}
				else if(habitatc2.getK3()==null) {
					habitatc2.setK3(habitatc1.getK2());
					habitatc1.setK2(null);
					msg = habitatc1.getK2().getNameK() + " moved to " + habitatc2.getNameH();
				}
				else  //preguntar si este else esta bien.
				msg = "Habitat2 is full. You can't move any kangaroo here.";
			}
			else if(nameHM.equalsIgnoreCase(habitatc3.getNameH()) && ((habitatc3.getK1()==null || habitatc3.getK2()==null || habitatc3.getK3()==null) && (habitatc3.getK1().getSexK() != Kangaroo.MALE && habitatc3.getK2().getSexK() != Kangaroo.MALE && habitatc3.getK3().getSexK() != Kangaroo.MALE))) {
				if(habitatc3.getK1()==null) {
					habitatc3.setK1(habitatc1.getK2());
					habitatc1.setK2(null);
					msg = habitatc1.getK2().getNameK() + " moved to " + habitatc3.getNameH();
				}
				else if(habitatc3.getK2()==null) {
					habitatc3.setK2(habitatc1.getK2());
					habitatc1.setK2(null);
					msg = habitatc1.getK2().getNameK() + " moved to " + habitatc3.getNameH();
				}
				else if(habitatc3.getK3()==null) {
					habitatc3.setK3(habitatc1.getK2());
					habitatc1.setK2(null);
					msg = habitatc1.getK2().getNameK() + " moved to " + habitatc3.getNameH();
				}
				else  //preguntar si este else esta bien.
				msg = "Habitat3 is full. You can't move any kangaroo here.";
			}
		}
		
		else if(nameKM.equals(habitatc1.getK3().getNameK())) {
			if(nameHM.equals(habitatc2.getNameH()) && ((habitatc2.getK1()==null || habitatc2.getK2()==null || habitatc2.getK3()==null) && (habitatc2.getK1().getSexK() != Kangaroo.MALE && habitatc2.getK2().getSexK() != Kangaroo.MALE && habitatc2.getK3().getSexK() != Kangaroo.MALE))) {
				if(habitatc2.getK1()==null) {
					habitatc2.setK1(habitatc1.getK3());
					habitatc1.setK3(null);
					msg = habitatc1.getK3().getNameK() + " moved to " + habitatc2.getNameH();
				}
				else if(habitatc2.getK2()==null) {
					habitatc2.setK2(habitatc1.getK3());
					habitatc1.setK3(null);
					msg = habitatc1.getK3().getNameK() + " moved to " + habitatc2.getNameH();
				}
				else if(habitatc2.getK3()==null) {
					habitatc2.setK3(habitatc1.getK3());
					habitatc1.setK3(null);
					msg = habitatc1.getK3().getNameK() + " moved to " + habitatc2.getNameH();
				}
				else  //preguntar si este else esta bien.
				msg = "Habitat2 is full. You can't move any kangaroo here.";
			}
			else if(nameHM.equalsIgnoreCase(habitatc3.getNameH()) && ((habitatc3.getK1()==null || habitatc3.getK2()==null || habitatc3.getK3()==null) && (habitatc3.getK1().getSexK() != Kangaroo.MALE && habitatc3.getK2().getSexK() != Kangaroo.MALE && habitatc3.getK3().getSexK() != Kangaroo.MALE))) {
				if(habitatc3.getK1()==null) {
					habitatc3.setK1(habitatc1.getK3());
					habitatc1.setK3(null);
					msg = habitatc1.getK3().getNameK() + " moved to " + habitatc3.getNameH();
				}
				else if(habitatc3.getK2()==null) {
					habitatc3.setK2(habitatc1.getK3());
					habitatc1.setK3(null);
					msg = habitatc1.getK3().getNameK() + " moved to " + habitatc3.getNameH();
				}
				else if(habitatc3.getK3()==null) {
					habitatc3.setK3(habitatc1.getK3());
					habitatc1.setK3(null);
					msg = habitatc1.getK3().getNameK() + " moved to " + habitatc3.getNameH();
				}
				else  //preguntar si este else esta bien.
				msg = "Habitat3 is full. You can't move any kangaroo here.";
			}
		}
		
		else if(nameKM.equalsIgnoreCase(habitatc2.getK1().getNameK())) {
			if(nameHM.equalsIgnoreCase(habitatc1.getNameH()) && ((habitatc1.getK1()==null || habitatc1.getK2()==null || habitatc1.getK3()==null) && (habitatc1.getK1().getSexK() != Kangaroo.MALE && habitatc1.getK2().getSexK() != Kangaroo.MALE && habitatc1.getK3().getSexK() != Kangaroo.MALE))) {
				if(habitatc1.getK1()==null) {
					habitatc1.setK1(habitatc2.getK1());
					habitatc2.setK1(null);
					msg = habitatc2.getK1().getNameK() + " moved to " + habitatc1.getNameH();
				}
				else if(habitatc1.getK2()==null) {
					habitatc1.setK2(habitatc2.getK1());
					habitatc2.setK1(null);
					msg = habitatc2.getK1().getNameK() + " moved to " + habitatc1.getNameH();
				}
				else if(habitatc1.getK3()==null) {
					habitatc1.setK3(habitatc2.getK1());
					habitatc2.setK1(null);
					msg = habitatc2.getK1().getNameK() + " moved to " + habitatc1.getNameH();
				}
				else  //preguntar si este else esta bien.
				msg = "Habitat1 is full. You can't move any kangaroo here.";
			}
			else if(nameHM.equalsIgnoreCase(habitatc3.getNameH()) && ((habitatc3.getK1()==null || habitatc3.getK2()==null || habitatc3.getK3()==null) && (habitatc3.getK1().getSexK() != Kangaroo.MALE && habitatc3.getK2().getSexK() != Kangaroo.MALE && habitatc3.getK3().getSexK() != Kangaroo.MALE))) {
				if(habitatc3.getK1()==null) {
					habitatc3.setK1(habitatc2.getK1());
					habitatc2.setK1(null);
					msg = habitatc2.getK1().getNameK() + " moved to " + habitatc3.getNameH();
				}
				else if(habitatc3.getK2()==null) {
					habitatc3.setK2(habitatc2.getK1());
					habitatc2.setK1(null);
					msg = habitatc2.getK1().getNameK() + " moved to " + habitatc3.getNameH();
				}
				else if(habitatc3.getK3()==null) {
					habitatc3.setK3(habitatc2.getK1());
					habitatc2.setK1(null);
					msg = habitatc2.getK1().getNameK() + " moved to " + habitatc3.getNameH();
				}
				else  //preguntar si este else esta bien.
				msg = "Habitat3 is full. You can't move any kangaroo here.";
			}
		}
		
		else if(nameKM.equalsIgnoreCase(habitatc2.getK2().getNameK())) {
			if(nameHM.equalsIgnoreCase(habitatc1.getNameH()) && ((habitatc1.getK1()==null || habitatc1.getK2()==null || habitatc1.getK3()==null) && (habitatc1.getK1().getSexK() != Kangaroo.MALE && habitatc1.getK2().getSexK() != Kangaroo.MALE && habitatc1.getK3().getSexK() != Kangaroo.MALE))) {
				if(habitatc1.getK1()==null) {
					habitatc1.setK1(habitatc2.getK2());
					habitatc2.setK2(null);
					msg = habitatc2.getK2().getNameK() + " moved to " + habitatc1.getNameH();
				}
				else if(habitatc1.getK2()==null) {
					habitatc1.setK2(habitatc2.getK2());
					habitatc2.setK2(null);
					msg = habitatc2.getK2().getNameK() + " moved to " + habitatc1.getNameH();
				}
				else if(habitatc1.getK3()==null) {
					habitatc1.setK3(habitatc2.getK2());
					habitatc2.setK2(null);
					msg = habitatc2.getK2().getNameK() + " moved to " + habitatc1.getNameH();
				}
				else  //preguntar si este else esta bien.
				msg = "Habitat1 is full. You can't move any kangaroo here.";
			}
			else if(nameHM.equalsIgnoreCase(habitatc3.getNameH()) && ((habitatc3.getK1()==null || habitatc3.getK2()==null || habitatc3.getK3()==null) && (habitatc3.getK1().getSexK() != Kangaroo.MALE && habitatc3.getK2().getSexK() != Kangaroo.MALE && habitatc3.getK3().getSexK() != Kangaroo.MALE))) {
				if(habitatc3.getK1()==null) {
					habitatc3.setK1(habitatc2.getK2());
					habitatc2.setK2(null);
					msg = habitatc2.getK2().getNameK() + " moved to " + habitatc3.getNameH();
				}
				else if(habitatc3.getK2()==null) {
					habitatc3.setK2(habitatc2.getK2());
					habitatc2.setK2(null);
					msg = habitatc2.getK2().getNameK() + " moved to " + habitatc3.getNameH();
				}
				else if(habitatc3.getK3()==null) {
					habitatc3.setK3(habitatc2.getK2());
					habitatc2.setK2(null);
					msg = habitatc2.getK2().getNameK() + " moved to " + habitatc3.getNameH();
				}
				else  //preguntar si este else esta bien.
				msg = "Habitat3 is full. You can't move any kangaroo here.";
			}
		}
		
		else if(nameKM.equalsIgnoreCase(habitatc2.getK3().getNameK())) {
			if(nameHM.equalsIgnoreCase(habitatc1.getNameH()) && ((habitatc1.getK1()==null || habitatc1.getK2()==null || habitatc1.getK3()==null) && (habitatc1.getK1().getSexK() != Kangaroo.MALE && habitatc1.getK2().getSexK() != Kangaroo.MALE && habitatc1.getK3().getSexK() != Kangaroo.MALE))) {
				if(habitatc1.getK1()==null) {
					habitatc1.setK1(habitatc2.getK3());
					habitatc2.setK3(null);
					msg = habitatc2.getK3().getNameK() + " moved to " + habitatc1.getNameH();
				}
				else if(habitatc1.getK2()==null) {
					habitatc1.setK2(habitatc2.getK3());
					habitatc2.setK3(null);
					msg = habitatc2.getK3().getNameK() + " moved to " + habitatc1.getNameH();
				}
				else if(habitatc1.getK3()==null) {
					habitatc1.setK3(habitatc2.getK3());
					habitatc2.setK3(null);
					msg = habitatc2.getK3().getNameK() + " moved to " + habitatc1.getNameH();
				}
				else  //preguntar si este else esta bien.
				msg = "Habitat1 is full. You can't move any kangaroo here.";
			}
			else if(nameHM.equalsIgnoreCase(habitatc3.getNameH()) && ((habitatc3.getK1()==null || habitatc3.getK2()==null || habitatc3.getK3()==null) && (habitatc3.getK1().getSexK() != Kangaroo.MALE && habitatc3.getK2().getSexK() != Kangaroo.MALE && habitatc3.getK3().getSexK() != Kangaroo.MALE))) {
				if(habitatc3.getK1()==null) {
					habitatc3.setK1(habitatc2.getK3());
					habitatc2.setK3(null);
					msg = habitatc2.getK3().getNameK() + " moved to " + habitatc3.getNameH();
				}
				else if(habitatc3.getK2()==null) {
					habitatc3.setK2(habitatc2.getK3());
					habitatc2.setK3(null);
					msg = habitatc2.getK3().getNameK() + " moved to " + habitatc3.getNameH();
				}
				else if(habitatc3.getK3()==null) {
					habitatc3.setK3(habitatc2.getK3());
					habitatc2.setK3(null);
					msg = habitatc2.getK3().getNameK() + " moved to " + habitatc3.getNameH();
				}
				else  //preguntar si este else esta bien.
				msg = "Habitat3 is full. You can't move any kangaroo here.";
			}
		}
		
		else if(nameKM.equalsIgnoreCase(habitatc3.getK1().getNameK())) {
			if(nameHM.equalsIgnoreCase(habitatc1.getNameH()) && ((habitatc1.getK1()==null || habitatc1.getK2()==null || habitatc1.getK3()==null) && (habitatc1.getK1().getSexK() != Kangaroo.MALE && habitatc1.getK2().getSexK() != Kangaroo.MALE && habitatc1.getK3().getSexK() != Kangaroo.MALE))) {
				if(habitatc1.getK1()==null) {
					habitatc1.setK1(habitatc3.getK1());
					habitatc3.setK1(null);
					msg = habitatc3.getK1().getNameK() + " moved to " + habitatc1.getNameH();
				}
				else if(habitatc1.getK2()==null) {
					habitatc1.setK2(habitatc3.getK1());
					habitatc3.setK1(null);
					msg = habitatc3.getK1().getNameK() + " moved to " + habitatc1.getNameH();
				}
				else if(habitatc1.getK3()==null) {
					habitatc1.setK3(habitatc3.getK1());
					habitatc3.setK1(null);
					msg = habitatc3.getK1().getNameK() + " moved to " + habitatc1.getNameH();
				}
				else  //preguntar si este else esta bien.
				msg = "Habitat1 is full. You can't move any kangaroo here.";
			}
			else if(nameHM.equalsIgnoreCase(habitatc2.getNameH()) && ((habitatc2.getK1()==null || habitatc2.getK2()==null || habitatc2.getK3()==null) && (habitatc2.getK1().getSexK() != Kangaroo.MALE && habitatc2.getK2().getSexK() != Kangaroo.MALE && habitatc2.getK3().getSexK() != Kangaroo.MALE))) {
				if(habitatc2.getK1()==null) {
					habitatc2.setK1(habitatc3.getK1());
					habitatc3.setK1(null);
					msg = habitatc3.getK1().getNameK() + " moved to " + habitatc2.getNameH();
				}
				else if(habitatc2.getK2()==null) {
					habitatc2.setK2(habitatc3.getK1());
					habitatc3.setK1(null);
					msg = habitatc3.getK1().getNameK() + " moved to " + habitatc2.getNameH();
				}
				else if(habitatc2.getK3()==null) {
					habitatc2.setK3(habitatc3.getK1());
					habitatc3.setK1(null);
					msg = habitatc3.getK1().getNameK() + " moved to " + habitatc2.getNameH();
				}
				else  //preguntar si este else esta bien.
				msg = "Habitat2 is full. You can't move any kangaroo here.";
			}
		}
		
		else if(nameKM.equalsIgnoreCase(habitatc3.getK2().getNameK())) {
			if(nameHM.equalsIgnoreCase(habitatc1.getNameH()) && ((habitatc1.getK1()==null || habitatc1.getK2()==null || habitatc1.getK3()==null) && (habitatc1.getK1().getSexK() != Kangaroo.MALE && habitatc1.getK2().getSexK() != Kangaroo.MALE && habitatc1.getK3().getSexK() != Kangaroo.MALE))) {
				if(habitatc1.getK1()==null) {
					habitatc1.setK1(habitatc3.getK2());
					habitatc3.setK2(null);
					msg = habitatc3.getK2().getNameK() + " moved to " + habitatc1.getNameH();
				}
				else if(habitatc1.getK2()==null) {
					habitatc1.setK2(habitatc3.getK2());
					habitatc3.setK2(null);
					msg = habitatc3.getK2().getNameK() + " moved to " + habitatc1.getNameH();
				}
				else if(habitatc1.getK3()==null) {
					habitatc1.setK3(habitatc3.getK2());
					habitatc3.setK2(null);
					msg = habitatc3.getK2().getNameK() + " moved to " + habitatc1.getNameH();
				}
				else  //preguntar si este else esta bien.
				msg = "Habitat1 is full. You can't move any kangaroo here.";
			}
			else if(nameHM.equalsIgnoreCase(habitatc2.getNameH()) && ((habitatc2.getK1()==null || habitatc2.getK2()==null || habitatc2.getK3()==null) && (habitatc2.getK1().getSexK() != Kangaroo.MALE && habitatc2.getK2().getSexK() != Kangaroo.MALE && habitatc2.getK3().getSexK() != Kangaroo.MALE))) {
				if(habitatc2.getK1()==null) {
					habitatc2.setK1(habitatc3.getK2());
					habitatc3.setK2(null);
					msg = habitatc3.getK2().getNameK() + " moved to " + habitatc2.getNameH();
				}
				else if(habitatc2.getK2()==null) {
					habitatc2.setK2(habitatc3.getK2());
					habitatc3.setK2(null);
					msg = habitatc3.getK2().getNameK() + " moved to " + habitatc2.getNameH();
				}
				else if(habitatc2.getK3()==null) {
					habitatc2.setK3(habitatc3.getK2());
					habitatc3.setK2(null);
					msg = habitatc3.getK2().getNameK() + " moved to " + habitatc2.getNameH();
				}
				else  //preguntar si este else esta bien.
				msg = "Habitat2 is full. You can't move any kangaroo here.";
			}
		}
		
		else if(nameKM.equalsIgnoreCase(habitatc3.getK3().getNameK())) {
			if(nameHM.equalsIgnoreCase(habitatc1.getNameH()) && ((habitatc1.getK1()==null || habitatc1.getK2()==null || habitatc1.getK3()==null) && (habitatc1.getK1().getSexK() != Kangaroo.MALE && habitatc1.getK2().getSexK() != Kangaroo.MALE && habitatc1.getK3().getSexK() != Kangaroo.MALE))) {
				if(habitatc1.getK1()==null) {
					habitatc1.setK1(habitatc3.getK3());
					habitatc3.setK3(null);
					msg = habitatc3.getK3().getNameK() + " moved to " + habitatc1.getNameH();
				}
				else if(habitatc1.getK2()==null) {
					habitatc1.setK2(habitatc3.getK3());
					habitatc3.setK3(null);
					msg = habitatc3.getK3().getNameK() + " moved to " + habitatc1.getNameH();
				}
				else if(habitatc1.getK3()==null) {
					habitatc1.setK3(habitatc3.getK3());
					habitatc3.setK3(null);
					msg = habitatc3.getK3().getNameK() + " moved to " + habitatc1.getNameH();
				}
				else  //preguntar si este else esta bien.
				msg = "Habitat1 is full. You can't move any kangaroo here.";
			}
			else if(nameHM.equalsIgnoreCase(habitatc2.getNameH()) && ((habitatc2.getK1()==null || habitatc2.getK2()==null || habitatc2.getK3()==null) && (habitatc2.getK1().getSexK() != Kangaroo.MALE && habitatc2.getK2().getSexK() != Kangaroo.MALE && habitatc2.getK3().getSexK() != Kangaroo.MALE))) {
				if(habitatc2.getK1()==null) {
					habitatc2.setK1(habitatc3.getK3());
					habitatc3.setK3(null);
					msg = habitatc3.getK3().getNameK() + " moved to " + habitatc2.getNameH();
				}
				else if(habitatc2.getK2()==null) {
					habitatc2.setK2(habitatc3.getK3());
					habitatc3.setK3(null);
					msg = habitatc3.getK3().getNameK() + " moved to " + habitatc2.getNameH();
				}
				else if(habitatc2.getK3()==null) {
					habitatc2.setK3(habitatc3.getK3());
					habitatc3.setK3(null);
					msg = habitatc3.getK3().getNameK() + " moved to " + habitatc2.getNameH();
				}
				else  //preguntar si este else esta bien.
				msg = "Habitat2 is full. You can't move any kangaroo here.";
			}
		}
		
		return msg;
	}
	
}