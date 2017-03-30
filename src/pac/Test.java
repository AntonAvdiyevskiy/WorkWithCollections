package pac;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	
	public static void main(String[] args) {
		
		
		Schedule schedule = new Schedule();
		schedule.setSet(new HashSet<Seance>());
//		
		Cinema cinema = new Cinema();
		
		System.out.println("_________________________________________________________________________");
		
		Scanner scanner = new Scanner(System.in);
		
		boolean bool = true;
		while(bool){
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:cinema.setMapFull(new HashMap<>());
			cinema.makeCin();
			System.out.println("Вітаю в кінотеатрі");;
			System.out.println("...");break;
			case 2:cinema.addMovieToSomeDay();;
			System.out.println("...");break;
			case 3:cinema.addSeanceToSomeDay();;
			System.out.println("...");break;
			case 4:cinema.removeMovieFromSomeDay();
			System.out.println("...");break;
			case 5:cinema.removeMovieFromSomeDay();;
			System.out.println("...");break;
			case 6:cinema.displayDays();;
			System.out.println("...");break;
			case 7:cinema.dispALL();;;
			System.out.println("...");break;
			case 10:bool = false;break;
			
				}
		
		
		
		
		
	}	
	}
}
