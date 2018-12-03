
package commandpattern;

public class UnsetColor implements Command{
    
    PaintFile pf = new PaintFile();
   
    
    public UnsetColor(PaintFile pf) {
        this.pf = pf;
    }
    
    @Override
    public void execute() {
        System.out.println("Unset Color executed"); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void undo() {
    }    
}
