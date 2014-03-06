package laxa2;

public class HouseConstructor {
	
	
	private int size;
	private int year;
	
	public static final int MIN_SIZE=10;
	private static int numberOfHouses;
	
	
	
	
	
	public HouseConstructor(int size , int year){
		this.size=size;
		
		if (year < MIN_SIZE){
			year=MIN_SIZE;
		}else {
			this.year=year;
		}
		numberOfHouses++;
	}
	
	
	public int getYear(){
		return year;
	}
	
	public int getSize(){
		return size;
	}

	public static int getNumberOfHouses(){
		return numberOfHouses;
	}
}
