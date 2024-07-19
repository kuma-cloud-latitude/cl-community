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
        command.Log = false;
        command.Port = "8080";
        command.Path = "";

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

            if (p_args.length == 2) {
                command.Port = p_args[1].trim();
            }
            else {
                command.Port = "8080";
            }
        }
        return command;
    }
}

