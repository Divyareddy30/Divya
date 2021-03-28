/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author Jana
 */
public class ReadConfig {

    private Map<String,String> TASC_Config=new HashMap<String,String>();  
    
ReadConfig(String Filepath){
    File file = new File(Filepath);
    BufferedReader br = null;
    String strLine = "";
    try {
        br = new BufferedReader( new FileReader(Filepath));
        while( (strLine = br.readLine()) != null){
          String[] config = strLine.split(":");
          if(config.length == 2) TASC_Config.put(config[0].strip(), config[1].strip());
        }
        br.close();
    } catch (FileNotFoundException e) {
        System.err.println("File not found");
    } catch (IOException e) {
        System.err.println("Unable to read the file.");
    }
 
    }
public Map<String,String> getConfig(){   return this.TASC_Config; }

}
