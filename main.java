import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

//Kenta Miyahara
//Completed !
//Completed Extra Credit!

public class main {

	public static void main(String[] args) {
		displayTitle();
		displayCommands();
		commandEntry();
	}
	
	
	public static void commandEntry() {
		FileInOut file = new FileInOut();
		KeyboardInput in = new KeyboardInput();
		SingleEntry dataInput = new SingleEntry();
		Scanner kb = new Scanner(System.in);
		SearchSort search = new SearchSort();
		
		int index = 0;
		//load file upon start
		try {
			index = file.read();		//this will prevent over writing the existing file data
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//sort the criteria to arrays
		search.sortList();
		
		
		int select = 0;
		while(select != 9) {
		
		//catch invalid input 
		do {
			try {
				p("Enter Command (Press 8 to show commands) > ");
				select = kb.nextInt();
			}
			catch(InputMismatchException e) {
				p("Invalid input");
				kb.next();
			}
			
		}while(select < 0);
			
			
			
			switch(select) {
				case 1:{
					
					p("Enter title");
					dataInput.setTitle(in.strIn(), index);
					
					p("Enter Year > ");
					dataInput.setYear(in.intIn(), index);
					
					p("Enter runtime (Minute) > ");
					dataInput.setRunTime(in.intIn(), index);
					
					p("Enter Actor 1 > ");
					dataInput.setActor1(in.strIn(), index);
					dataInput.setActor1(in.strIn(), index);
					
			
					p("Enter Actor2  > ");
					dataInput.setActor2(in.strIn(), index);		//This input gets ignored for. it is one of the String input issue
					
					p("Enter Director > ");
					dataInput.setDirector(in.strIn(), index);
					
					//writing the input data to db.txt
					file.write(StoreData.getDataStream(index));
					
					index++;
					
					break;
				}
				case 2:{
					search.sortList();
					p("Enter Actor > ");
					p(search.searchActors(in.strIn()));
					break;
				}
				case 3:{
					search.sortList();
					p("Enter year > ");
					p(search.searchYear(in.strIn()));
					break;
				}
				case 4:{
					search.sortList();
					p("Enter runtime > ");
					p(search.searchRunTime(in.strIn()));
					break;
				}
				case 5:{
					search.sortList();
					p("Enter direcotr > ");
					p(search.searchDirector(in.strIn()));
					break;
				}
				case 6:{
					search.sortList();
					p("Enter Title > ");
					p(search.searchTitle(in.strIn()));
					break;
				}
				case 7:{
					p("Enter title to delete");
					file.revmoveLine(in.strIn());
					//search.sortList();
					break;
					//It does not continue to the main prompt
				}
				case 8:{	
					displayCommands();
					break;
				}
				case 9:{
					break;
				}
				
				default: {
					p("Invalid input");
					
				}
				
				
			}
			
		}
	}
	
	public static void displayTitle() {
		p("------------MovieDataBase------------");
		p("     -----By Kenta Miyahara-----");
		p(" ");
	}
	
	public static void displayCommands() {
		p("1.) New Entry");
		p("2.) Search by actor");
		p("3.) Search by year");
		p("4.) Search by runtime");
		p("5.) Search by director");
		p("6.) Search by title");
		p("7.) Remove Entry");
		p("9.) Quit");
		p("");
	}

	public static <E> void p(E item) {
		System.out.println(item);
	}
}
