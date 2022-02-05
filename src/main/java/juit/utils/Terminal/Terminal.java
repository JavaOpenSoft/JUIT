package juit.utils.Terminal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import juit.Components.Constants.WindowConstants;
public class Terminal{
    Action Run;
    String commands;
    JFrame frame = new JFrame("Terminal");
    JScrollPane scrollPane = new JScrollPane();
    TextArea textArea = new TextArea();
    CommandProcessor processor = CommandProcessor.getInstance();
    String username = System. getProperty("user.name");
    String SystemName = InetAddress.getLocalHost().getHostName();
    public Terminal() throws UnknownHostException {
        frame.add(textArea);
        textArea.append(username+"@"+username +"-" +SystemName);

    }
    public void run(String commands) throws IOException {
        processor.run(commands);
        this.commands = commands;
    }
    public String getPreviousCommand(){
        return commands;
    }
    public CommandProcessor getInstance()
    {
        return CommandProcessor.getInstance();
    }
}
class CommandProcessor {
    private CommandProcessor() {
    }

    public void run(String command) throws IOException {
        Runtime.getRuntime().exec(command);
    }

    public static CommandProcessor getInstance() {
        return CommandProcessorHolder.INSTANCE;
    }

    private static final class CommandProcessorHolder {
        static final CommandProcessor INSTANCE = new CommandProcessor();
    }
}
class Run extends AbstractAction{

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
