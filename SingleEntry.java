
public class SingleEntry {
	private String title;
	private String actor1; 
	private String actor2;
	private String director;
	private int year;
	private int runTime;
	
	
	//how should I save the data into these variables?
	void setTitle(String data, int index) {
		StoreData.dataStream.add(index, data + "*");
	}
	void setActor1(String data, int index) {
		StoreData.dataStream.add(index, StoreData.getDataStream(index) + data + "*");
	}
	void setActor2(String data, int index) {
		StoreData.dataStream.add(index, StoreData.getDataStream(index) + data + "*");
	}
	void setDirector(String data, int index) {
		StoreData.dataStream.add(index, StoreData.getDataStream(index) + data);	//No need for delimiter for the last input
	}
	void setYear(int data, int index) {
		StoreData.dataStream.add(index, StoreData.getDataStream(index) + data + "*");
	}
	void setRunTime(int data, int index){
		StoreData.dataStream.add(index, StoreData.getDataStream(index) + data); //if the delimiter was added there is going to be extra one
	}
	String getTitle() {
		return title;
	}
	String getActor1() {
		return actor1;
	}
	String getActor2() {
		return actor2;
	}
	String getDirector() {
		return director;
	}
	int getYear() {
		return year;
	}
	int getRunTime() {
		return runTime;
	}
	
	
	
}
