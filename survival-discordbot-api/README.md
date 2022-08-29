### Creating commands

First we need to create our command object, complete with its @CommandDescription annotation.

```java

import fun.surviv.discord.dc.command.AbstractCommand;
import fun.surviv.discord.dc.command.CommandAttribute;
import fun.surviv.discord.dc.command.CommandDescription;
import net.dv8tion.jda.core.entities.Message;

@CommandDescription(
        name = "echo",
        triggers = {"echo", "repeat", "copy"},
        description = "This command echoes what you say!",
        attributes = {@CommandAttribute(key = "args", value = "1")}
)
public class EchoCommand implements AbstractCommand<Message> {

    @Override
    public void execute(Message message, String args) {
        message.getChannel().sendMessage(args).queue();
    }

}

```

And now we can write a listener to handle the messages coming in from Discord!

```java

import fun.surviv.discord.dc.command.CommandHandler;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class EventHandler extends ListenerAdapter {

    private CommandHandler<Message> handler;
    private String commandTrigger;

    public EventHandler(CommandHandler<Message> handler, String commandTrigger) {
        this.handler = handler;
        this.commandTrigger = commandTrigger;
    }

    @Override
    public void onGuildMessageReceived(@Nonnull GuildMessageReceivedEvent event) {
        String msg = event.getMessage().getContentRaw();
        if (!msg.startsWith(commandTrigger)) return;
        String firstword = msg.split("\\s+")[0].replaceFirst(commandTrigger, "");
        handler.findAndExecute(firstword, event.getMessage(), msg.replaceFirst(msg.split("\\s+")[0], ""));
    }

}

```

And finally we can register everything when we build our JDA object!

```java

class myClass {
    
    void setup() {
        CommandHandler<Message> handler = new CommandHandler<>();
        handler.registerCommand(new EchoCommand());
        try {
            JDA jda = new JDABuilder().setToken("y0urs3cr3tt0k3nh3r3").addEventListeners(new EventHandler(handler, "!")).build();
        } catch (LoginException e) {}
    }
    
}

```
