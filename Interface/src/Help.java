public class Help implements Command{
    @Override
    public String getName() {
        return "help";
    }

    @Override
    public void exec() {
        System.out.println("help - помощь");
        System.out.println("time - Московское время");
        System.out.println("date - дата");
        System.out.println("dir - дериктория");
        System.out.println("exit - выход");
    }
}
