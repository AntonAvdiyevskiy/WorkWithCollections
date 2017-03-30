package pac;

import java.util.Comparator;

public class SortByTime implements Comparator<Seance> {

	@Override
	public int compare(Seance o1, Seance o2) {
		// TODO Auto-generated method stub
		
		return o1.getStartTime().getHour()-o2.getStartTime().getHour();
	}

}
