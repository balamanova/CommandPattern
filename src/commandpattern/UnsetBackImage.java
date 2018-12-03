package commandpattern;

public class UnsetBackImage implements Command {

    PaintFile pf = new PaintFile();

    public UnsetBackImage(PaintFile pf) {
        this.pf = pf;
    }

    @Override
    public void execute() {
        System.out.println("Unset Background Image executed"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void undo() {
        
    }
}
