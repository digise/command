public class Back  implements Command {

    private BeeBot beeBot;
    private String movimiento;

    public Back(BeeBot beeBot) {
        this.beeBot = beeBot;
        this.movimiento = "Hacia atrás";
    }

    @Override
    public String getMovimiento() {
        return movimiento;
    }

    @Override
    public void execute() {
        beeBot.mover(movimiento);
    }
}
