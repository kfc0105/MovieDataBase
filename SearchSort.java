import java.util.StringTokenizer;

public class SearchSort {
	int size = 2000;   //find a way to have the size of the array list stored in here
	String[] title = new String[size];
	String[] year = new String[size];
	String[] runtime = new String[size];
	String[] director = new String[size];
	String[] actor1 = new String[size];
	String[] actor2 = new String[size];
	
	
	//There is a way to use inheritance, just do them as practice. Practice makes you better
	
	void sortList() {
		
		if(!StoreData.dataStream.isEmpty()) {	
			for(int i = 0; i < StoreData.dataStream.size(); i++) {
				StringTokenizer st = new StringTokenizer(StoreData.dataStream.get(i), "*");
				if(!st.hasMoreElements()) break;
				title[i] = st.nextToken();
				if(!st.hasMoreElements()) break;
				year[i] = st.nextToken();
				if(!st.hasMoreElements()) break;
				runtime[i] = st.nextToken();
				if(!st.hasMoreElements()) break;
				actor1[i] = st.nextToken();
				if(!st.hasMoreElements()) break;
				actor2[i] = st.nextToken();
				if(!st.hasMoreElements()) break;
				director[i] = st.nextToken();
				
				
				//System.out.println(title[i]);
			}
		}
	}
	
	String searchTitle(String input) {
		String result = "";
		
		for(int i = 0; i < StoreData.dataStream.size(); i++) {
			if(input.equalsIgnoreCase(title[i])) {
				result = "Actor: " + actor1[i] + ", " + actor2[i] + "\n" + "Director: " + director[i] + "\n" + "Year: " + year[i] + "\n" + "Runtime: " + runtime[i] + " minutes";
			}	
		}
		if(result == "") {
			return "No result found";
		}
		return result;
	}
	
	//come up with something that will ignore the white spaces
	String searchActors(String input) {
		String result = "";
		
		for(int i = 0; i < StoreData.dataStream.size(); i++) {
			if(input.equalsIgnoreCase(actor1[i]) || input.equalsIgnoreCase(actor2[i])) {
				result += title[i] + "\n";
			}
		}
		if(result == "") {
			return "No titles found for actor";
		}
		return result;
	}
	
	String searchYear(String input) {
		String result = "";
		
		for(int i = 0; i < StoreData.dataStream.size(); i++) {
			if(input.equals(year[i])) {
				result += title[i] + "\n";
			}
		}
		if(result == "") {
			return "No titles found for the year";
		}
		return result;
	}
	
	String searchRunTime(String input) {
		String result = "";
		
		for(int i = 0; i < StoreData.dataStream.size(); i++){
			if(input.equals(runtime[i])){
				result += title[i] + "\n";
			}
			
		}
		if(result == "") {
			return "No titles found for runtime"; 
		}
		return result;
	}
	
	String searchDirector(String input) {
		String result = "";
		
		for(int i = 0; i < StoreData.dataStream.size(); i++) {
			if(input.equalsIgnoreCase(director[i])) {
				result += title[i] + "\n";
			}
		}
		if(result == "") {
			return "No titles found for director";
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


