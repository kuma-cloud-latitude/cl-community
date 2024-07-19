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

            if (cmd.contains("-d")) {
                String[] d_args = cmd.split("-d");
                command.Path = d_args[1].trim();
            }
            else {
                command.Path = "/usr/logs";
            }
        }
        if (cmd.contains("-p")) {

            String[] p_args = cmd.split("-p");

            command.Port = p_args[1].trim();
        }
        return command;
    }
}

