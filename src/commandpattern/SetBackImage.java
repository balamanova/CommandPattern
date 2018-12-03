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
public class SetBackImage implements Command{
    
    PaintFile pf = new PaintFile();
    
    public SetBackImage(PaintFile pf) {
        this.pf = pf;
    }
    
    @Override
    public void execute() {
        System.out.println("Set Background Image executed"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void undo() {
    }
    
}
