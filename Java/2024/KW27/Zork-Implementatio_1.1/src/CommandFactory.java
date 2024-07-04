

class CommandFactory {

    private static CommandFactory Instance;

    private CommandFactory() {}

    public static CommandFactory instance(){
        if (Instance == null){
            Instance = new CommandFactory();
        }
        return Instance;
    }

    public Command parse(String commandString){

        return new Command(commandString);
    }
}
