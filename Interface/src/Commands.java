import java.util.ArrayList;
import java.util.List;

public class Commands {
    public List<Command> commands;

    Commands(){
        commands = new ArrayList<>();
        this.commands.add(new Data());
        this.commands.add(new Dir());
        this.commands.add(new Exit());
        this.commands.add(new Time());
        this.commands.add(new Help());
    }
}
