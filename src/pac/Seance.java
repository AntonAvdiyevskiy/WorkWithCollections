package pac;

public class Seance {

	Movie movie ;
	Time startTime;
	Time endTime;
	public Seance(Movie movie, Time startTime) {
		super();
		this.movie = movie;
		this.startTime = startTime;
		this.endTime = movie.plus(startTime, movie.getDuration());
	}
	public Seance() {
		// TODO Auto-generated constructor stub
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public Time getEndTime() {
		//Time endTime =  + movie.getDuration();
		return endTime;
	}
	@Override
	public String toString() {
//		System.out.println("Назва - "+movie.getTitle()+", Тривалість "+movie.getDuration().getHour()
//				+" години "+movie.getDuration().getMin()+" хвилин");
//		System.out.println("Початок о "+startTime);
//		System.out.println("Кінець o "+endTime);
		return "\n Назва - "+movie.getTitle()+"\n Тривалість "+movie.getDuration().getHour()
				+" години "+movie.getDuration().getMin()+" хвилин"+"\n Початок о "+startTime+"\n Кінець o "+endTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + ((movie == null) ? 0 : movie.hashCode());
		result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seance other = (Seance) obj;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (movie == null) {
			if (other.movie != null)
				return false;
		} else if (!movie.equals(other.movie))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		return true;
	}
	
	
	
	
	
}
