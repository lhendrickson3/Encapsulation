/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author User
 */
public class Game {

    private String saveFile;
    
    private GameCharacter toon1 = new GameCharacter();
    private GameWorld world1 = new GameWorld();
    
    public void loadSaveFile(String saveFile){
        System.out.println("loading your last save point");
    }

    public String getSaveFile() {
        return saveFile;
    }

    public void setSaveFile(String saveFile) {
        this.saveFile = saveFile;
    }
    
}