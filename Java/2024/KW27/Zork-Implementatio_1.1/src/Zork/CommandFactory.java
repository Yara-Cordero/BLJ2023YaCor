package Zork;


import org.apache.commons.lang3.ArrayUtils;


class CommandFactory {

    private static CommandFactory Instance;
    private static String regex = "\\s+";
    private CommandFactory() {}

    public static CommandFactory instance(){
        if (Instance == null){
            Instance = new CommandFactory();
        }
        return Instance;
    }

    public Command parse(String commandString){
        commandString = commandString.toLowerCase().trim();

        if (commandString.equals("move")){
            return new MovementCommand(commandString);
        } else if (commandString.equals("i") || commandString.equals("inventory")) {
            return new InventoryCommand();
        } else if (commandString.equals("take")) {
            return new TakeCommand(commandString);
        }

        String[] splitCommand = commandString.split(regex);
        if (ArrayUtils.contains(splitCommand, "move")){
            return new MovementCommand(splitCommand[1]);
        }
        else if (ArrayUtils.contains(splitCommand, "look")){
            return new LookCommand();
        } else if (ArrayUtils.contains(splitCommand, "take")) {
            return new TakeCommand(splitCommand[1]);
        }
        return new UnknownCommand(commandString);
    }
}
