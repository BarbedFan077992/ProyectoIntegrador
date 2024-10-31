/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.proyectointegrador.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ucr.ac.cr.tm2100.g3.proyectointegrador.View.GUIGame;
import ucr.ac.cr.tm2100.g3.proyectointegrador.View.GUIHistory;
import ucr.ac.cr.tm2100.g3.proyectointegrador.View.GUIInstruction;
import ucr.ac.cr.tm2100.g3.proyectointegrador.View.GUIOptions;

/**
 *
 * @author casa
 */
public class GameController implements ActionListener{

    private GUIOptions guiOptions;
    private GUIHistory guiHistory;
    private GUIInstruction guiInstruction;
    private GUIGame guiGame;
            
    public GameController() {
        guiOptions=new GUIOptions(this);
        guiHistory=new GUIHistory(this);
        guiGame=new GUIGame(this);
        guiOptions.escuchar(this);
        guiInstruction=new GUIInstruction(this);
        guiHistory.escuchar(this);
        guiInstruction.escuchar(this);
        guiGame.escuchar(this);
        guiOptions.setVisible(true);
        
    }//fin constructor
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Play":
                    guiOptions.setVisible(false);
                    guiGame.setVisible(true);
                    JOptionPane.showMessageDialog(null, "El juego todavia sigue en proceso de programación, vuelva luego");
                
                    break;
            case "History":
                    guiOptions.setVisible(false);
                    guiHistory.setVisible(true);
                break;
            case "Instruction":
                    guiOptions.setVisible(false);
                    guiInstruction.setVisible(true);
                    break;
            case "Exit":
                    System.exit(0);
                break;
            case "OutHistory":
                    guiHistory.setVisible(false);
                    guiOptions.setVisible(true);
                break;
            case "OutInstruction":
                    guiInstruction.setVisible(false);
                    guiOptions.setVisible(true);
                break;
            case "OutGame":
                    guiGame.setVisible(false);
                    guiOptions.setVisible(true);
                break;
        }//fin switch
    }//finMetodoSwitch
}//fin codigo
