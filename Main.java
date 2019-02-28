package userInterface;
import model.*;
import java.util.Scanner;
public class Main{

		private Zoo zooCali;
		private String message; 
			
		public Main(){
			Zoo zooCali = new Zoo("Zoo of Cali", "Bosque municipal, a orillas del rio Cali, barrio Santa Teresita", "1969");
		}
		
		public static void main (String[] args){
			Main objMain = new Main();
			System.out.println("			    WELCOME TO CALI'S ZOO\n");
			System.out.println("	    (This is the monitor program of Australia's Section.)\n\n");
			
			
			System.out.println(objMain.getZooCali().reportZoo());
			 String msg = objMain.addKangaroo();	//preguntar que hacer con esto
			System.out.println(objMain.getZooCali().reportZoo());
		}
		
		public String menu(int entry) {
			System.out.println("What do you want to do?\n");
			System.out.println("1- See the report of the Zoo\n");
			System.out.println("2- Add a kangaroo\n");
			System.out.println("3- Erase a kangaroo\n");
			System.out.println("4- Find animals which name starts and ends with vocals");
			System.out.println("5- Change kangaroos habitat");
			
			Scanner x = new Scanner(System.in);
			
			entry = x.nextInt();
			switch(entry){
				case 1: 
					System.out.println(getZooCali().reportZoo());	//preguntar entonces que hago con objMain
				break;
				case 2: 
					String msg = addKangaroo(); //preguntar que hacer para que se muestre puesto que esta void
				break;
				case 3:
					eraseKangaroo();
				break;
				case 4: 
					zooCali.vocalsZ();
				break;
				case 5:
					
			}
		}
		
		public String getMessage() { //Call this when you want to see if the kangaroo was added
			return message;
		}
		
		public Zoo getZooCali() {
			return zooCali;
		}
		public void setZooCali(Zoo zooCali) {
			this.zooCali = zooCali;
		}
		
		public void addKangaroo() {
		Scanner kangarooX = new Scanner(System.in);

		System.out.println("Insert the name of the new kangaroo");
		String nameNK = kangarooX.next();

		System.out.println("Insert the height of the new kangaroo");
		double heightNK = kangarooX.nextDouble();

		System.out.println("Insert the weight of the new kangaroo");
		double weightNK = kangarooX.nextDouble();

		System.out.println("Insert the age of the new kangaroo");
		double ageNK = kangarooX.nextDouble();
		
		System.out.println("Insert the sex of the new kangaroo (F o M)");
		char sexNK = kangarooX.next().charAt(0);
		
		System.out.println("Insert the bloodtype of the new kangaroo");
		String bloodtypeNK = kangarooX.next();
		

		message = zooCali.addKangaroo(nameNK, weightNK, heightNK, sexNK, bloodtypeNK, ageNK);
		}
		 
		public void eraseKangaroo() {
			Scanner erase = new Scanner(System.in);
			System.out.println("Insert the name of the kangaroo that you want to erase:");
			String nameKE = erase.next();
			zooCali.eraseKangaroo(nameKE);
		}
		
		public void moveKangarooMain() {
			Scanner change = new Scanner(System.in);
			System.out.println("Insert the name of the kangaroo that you want to move:");
			String nameKM = change.next();
			System.out.println("Insert the name of the habitat wheere you want to move the kangaroo(habitatc1,habitatc2,habitatc3):");
			String nameHM = change.next();
			zooCali.moveKangarooZoo(nameKM, nameHM);
		}
}
