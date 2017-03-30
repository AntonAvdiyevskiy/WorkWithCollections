package pac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class Cinema {

	private Map<Days,Map<Movie,Set<Seance>>>mapFull;
	private Time open;
	private Time close;
	public Cinema(Map<Days, Schedule> map, Time open, Time close) {
		super();
		this.mapFull = new HashMap<Days,Map<Movie,Set<Seance>>>();;
		this.open = open;
		this.close = close;
	}
	
	public Map<Days, Map<Movie, Set<Seance>>> getMapFull() {
		return mapFull;
	}

	public void setMapFull(Map<Days, Map<Movie, Set<Seance>>> mapFull) {
		this.mapFull = mapFull;
	}

	public Time getOpen() {
		return open;
	}
	public void setOpen(Time open) {
		this.open = open;
	}
	public Time getClose() {
		return close;
	}
	public void setClose(Time close) {
		this.close = close;
	}

	
	
	



	Scanner sc = new Scanner(System.in);
	
	
	public Cinema() {
		super();
	}

	Map<Movie,Set<Seance>>mapMovie = new HashMap<Movie,Set<Seance>>();
	//List<Time>times = new ArrayList <Time>();
	Set<Seance>setOfSeances = new HashSet<Seance>();
	//Map<Days,Map<Movie,Set<Seance>>>mapFull = new HashMap<Days,Map<Movie,Set<Seance>>>();
	
	public void addMovie(){
		System.out.println("Вести назву фільму");
		String title = sc.next();
		System.out.println("Ввести тривалість ");
		System.out.println("годин : ");
		int hour = sc.nextInt();
		System.out.println("хвилин : ");
		int min =sc.nextInt();
	
	
		mapMovie.put( new  Movie(title, new Time(hour, min)), new HashSet<>());
//			times.add(new Time)
			System.out.println(mapMovie);
		
	}
	public void addSeance(){
		System.out.println("Вести назву фільму");
		String name = sc.next();
		System.out.println("Тепер введіть час початку ");
		System.out.println("година : ");
		int hour = sc.nextInt();
		System.out.println("хвилин : ");
		int min = sc.nextInt();

		
	
		for (Movie movie : mapMovie.keySet()) {
			if(movie.getTitle().equalsIgnoreCase(name)){
				mapMovie.get(movie).add(new Seance(movie,new Time(hour,min)));
			}
			
		}
		System.out.println(mapMovie);
	}
	public void removeMovie(){
		System.out.println("Вести назву фільму,який потрыбно видалити " );
		String name = sc.next();
		for (Movie movie : mapMovie.keySet()) {
			if(movie.getTitle().equalsIgnoreCase(name)){
				mapMovie.remove(movie);
			}
			
		}
		System.out.println(mapMovie);
	}
	
	Days[]days = Days.values();
	public void makeCin(){
						for (Days dayOfCin : days) {
			
								mapFull.put(dayOfCin,new HashMap<>() );
							}
	}
	public void addMovieToSomeDay(){
	
		System.out.println("Додати фільм і список сеансів на нього в введений вами день");
		System.out.println("введіть день");
		String day = sc.next();
		System.out.println("Вести назву фільму");
		String title = sc.next();
		System.out.println("Ввести тривалість ");
		System.out.println("годин : ");
		int hour = sc.nextInt();
		System.out.println("хвилин : ");
		int min =sc.nextInt();

			for (Days i : mapFull.keySet()) {
				if(i.name().equalsIgnoreCase(day)){
					
					mapFull.get(i).put(new  Movie(title, new Time(hour, min)), new HashSet<>());
				}
				
			
			
			
			
			
		}
		System.out.println("\n"+mapFull);
	}
	public void addSeanceToSomeDay(){
		System.out.println("введіть в який день додати сеанс");
		String day = sc.next();
		System.out.println("Вести назву фільму,якому додати сеанс");
		String name = sc.next();
//		
		System.out.println("Тепер введіть час початку ");
		System.out.println("година : ");
		int hour = sc.nextInt();
		System.out.println("хвилин : ");
		int min = sc.nextInt();
		
		
		for (Days days2 : mapFull.keySet()) {
			if(days2.name().equalsIgnoreCase(day)){
				for(Movie movie:mapFull.get(days2).keySet()){
					if(movie.getTitle().equalsIgnoreCase(name)){
						mapFull.get(days2).get(movie).add(new Seance(movie,new Time(hour,min)));
					}
				}
				
					
			}
		}
		System.out.println(mapFull);
	}
	public void removeMovieFromSomeDay(){
		System.out.println("Вилучити фільм,коли його показ?");
		System.out.println("введіть день");
		String day = sc.next();
		System.out.println("Вести назву фільму,який потрібно видалити " );
		String name = sc.next();
		
		
		for (Days days2 : mapFull.keySet()) {
			if(days2.name().equalsIgnoreCase(day)){
				for(Movie movie:mapFull.get(days2).keySet()){
					if(movie.getTitle().equalsIgnoreCase(name)){
						mapFull.get(days2).remove(movie);
					}
				}
				
					
			}
		}
		System.out.println(mapFull);
		
		
	}
	public void removeSeance(){
		System.out.println("Вилучити сеанс,коли його показ?");
		System.out.println("введіть день");
		String day = sc.next();
		System.out.println("Вести назву фільму,сеанс якого потрібно видалити " );
		String name = sc.next();
		System.out.println("ввести годину,на яку записаний цей сеанс");
		int hour = sc.nextInt();
		
		for (Days days2 : mapFull.keySet()) {
			if(days2.name().equalsIgnoreCase(day)){
				for(Movie movie:mapFull.get(days2).keySet()){
					if(movie.getTitle().equalsIgnoreCase(name)){
						Iterator<Seance>iterator = mapFull.get(days2).get(movie).iterator();
						while(iterator.hasNext()){
							Seance seance = iterator.next();
							if(seance.startTime.getHour()==hour){
							
								iterator.remove();
							}
					}
				}
				
					
			}
		}
		
		
	}
			System.out.println(mapFull);		
}
	public void displayDays(){
		System.out.println("дізнатися в які дні можна подивитись фільм");
		System.out.println("введіть назву фільму");
		String name = sc.next();
		
		boolean b  = false;
		for (Days days2 : mapFull.keySet()) {
			
				for(Movie movie:mapFull.get(days2).keySet()){
					if(movie.getTitle().equalsIgnoreCase(name)){
						System.out.println(days2);
						b = true;
					}
				
				
					
				}
				
			}
			if(b == false){
				System.out.println("на данний час фільм не в показі");
			}
				
			
			
		}

	public void dispALL(){
				
		for (Days days2 : mapFull.keySet()) {
		
				for(Movie movie:mapFull.get(days2).keySet()){
				
						System.out.println(days2);
						System.out.println(movie);
						System.out.println(mapFull.get(days2).get(movie));
					}
				
				
					
			}
	
	}
}

