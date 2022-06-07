public class Help implements Command{


    @Override
    public String getName() {
        return "help";
    }

    @Override
    public void exec() {
        for (Command com: Main.commands.commands){
            System.out.println(com.help());
        }

    }

    @Override
    public String help() {
        return "help - помощь";
    }
}
