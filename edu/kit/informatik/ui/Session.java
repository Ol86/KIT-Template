package edu.kit.informatik.ui;

import edu.kit.informatik.ui.commands.Command;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Session {

    private final Scanner scanner;
    private final List<Command> commands;
    private boolean isRunning;

    public Session() {
        this.scanner = new Scanner(System.in);
        this.commands = new ArrayList<>();
    }
}
