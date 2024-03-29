/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlers;

import java.util.List;
import java.io.IOException;
import java.nio.file.Paths;
import model.Level;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre
 */
public class FileReader {

    /**
     * Reads a json file that contains all the levels and parses' it's content into an ArrayList of type Level
     * @param type
     * @return aList return the ArrayList<Level> generated  
    */
    public ArrayList<Level> GetAllLevels(String type) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Path filePath;
            if (type.equals("single"))
                filePath = Paths.get(getClass().getResource("/Resources/Levels.json").toURI());
            else
                filePath = Paths.get(getClass().getResource("/Resources/LevelsMulti.json").toURI());
            File from = new File(filePath.toString());
            //JSON from String to List<Level>
            List<Level> myLevels = mapper.readValue(from, mapper.getTypeFactory().constructCollectionType(List.class, Level.class));
            ArrayList<Level> aList = (ArrayList) myLevels;
            return aList;
        } catch (IOException | URISyntaxException ex) {
            return null;
        }
    }

    /**
     * Reads a json file that contains the saved level and parses' it's content into an object if type Level
     * @param path
     * @return Level: returns the Level generated  
    */
    public Level GetSavedLevel() {
        ObjectMapper mapper = new ObjectMapper();
        Path filePath;
        try {
            filePath = Paths.get(getClass().getResource("/Resources/").toURI());
            File from = new File(filePath + "/GameSave.json");
            if (!from.exists()) {
                return null;
            } else {
                Level mySaveLvl = mapper.readValue(from, mapper.getTypeFactory().constructType(Level.class));
                return mySaveLvl;
            }

        } catch (Exception ex) {
            String a = ex.toString();
        }
        return null;
    }

    /**
     * Creates/Changes a json file that will contain/contains the LevelState and parses' it's content into an object if type Level
    */
    public void SaveLevelState(String gameState, int numLvl) {
        Level a = new Level();
        a.setLevelId(numLvl);
        a.setLevelLayout(gameState);

        ObjectMapper mapper = new ObjectMapper();
        Path filePath;
        try {
            filePath = Paths.get(getClass().getResource("/Resources/").toURI());
            File to = new File(filePath + "/GameSave.json");
            if (!to.exists()) {
                to.createNewFile();
                mapper.writeValue(to, a);
                return;
            }
            PrintWriter writer = new PrintWriter(to);
            writer.print("");
            writer.close();
            mapper.writeValue(to, a);
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(FileReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
