package musicalChairs;

public class MusicalChairs {
	private String names;
	
	MusicalChairs(String names){
		this.names = names;
	}

	public String getNames() {
		return names;
	}



	public void setNames(String names) {
		this.names = names;
	}
	
	
	

	@Override
	public String toString() {
		return "MusicalChairs [names=" + names + "]";
	}


}
