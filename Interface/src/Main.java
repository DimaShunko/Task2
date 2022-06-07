import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean b;

        Scanner scanner = new Scanner(System.in);
        List<Command> commands = new ArrayList<>();
        commands.add(new Data());
        commands.add(new Dir());
        commands.add(new Exit());
        commands.add(new Help());
        commands.add(new Time());
        System.out.println("Введите команду");
        new Help().exec();

        while (true){
            String name = scanner.nextLine();
            b = false;
            for(Command command: commands){
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
