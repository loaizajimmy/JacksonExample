/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplejackson;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jimmy Alejandro
 */
public class ExampleJacksonWrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            University university = new University("U de Caldas", "Colombia");
            university.addStudent(new Student("Mateo", "Lopez", "1010101"));
            university.addStudent(new Student("Sebastian", "Vasquez", "1010102"));
            university.addStudent(new Student("Esteban", "Herrera", "1010103"));
            
            System.out.println(university);
            
            JsonFactory factory = new JsonFactory();
            ObjectMapper objectMapper = new ObjectMapper(factory);
            
            objectMapper.writeValue(new File("university.json"), university);
            
            
        } catch (IOException ex) {
            Logger.getLogger(ExampleJacksonWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
}
