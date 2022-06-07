public class Help implements Command{

    @Override
    public String getName() {
        return "help";
    }

    @Override
    public void exec() {
        Commands commands = new Commands();
        for (Command command: commands.commands){
            System.out.println(command.help());
        }

    }

    @Override
    public String help() {
        return "help - помощь";
    }
}
