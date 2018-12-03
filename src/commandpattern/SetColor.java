
package commandpattern;

public class SetColor implements Command{
    
    PaintFile pf = new PaintFile();
    
    public SetColor(PaintFile pf) {
        this.pf = pf;
    }
    
    @Override
    public void execute() {
        System.out.println("Set Color executed"); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void undo() {
    }
    
}
