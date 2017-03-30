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
		System.out.println("����� ����� ������");
		String name = sc.next();
		System.out.println("������ ��������� ");
		System.out.println("����� : ");
		int hourDur = sc.nextInt();
		System.out.println("������ : ");
		int minDur =sc.nextInt();
		System.out.println("����� ������ ��� ������� ");
		System.out.println("������ : ");
		int hour = sc.nextInt();
		System.out.println("������ : ");
		int min = sc.nextInt();

		
		set.add(new Seance(new Movie(name,new Time(hourDur,minDur)),new Time(hour,min)));
		System.out.println(set);
		
		}
	public void remove (){
		
		if(set.isEmpty()!=true){
			System.out.println("������ ����� ������ ���� ������� �������� � ������ ������");
			String title = sc.next();
		Iterator<Seance>iterator = set.iterator();
		while(iterator.hasNext()){
			Seance seance = iterator.next();
			if(seance.getMovie().getTitle().equalsIgnoreCase(title)){
				iterator.remove();
			}
		}
		}else{System.out.println("������ ������ ������");}
		System.out.println(set);
	}
	public Set<Seance> getSet() {
		return set;
	}
	public void setSet(Set<Seance> set) {
		this.set = set;
	}
	
	
	
	
}
