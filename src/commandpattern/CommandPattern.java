/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern;

/**
 *
 * @author пк
 */
public class CommandPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PaintFile pf = new PaintFile();
        RemoteControl rm = new RemoteControl();
        
        //Setting Actions
        SetBackImage setBackImage = new SetBackImage(pf);
        SetColor setColor = new SetColor(pf);
        
        //Unsetting Actions
        UnsetBackImage unsetBackImage = new UnsetBackImage(pf);
        UnsetColor unsetColor = new UnsetColor(pf);
        
        //setting actions to Remote Control
        rm.setCommand(0, setColor, unsetColor);
        rm.setCommand(1, setBackImage, unsetBackImage);
        
        //Testing
        rm.onPressed(0);
        rm.onPressed(1);
        rm.undoPressed();
        rm.undoPressed();
        rm.offPressed(1);
       
    }
    
}
