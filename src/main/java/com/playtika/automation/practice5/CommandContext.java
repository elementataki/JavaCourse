package com.playtika.automation.practice5;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CommandContext {

    private Path path = Paths.get("").toAbsolutePath();
    private boolean working = true;

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

}