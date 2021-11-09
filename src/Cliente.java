public class Cliente {
    public static void main(String[] args) {

        BeeBot beeBot = new BeeBot();

        //ejercicio 1
        Invoker invoker = new Invoker();
        invoker.guardarCommand(new Forward(beeBot));
        invoker.guardarCommand(new Back(beeBot));
        invoker.guardarCommand(new Right(beeBot));
        invoker.guardarCommand(new Left(beeBot));

        System.out.println("\nBorramos el último comando: ");
        Command command = invoker.borrarCommand();
        System.out.println(command.getMovimiento());

        System.out.println("\nSeleccionamos el boton GO y el BeeBot hace los siguientes movimientos:");
        invoker.go();

    }
}
