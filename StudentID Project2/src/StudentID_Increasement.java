import java.util.Scanner;

public class StudentID_Increasement {

	public static void main(String[] args) {
		String ai = "AI1201";
		String firm = "";
		Scanner s = new Scanner(System.in);

		int h = 0;String j="";int k=21;
		String six = "000000";
		String five = "00000";
		String four = "0000";

		String Three = "000";
		String Two = "00";
		String one = "0";

	
	//	System.out.println("Y/N:");//
		//String con = s.nextLine();//
		while (h<=999999) {

			do {
				if (h < 10) {
					
					System.out.println("Add Date ?Y/N:");
					j=s.nextLine();
					if(j.equals("Y")) {
						System.out.println(ai +k+ five + h);
						k++;
					}
					else {	System.out.println(ai + five + h);}
					h++;
				} else if (h <100) {
					
					System.out.println(ai + four + h);
					h++;
				} else if (h < 1000) {
					System.out.println(ai + Three + h);
					h++;
				} else if (h<10000) {
					System.out.println(ai + Two + h);
					h++;
				} else if (h<10000) {
					System.out.println(ai + one + h);
					h++;
				} else if (h <100000) {
					System.out.println(ai + h);
					h++;
				} 
				;
				System.out.print("Add More? Y/N:");
				firm = s.nextLine();
			} while (firm.equals("Y"));
		}
	}
}
