
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Change {

	public static void incrementByOne(){
		//Ensures the correct directory structure exists...I think
		//File dir = new File("C:\\Users\\Max\\workspace\\IncrimentTextFile\\src\\TrackerTextFile");
		//if (!dir.exists()) dir.mkdir();

		try {
			String i = ""; //Default value
			int j=0;

			File input = new File("Tracker.txt");
                       
			
			if(input.exists()) {
				Scanner sc = new Scanner(input);
				
				if(sc.hasNextInt()){
						j= sc.nextInt();
						//j=Integer.parseInt(i);
						
				
				
				}
				sc.close();
			FileWriter pw = new FileWriter("Tracker.txt");
			
			j += 1;
			System.out.println("Number ="+j);
			pw.write(Integer.toString(j));
			
			sc.close();
			pw.close();
			
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args){
		
		incrementByOne();
		
	}
	
}

