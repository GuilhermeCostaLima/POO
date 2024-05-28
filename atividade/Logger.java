package atividade;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private PrintWriter fileWriter;
    private boolean consoleMode;

    public Logger(boolean consoleMode) {
        this.consoleMode = consoleMode;
        if (!consoleMode) {
            try {
                fileWriter = new PrintWriter(new FileWriter("log.txt", true));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void log(Level level, String message) {
        String logMessage = formatLogMessage(level, message);
        if (consoleMode) {
            logToConsole(level, logMessage);
        } else {
            logToFile(logMessage);
        }
    }

    private String formatLogMessage(Level level, String message) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timestamp = dateFormat.format(new Date());
        return String.format("[%s] [%s] %s", timestamp, level, message);
    }

    private void logToConsole(Level level, String message) {
        switch (level) {
            case DEBUG:
                System.out.println("\u001B[32m" + message + "\u001B[0m");
                break;
            case WARNING:
                System.out.println("\u001B[33m" + message + "\u001B[0m");
                break;
            case ERROR:
                System.out.println("\u001B[31m" + message + "\u001B[0m");
                break;
        }
    }

    private void logToFile(String message) {
        fileWriter.println(message);
        fileWriter.flush();
    }

    public void switchMode(boolean consoleMode) {
        if (this.consoleMode == consoleMode) return;

        if (consoleMode) {
            fileWriter.close();
            this.consoleMode = true;
        } else {
            try {
                fileWriter = new PrintWriter(new FileWriter("log.txt", true));
                this.consoleMode = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
