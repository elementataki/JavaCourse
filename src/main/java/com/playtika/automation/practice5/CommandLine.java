package com.playtika.automation.practice5;

/*
Разработать программу, аналог командной строки.
Программа должна поддерживать две команды:
chdir путь\куда\хотим\перейти - изменение текущего каталога
chdir ..  - выходим из текущего каталога
ls - отображение файлов и директорий в текущем каталоге

Если пользователь пытается перейти “в файл“, программа должна выдать соответствующую ошибку.

Если каталог не найден, программа также должна сообщить об ошибке.
*/

import java.util.Scanner;
import java.util.regex.Pattern;

public class CommandLine {

    private static Pattern SPLITTER = Pattern.compile("\\s");
    private CommandFactory commandFactory;
    private CommandContext commandContext;

    public CommandLine() {
        commandContext = new CommandContext();
        commandFactory = new CommandFactory();
    }

    public static void main(String[] args) {
        CommandLine cmd = new CommandLine();
        cmd.run();
    }

    public void run() {
        Scanner console = new Scanner(System.in);
        while (commandContext.isWorking()) {
            System.out.printf("$ %s > ", commandContext.getPath());
            String line = console.nextLine();
            String[] command = SPLITTER.split(line);
            ConsoleCommand consoleCommand = commandFactory.createCommand(command);
            consoleCommand.execute(commandContext);
        }
    }

}