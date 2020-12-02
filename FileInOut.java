import java.io.FileWriter;
import java.io.LineNumberReader;
import java.io.Reader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;


public class FileInOut {		
	
	void write(String data) {
		try {
			//"true" meaning please append the new string
			//The bufferedWriter allows to have the method newLine() which creates new line in the file
			BufferedWriter database = new BufferedWriter(new FileWriter("db.text", true)); 
			database.write(data);
			database.newLine();
			database.close();
		}
		catch (IOException e) {
			System.out.println("An error occur");
			e.printStackTrace();
		}
	}
	
	int read() 	{		//this method will also return the linecount of the text file
		int lines = 0;
		try {
            
            File file = new File("db.text");
         
            
            if (!file.exists()) {
                System.out.println("The file does not exist");
                //return;
            }
            
			FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                StoreData.dataStream.add(data);
                lines++;
                //System.out.println(lines);
            }
 
            bufferedReader.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		return lines;
	}
	
	
	//Remove any movie from the list
	void revmoveLine(String input) {
		input = input.toUpperCase();
		
		//delete everything from the Array list
		if(StoreData.dataStream.size() > 0) {
			StoreData.dataStream.clear();
		}
		
		//skip the read for the input 
		try {
            
            File file = new File("db.text");
         
            
            if (!file.exists()) {
                System.out.println("The file does not exist");
                //return;
            }
            
			FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
            	data = data.toUpperCase();
                if(data.contains(input)) {		//equalIgnoreCase() does not work here so convert to upper case
                	continue;
                }
                StoreData.dataStream.add(data);
            }
            bufferedReader.close();
            fileReader.close();
            
            //write over the file from array list
            try {
    			//"true" meaning please append the new string, if false then it will write over it
    			//The bufferedWriter allows to have the method newLine() which creates new line in the file
            	BufferedWriter database = new BufferedWriter(new FileWriter(file));

    			for(int i = 0; i < StoreData.dataStream.size(); i++) {
    				database.write(StoreData.getDataStream(i));
    				database.newLine();
    			}
    			database.close();
    		}
    		catch (IOException e) {
    			System.out.println("An error occur");
    			e.printStackTrace();
    		}
            
            
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	
		
		
		}

}






