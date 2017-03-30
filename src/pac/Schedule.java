package pac;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Schedule {

	private Set<Seance>set;

	public Schedule(Set<Seance>set) {
		super();
		this.set = new HashSet<Seance>();
	}
		public Schedule() {
		super();
	}

	Scanner sc = new Scanner(System.in);

	public void addSeance(){
		System.out.println("Вести назву фільму");
		String name = sc.next();
		System.out.println("Ввести тривалість ");
		System.out.println("годин : ");
		int hourDur = sc.nextInt();
		System.out.println("хвилин : ");
		int minDur =sc.nextInt();
		System.out.println("Тепер введіть час початку ");
		System.out.println("година : ");
		int hour = sc.nextInt();
		System.out.println("хвилин : ");
		int min = sc.nextInt();

		
		set.add(new Seance(new Movie(name,new Time(hourDur,minDur)),new Time(hour,min)));
		System.out.println(set);
		
		}
	public void remove (){
		
		if(set.isEmpty()!=true){
			System.out.println("введіть назву фільму який потрібно вилучити з списку сеансів");
			String title = sc.next();
		Iterator<Seance>iterator = set.iterator();
		while(iterator.hasNext()){
			Seance seance = iterator.next();
			if(seance.getMovie().getTitle().equalsIgnoreCase(title)){
				iterator.remove();
			}
		}
		}else{System.out.println("список сеансів пустий");}
		System.out.println(set);
	}
	public Set<Seance> getSet() {
		return set;
	}
	public void setSet(Set<Seance> set) {
		this.set = set;
	}
	
	
	
	
}
