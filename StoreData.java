import java.util.ArrayList;

public class StoreData {
	static ArrayList<String> dataStream = new ArrayList<String>();	//I was not able to store array using non static
	static String getDataStream(int index) {
		return dataStream.get(index);
	}
}
