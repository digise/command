import java.util.Stack;

public class Invoker {
    private Command command;
    private Stack<Command> movimientos = new Stack<>();

    public void setCommand(Command command){
        this.command = command;
    }
    public void guardarCommand(Command command){
        movimientos.add(command);
        System.out.println("El comando guardado ha sido: " + command.getMovimiento());
    }

    public Command borrarCommand(){
       Command command = movimientos.pop();
       return command;
    }
    public void go(){
        movimientos.forEach(command -> command.execute());
    }
}
