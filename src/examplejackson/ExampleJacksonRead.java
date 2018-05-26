/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplejackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jimmy Alejandro
 */
public class ExampleJacksonRead {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();            
            University readUniversity = mapper.readValue(new File("university.json"), University.class);
            System.out.println(readUniversity);
            
        } catch (IOException ex) {
            Logger.getLogger(ExampleJacksonRead.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
