package business;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;


public class CsvDateiLeser {
	public String getUeberschrift() {
		return "Hallo";
	}
	
	public String[] leseKunden() throws FileNotFoundException, IOException{
		Vector<String> ergebnis = new Vector<String>();
			String zeile = null;
		BufferedReader ein = new BufferedReader(new FileReader("Kunden.csv"));
		zeile = ein.readLine();
		while(zeile != null && zeile.length() != 0) {
			ergebnis.add(zeile);
			zeile = ein.readLine();
		}
		
		ein.close();
		return ergebnis.toArray(new String[] {});
	}
}
