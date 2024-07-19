package org.kukumama.devopsdaystaipei2024;

import java.util.Arrays;
import java.util.List;

public class Command {

    public List<String> parse(String s) {
        return Arrays.stream(s.split(" ")).toList();
    }
}
