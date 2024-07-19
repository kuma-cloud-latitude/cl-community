package org.kukumama.devopsdaystaipei2024;

/**
 * @author cash.wu
 * @since 2024/07/19
 */
public class Arg {
    public Command parse(String cmd) {
        //if (command.contains("-p")) {
        //  var command = new Command();
        //  return "1234";
        //}
        var command = new Command();
        if (cmd.contains("-l")) {
            command.Log = true;
        }
        if (cmd.contains("-p")) {
            command.Port = "1234";
        }
        return command;
    }
}

