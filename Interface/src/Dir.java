public class Dir implements Command{
    @Override
    public String getName() {
        return "dir";
    }

    @Override
    public void exec() {
        System.out.println("Директоия: "+ System.getProperty("user.dir"));
    }
}
