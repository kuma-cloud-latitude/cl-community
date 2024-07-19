package org.kukumama.devopsdaystaipei2024;

import javax.sound.sampled.Port;

/**
 * @author cash.wu
 * @since 2024/07/19
 */
public class Arg {
    public Boolean parse(String command) {
        //if (command.contains("-p")) {
           //  var command = new Command();
          //  return "1234";
        //}

        return command.contains("-l");
    }
}

public class Command {
    String Port ;
    Boolean Log;

}
