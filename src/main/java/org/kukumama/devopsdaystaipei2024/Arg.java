package org.kukumama.devopsdaystaipei2024;

/**
 * @author cash.wu
 * @since 2024/07/19
 */
public class Arg {
    public Boolean parse(String command) {
        return command.contains("-l");
    }
}
