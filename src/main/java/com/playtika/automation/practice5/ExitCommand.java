package com.playtika.automation.practice5;

public class ExitCommand implements ConsoleCommand {

    @Override
    public void execute(CommandContext context) {
        context.setWorking(false);
    }

}