package userInterface;
import model.*;
import java.util.Scanner;
public class Main{

		private Zoo zooCali; //this object represents the zoo of Cali
		private String message; 
			
		public Main(){
			zooCali = new Zoo("Zoo of Cali", "Bosque municipal, a orillas del rio Cali, barrio Santa Teresita", "1969");
		} //Here, values are assigned to the zooCali object
		
		public static void main (String[] args){
			Main objMain = new Main();
			System.out.println("			    WELCOME TO CALI'S ZOO\n");
			System.out.println("	    (This is the monitor program of Australia's Section.)\n\n");
			objMain.menu();
		}
		
		public void menu() { //method that shows a navigation menu to the user
			Scanner x = new Scanner(System.in);
			boolean end = true;
			String msg = "";
			while(end) {
				System.out.println("What do you want to do?\n");
				System.out.println("1- See the report of the Zoo\n");
				System.out.println("2- Add a kangaroo\n");
				System.out.println("3- Erase a kangaroo\n");
				System.out.println("4- Find animals which name starts and ends with vocals\n");
				System.out.println("5- Change kangaroo's from one habitat to another\n");
				System.out.println("6- Kangaroo's vaccination\n");
				System.out.println("7- Exit");
				int entry = x.nextInt();
				switch(entry){
					case 1: 
						msg = zooCali.reportZoo();
						System.out.println(msg);
						break;
					case 2: 
						msg = addKangaroo();
						System.out.println(msg);
						break;
					case 3:
						msg = eraseKangaroo();
						System.out.println(msg);
						break;
					case 4: 
						msg = zooCali.vocalsZ();
						System.out.println(msg);
						break;
					case 5:
						msg = moveKangarooMain();
						System.out.println(msg);
						break;
					case 6: 
						msg = vaccineM();
						System.out.println(msg);
						break;
					case 7:
						msg = "Auf Wiedersehen!";
						System.out.println(msg);
						end = false;
						break;
					default:
						msg = "Error: this number can't be evaluated";
						System.out.println(msg);
				}
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
		
		public String addKangaroo() { //method to add a kangaroo
		Scanner kangarooX = new Scanner(System.in);

		System.out.println("Insert the name of the new kangaroo");
		String nameNK = kangarooX.next();

		System.out.println("Insert the height of the new kangaroo");
		double heightNK = kangarooX.nextDouble();

		System.out.println("Insert the weight of the new kangaroo");
		double weightNK = kangarooX.nextDouble();
		
		System.out.println("Insert the sex of the new kangaroo (F o M)");
		char sexNK = kangarooX.next().charAt(0);
		
		System.out.println("Insert the bloodtype of the new kangaroo");
		String bloodtypeNK = kangarooX.next();
		
		System.out.println("Insert the day of birth of the new kangaroo");
		int dayNK = kangarooX.nextInt();
		
		System.out.println("Insert the month of birth of the new kangaroo");
		int monthNK = kangarooX.nextInt();
		
		System.out.println("Insert the year of birth of the new kangaroo");
		int yearNK = kangarooX.nextInt();
		
		Date fNK = new Date(dayNK, monthNK, yearNK);

		message = zooCali.addKangaroo(nameNK, weightNK, heightNK, sexNK, bloodtypeNK, fNK);
		return message;
		}
		 
		public String eraseKangaroo() { //method to erase a kangaroo
			Scanner erase = new Scanner(System.in);
			System.out.println("Insert the name of the kangaroo that you want to erase:");
			String nameKE = erase.next();
			String message = zooCali.eraseKangaroo(nameKE);
			return message;
		}
		
		public String moveKangarooMain() { //method to move a kangaroo from one habitat to another
			Scanner change = new Scanner(System.in);
			System.out.println("Insert the name of the kangaroo that you want to move:");
			String nameKM = change.next();
			System.out.println("Insert the name of the habitat where you want to move the kangaroo(Habitat1 Kangaroo, Habitat2 Kangaroo, Habitat3 Kangaroo):");
			String nameHM = change.next();
			String message = zooCali.moveKangarooZoo(nameKM, nameHM);
			return message;
		}
		
		public String vaccineM() { //method to know the vaccination date of the kangaroo's
			Scanner entry = new Scanner(System.in);
			System.out.println("Enter the actual year:");
			int yearA = entry.nextInt();
			System.out.println("Enter the actual month:");
			int monthA = entry.nextInt();
			System.out.println("Enter the actual day:");
			int dayA = entry.nextInt();
			String msg = zooCali.vaccineZ(yearA, monthA, dayA);
			return msg;
		}
}
