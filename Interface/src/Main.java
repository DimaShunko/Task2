import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Commands commands;

    Main(){
        commands = new Commands();
    }
    
    public static void main(String[] args) {
        boolean b;

        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        System.out.println("Введите команду");

        while (true){
            String name = scanner.nextLine();
            b = false;
            for(Command command: main.commands.commands){
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
