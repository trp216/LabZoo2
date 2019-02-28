package model;

public class Zoo{
	//atributes
	private String name;
	private String location;
	private String foundationdate;
	private double area;
	private Habitat habitatc1;
	private Habitat habitatc2;
	private Habitat habitatc3;
	private Habitat habitatd;
	
	//methods
	public Zoo(String n, String l, String f){
		name = n; 
		location = l;
		foundationdate = f;
	
		Kangaroo kangaroo1 = new Kangaroo ("Elias", 32.0, 1.4, Kangaroo.MALE, Kangaroo.BO, 2.0);
		Kangaroo kangaroo2 = new Kangaroo ("Trinity", 28.0, 1.3, Kangaroo.FEMALE, Kangaroo.BA, 1.0);
		Kangaroo kangaroo3 = new Kangaroo ("Sketch", 50.0, 1.4, Kangaroo.FEMALE, Kangaroo.BB, 2.0);
		Kangaroo kangaroo4 = new Kangaroo ("Atlas", 58.0, 1.5, Kangaroo.FEMALE, Kangaroo.BAB, 3.0);
		Kangaroo kangaroo5 = new Kangaroo ("Ivara", 47.0, 1.4, Kangaroo.FEMALE, Kangaroo.BO, 1.0);
		Kangaroo kangaroo6 = new Kangaroo ("Demian", 57.0, 1.58, Kangaroo.MALE, Kangaroo.BAB, 3.0);
		Dragon dragon1 = new Dragon ("Norberto", 70.0, 3.0, 24.0, Dragon.MALE, 30.7);
		Dragon dragon2 = new Dragon ("Auri", 67.0, 2.5, 20.0, Dragon.FEMALE, 31.2);


		habitatc1 = new Habitat (32.8, 35.0, 65.0, "Habitat1 Kangaroo", 133.725, 102.4, Habitat.KANGAROOZONE, kangaroo1, kangaroo2, kangaroo3, null, null); 
		habitatc2 = new Habitat (23.2, 35.0, 67.0, "Habitat2 Kangaroo", 74.64, 95.7, Habitat.KANGAROOZONE, kangaroo4,kangaroo5,null, null, null);
		habitatc3 = new Habitat (12.64, 35.0, 69.0, "Habitat3 Kangaroo", 34.245, 43.3, Habitat.KANGAROOZONE, kangaroo6, null, null, null, null);
		habitatd = new Habitat (1432.86, 37.0, 63.0, "Habitat1 Dragon", 13.875, 5.0, Habitat.DRAGONZONE, null, null, null, dragon1, dragon2);


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
	
	public String reportZoo() {
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

	
	public String addKangaroo(String n, double we, double h, char s, String b, double ag) {
		String msg = "Habitats occuped";
		if(habitatc1.getK1() == null || habitatc1.getK2() == null || habitatc1.getK3() == null) {
					msg = habitatc1.addKangaroo( n,  we,  h,  s,  b,  ag);
		}
		else if (habitatc2.getK1() == null || habitatc2.getK2() == null || habitatc2.getK3() == null) {
			msg = habitatc2.addKangaroo( n,  we,  h,  s,  b,  ag);
			
		}
		else if (habitatc3.getK1() == null || habitatc3.getK2() == null || habitatc3.getK3() == null) {
			msg = habitatc2.addKangaroo( n,  we,  h, s,  b,  ag);
		}
		return msg;
	}
	
	
	public void eraseKangaroo(String nameKE) {
		if (nameKE.equalsIgnoreCase(habitatc1.getK1().getNameK()))
			habitatc1.setK1(null);
		else if (nameKE.equalsIgnoreCase(habitatc1.getK2().getNameK()))
			habitatc1.setK2(null);
		else if (nameKE.equalsIgnoreCase(habitatc1.getK3().getNameK()))
			habitatc1.setK3(null);
		else if (nameKE.equalsIgnoreCase(habitatc2.getK1().getNameK()))
			habitatc2.setK1(null);
		else if (nameKE.equalsIgnoreCase(habitatc2.getK2().getNameK()))
			habitatc2.setK2(null);
		else if (nameKE.equalsIgnoreCase(habitatc2.getK3().getNameK()))
			habitatc2.setK3(null);
		else if (nameKE.equalsIgnoreCase(habitatc3.getK1().getNameK()))
			habitatc3.setK1(null);
		else if (nameKE.equalsIgnoreCase(habitatc3.getK2().getNameK()))
			habitatc3.setK2(null);
		else if (nameKE.equalsIgnoreCase(habitatc3.getK3().getNameK()))
			habitatc3.setK3(null);
		else if (nameKE.equalsIgnoreCase(habitatd.getD1().getNameD()))
			habitatd.setD1(null);
		else if (nameKE.equalsIgnoreCase(habitatd.getD2().getNameD()))
			habitatd.setD2(null);
	}
	
	public String vocalsZ() {
		String msg = "Kangaroo's which name starts and ends with a vocal: " + habitatc1.vocalsH() + habitatc2.vocalsH() + habitatc3.vocalsH();
		return msg;
	}
	
	public String moveKangarooZoo(String nameKM, String nameHM) {
		String msg = "You can't move the Kangaroo, all habitats are occupied";
		if(nameKM.equals(habitatc1.getK1().getNameK())) {
			if(nameHM.equals(habitatc2.getNameH())) {
				if(habitatc2.getK1()==null)
					habitatc2.setK1(habitatc1.getK1());
				else if(habitatc2.getK2()==null)
					habitatc2.setK2(habitatc1.getK1());
				else if(habitatc2.getK3()==null)
					habitatc2.setK3(habitatc1.getK1());
			}
			if(nameHM.equals(habitatc3.getNameH())) {
				if(habitatc3.getK1()==null)
					habitatc3.setK1(habitatc1.getK1());
				else if(habitatc3.getK2()==null)
					habitatc3.setK2(habitatc1.getK1());
				else if(habitatc3.getK3()==null)
					habitatc3.setK3(habitatc1.getK1());
			}	
		}
		return msg;
	}
}