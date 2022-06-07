import java.time.LocalTime;

public class Time implements Command{
    @Override
    public String getName() {
        return "time";
    }

    @Override
    public void exec() {
        LocalTime time = LocalTime.now();
        System.out.println(time);
    }
}
