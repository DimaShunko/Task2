import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Command> commands;

    Main(){
        commands = new ArrayList<>();
        this.commands.add(new Date());
        this.commands.add(new Dir());
        this.commands.add(new Exit());
        this.commands.add(new Time());
        this.commands.add(new Help());
    }

    public static List<Command> getCommands() {
        return commands;
    }

    public static void main(String[] args) {
        boolean b;

        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        System.out.println("Введите команду");

        while (true){
            String name = scanner.nextLine();
            b = false;
            for(Command command: main.getCommands()){
                if(command.getName().contentEquals(name)){
                    command.exec();
                    b = true;
                    break;
                }
            }
            if(!b){
                System.out.println("Такой команды нет");
            }
        }
    }
}
