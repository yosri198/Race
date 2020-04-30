package test.race;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class RaceResults {
	  
	
	public TimeDuration resultTime;
	public String tagNumber;
	int NumberJouers=0;
	

	private RaceResults(TimeDuration resultTime, String tagNumber) {
		
		this.resultTime = resultTime;
		this.tagNumber = tagNumber;
	}





	public static void main(String[] args)  {
		
		Scanner jouers = new Scanner(System.in);
		System.out.println("Entrez le nombres de jouers dans le Race:");
		int NumberJouers = jouers.nextInt();
		
		for(int i=1; i<=NumberJouers;i++) {
			
			Scanner identifiant = new Scanner(System.in);
			System.out.println("Entrez l'identifiant de jouer numero:" + i);
			 String tagNumber = identifiant.next();
			 
			 
			 Scanner time = new Scanner(System.in);
				System.out.println("Entrez l'identifiant de jouer numero:" + i);
				 String resultTime = identifiant.next();
				 
	
			 
			 
	}	
		
	}
		
	

	public void onNewResult(String tagNumber, TimeDuration resultTime) {
		
		HashMap<String,TimeDuration> map = new HashMap<String,TimeDuration>();
		for(int i=1; i<=NumberJouers;i++) {
        map.put(tagNumber, resultTime);
        map.put(tagNumber, resultTime);
        map.put(tagNumber, resultTime);
        map.put(tagNumber, resultTime);
		}
		
		for (Entry<String, TimeDuration> mapentry : map.entrySet()) {
	           System.out.println("clé: "+mapentry.getKey() 
	                              + " | valeur: " + mapentry.getValue());
	        }
	}
	
	

	public  void printResults() {
	
	}
	
	
	}


