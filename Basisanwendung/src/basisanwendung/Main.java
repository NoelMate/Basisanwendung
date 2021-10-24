package basisanwendung;

import javafx.application.Application;
import javafx.stage.Stage;
import business.CsvDateiLeser;


public class Main extends Application{
	
    	@Override
    	public void start(Stage primaryStage) {
        	new Anwendersystem(primaryStage);
    	}	
    
    	public static void main(String[] args){
    		CsvDateiLeser cdl = new CsvDateiLeser();
    		String ueberschrift = cdl.getUeberschrift();
    		System.out.println(ueberschrift);
    		launch(args);
    	}
}
