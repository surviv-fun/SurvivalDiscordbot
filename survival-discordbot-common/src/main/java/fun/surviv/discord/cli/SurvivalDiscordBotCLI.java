/*
 * #
 * # License and Copyright Notice
 * ä
 * #   ██████  █    ██  ██▀███   ██▒   █▓ ██▓ ██▒   █▓       █████▒█    ██  ███▄    █
 * # ▒██    ▒  ██  ▓██▒▓██ ▒ ██▒▓██░   █▒▓██▒▓██░   █▒     ▓██   ▒ ██  ▓██▒ ██ ▀█   █
 * # ░ ▓██▄   ▓██  ▒██░▓██ ░▄█ ▒ ▓██  █▒░▒██▒ ▓██  █▒░     ▒████ ░▓██  ▒██░▓██  ▀█ ██▒
 * #   ▒   ██▒▓▓█  ░██░▒██▀▀█▄    ▒██ █░░░██░  ▒██ █░░     ░▓█▒  ░▓▓█  ░██░▓██▒  ▐▌██▒
 * # ▒██████▒▒▒▒█████▓ ░██▓ ▒██▒   ▒▀█░  ░██░   ▒▀█░   ██▓ ░▒█░   ▒▒█████▓ ▒██░   ▓██░
 * # ▒ ▒▓▒ ▒ ░░▒▓▒ ▒ ▒ ░ ▒▓ ░▒▓░   ░ ▐░  ░▓     ░ ▐░   ▒▓▒  ▒ ░   ░▒▓▒ ▒ ▒ ░ ▒░   ▒ ▒
 * # ░ ░▒  ░ ░░░▒░ ░ ░   ░▒ ░ ▒░   ░ ░░   ▒ ░   ░ ░░   ░▒   ░     ░░▒░ ░ ░ ░ ░░   ░ ▒░
 * # ░  ░  ░   ░░░ ░ ░   ░░   ░      ░░   ▒ ░     ░░   ░    ░ ░    ░░░ ░ ░    ░   ░ ░
 * #       ░     ░        ░           ░   ░        ░    ░            ░              ░
 * #                                 ░            ░     ░
 * #
 * #  𝕮𝖔𝖕𝖞𝖗𝖎𝖌𝖍𝖙 (𝖈) 2022 𝕷𝖚𝖈𝖎𝖋𝖊𝖗𝕸𝖔𝖗𝖓𝖎𝖓𝖌𝖘𝖙𝖆𝖗𝕯𝖊𝖛 <𝖈𝖔𝖓𝖙𝖆𝖈𝖙@𝖑𝖚𝖈𝖎𝖋𝖊𝖗-𝖒𝖔𝖗𝖓𝖎𝖓𝖌𝖘𝖙𝖆𝖗.𝖉𝖊𝖛>
 * #
 * #   𝕮𝖔𝖕𝖞𝖗𝖎𝖌𝖍𝖙 (𝖈) 2022 𝖘𝖚𝖗𝖛𝖎𝖛.𝖋𝖚𝖓 <𝖈𝖔𝖓𝖙𝖆𝖈𝖙@𝖘𝖚𝖗𝖛𝖎𝖛.𝖋𝖚𝖓>
 * #   𝕮𝖔𝖕𝖞𝖗𝖎𝖌𝖍𝖙 (𝖈) 2022 𝖘𝖚𝖗𝖛𝖎𝖛.𝖋𝖚𝖓 𝖙𝖊𝖆𝖒 𝖆𝖓𝖉 𝖈𝖔𝖓𝖙𝖗𝖎𝖇𝖚𝖙𝖔𝖗𝖘
 * #
 * # 𝕿𝖍𝖎𝖘 𝖕𝖗𝖔𝖌𝖗𝖆𝖒 𝖎𝖘 𝖋𝖗𝖊𝖊 𝖘𝖔𝖋𝖙𝖜𝖆𝖗𝖊: 𝖞𝖔𝖚 𝖈𝖆𝖓 𝖗𝖊𝖉𝖎𝖘𝖙𝖗𝖎𝖇𝖚𝖙𝖊 𝖎𝖙 𝖆𝖓𝖉/𝖔𝖗 𝖒𝖔𝖉𝖎𝖋𝖞 𝖎𝖙 𝖚𝖓𝖉𝖊𝖗 𝖙𝖍𝖊 𝖙𝖊𝖗𝖒𝖘 𝖔𝖋 𝖙𝖍𝖊 𝕲𝕹𝖀
 * # 𝕲𝖊𝖓𝖊𝖗𝖆𝖑 𝕻𝖚𝖇𝖑𝖎𝖈 𝕷𝖎𝖈𝖊𝖓𝖘𝖊 𝖆𝖘 𝖕𝖚𝖇𝖑𝖎𝖘𝖍𝖊𝖉 𝖇𝖞 𝖙𝖍𝖊 𝕱𝖗𝖊𝖊 𝕾𝖔𝖋𝖙𝖜𝖆𝖗𝖊 𝕱𝖔𝖚𝖓𝖉𝖆𝖙𝖎𝖔𝖓, 𝖊𝖎𝖙𝖍𝖊𝖗 𝖛𝖊𝖗𝖘𝖎𝖔𝖓 3 𝖔𝖋 𝖙𝖍𝖊 𝕷𝖎𝖈𝖊𝖓𝖘𝖊, 𝖔𝖗
 * # (𝖆𝖙 𝖞𝖔𝖚𝖗 𝖔𝖕𝖙𝖎𝖔𝖓) 𝖆𝖓𝖞 𝖑𝖆𝖙𝖊𝖗 𝖛𝖊𝖗𝖘𝖎𝖔𝖓.
 * #
 * # 𝕿𝖍𝖎𝖘 𝖕𝖗𝖔𝖌𝖗𝖆𝖒 𝖎𝖘 𝖉𝖎𝖘𝖙𝖗𝖎𝖇𝖚𝖙𝖊𝖉 𝖎𝖓 𝖙𝖍𝖊 𝖍𝖔𝖕𝖊 𝖙𝖍𝖆𝖙 𝖎𝖙 𝖜𝖎𝖑𝖑 𝖇𝖊 𝖚𝖘𝖊𝖋𝖚𝖑, 𝖇𝖚𝖙 𝖂𝕴𝕿𝕳𝕺𝖀𝕿 𝕬𝕹𝖄 𝖂𝕬𝕽𝕽𝕬𝕹𝕿𝖄;
 * # 𝖜𝖎𝖙𝖍𝖔𝖚𝖙 𝖊𝖛𝖊𝖓 𝖙𝖍𝖊 𝖎𝖒𝖕𝖑𝖎𝖊𝖉 𝖜𝖆𝖗𝖗𝖆𝖓𝖙𝖞 𝖔𝖋 𝕸𝕰𝕽𝕮𝕳𝕬𝕹𝕿𝕬𝕭𝕴𝕷𝕴𝕿𝖄 𝖔𝖗 𝕱𝕴𝕿𝕹𝕰𝕾𝕾 𝕱𝕺𝕽 𝕬 𝕻𝕬𝕽𝕿𝕴𝕮𝖀𝕷𝕬𝕽 𝕻𝖀𝕽𝕻𝕺𝕾𝕰.
 * # 𝕾𝖊𝖊 𝖙𝖍𝖊 𝕲𝕹𝖀 𝕲𝖊𝖓𝖊𝖗𝖆𝖑 𝕻𝖚𝖇𝖑𝖎𝖈 𝕷𝖎𝖈𝖊𝖓𝖘𝖊 𝖋𝖔𝖗 𝖒𝖔𝖗𝖊 𝖉𝖊𝖙𝖆𝖎𝖑𝖘.
 * #
 * # 𝖄𝖔𝖚 𝖘𝖍𝖔𝖚𝖑𝖉 𝖍𝖆𝖛𝖊 𝖗𝖊𝖈𝖊𝖎𝖛𝖊𝖉 𝖆 𝖈𝖔𝖕𝖞 𝖔𝖋 𝖙𝖍𝖊 𝕲𝕹𝖀 𝕲𝖊𝖓𝖊𝖗𝖆𝖑 𝕻𝖚𝖇𝖑𝖎𝖈 𝕷𝖎𝖈𝖊𝖓𝖘𝖊 𝖆𝖑𝖔𝖓𝖌 𝖜𝖎𝖙𝖍 𝖙𝖍𝖎𝖘 𝖕𝖗𝖔𝖌𝖗𝖆𝖒.
 * # 𝕴𝖋 𝖓𝖔𝖙, 𝖘𝖊𝖊 <𝖍𝖙𝖙𝖕𝖘://𝖜𝖜𝖜.𝖌𝖓𝖚.𝖔𝖗𝖌/𝖑𝖎𝖈𝖊𝖓𝖘𝖊𝖘/>.
 * #
 */

package fun.surviv.discord.cli;

import fun.surviv.discord.SurvivalDiscordBotLoader;
import fun.surviv.discord.cli.command.CLICommandExecutor;
import fun.surviv.discord.cli.command.CLICommandMap;
import fun.surviv.discord.cli.command.defaults.ClearCommand;
import fun.surviv.discord.cli.command.defaults.StopCommand;
import fun.surviv.discord.cli.command.defaults.UpdateCommand;
import fun.surviv.discord.cli.input.Completion;
import lombok.Getter;
import lombok.Setter;
import org.jline.reader.*;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import org.jline.utils.AttributedString;
import org.jline.utils.InfoCmp;
import org.jline.widget.AutosuggestionWidgets;

import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.StreamHandler;

import static org.jline.reader.LineReader.*;
import static org.jline.reader.LineReader.Option.HISTORY_IGNORE_SPACE;
import static org.jline.reader.LineReader.Option.HISTORY_TIMESTAMPED;
import static org.jline.utils.AttributedStyle.BRIGHT;
import static org.jline.utils.AttributedStyle.DEFAULT;

/**
 * SurvivalDiscordbot; fun.surviv.discord.cli:SurvivalDiscordBotCLI
 *
 * @author LuciferMorningstarDev - https://github.com/LuciferMorningstarDev
 * @since 28.08.2022
 */
public class SurvivalDiscordBotCLI extends StreamHandler {

    @Getter
    private static SurvivalDiscordBotCLI instance;
    @Setter
    boolean shouldClose = false;
    private static Thread cliThread;
    private static Thread clearPromptThread;

    private static int exitCode = -1;

    @Getter
    private static Terminal terminal;

    @Getter
    private static LineReader lineReader;

    @Getter
    private final SurvivalDiscordBotLoader discordBot;

    @Getter
    private static CLICommandMap commandMap;

    public SurvivalDiscordBotCLI(SurvivalDiscordBotLoader discordBot) {
        instance = this;
        this.discordBot = discordBot;
        commandMap = new CLICommandMap(
                new ClearCommand(),
                new StopCommand(),
                new UpdateCommand()
        );

        if (cliThread != null) {
            if (!cliThread.isInterrupted()) {
                cliThread.interrupt();
            }
            cliThread = null;
        }
        cliThread = new Thread(() -> listen(), "CLI");
        cliThread.start();

        clearPromptThread = new Thread(() -> {
            new Timer("PromptClearTimer").scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    try {
                        lineReader.getTerminal().puts(InfoCmp.Capability.carriage_return);
                        lineReader.callWidget(LineReader.REDRAW_LINE);
                        lineReader.callWidget(LineReader.REDISPLAY);
                        lineReader.getTerminal().writer().flush();
                    } catch (Exception e) {
                    }
                }
            }, 1, 100);
        }, "PromptClearTimer");
        clearPromptThread.start();

        discordBot.info("enabling CLI");
    }

    public void listen() {
        try {
            terminal = TerminalBuilder.builder().name("SurvivalDiscordbot").color(true).encoding("UTF-8").build();
            lineReader = LineReaderBuilder.builder().terminal(terminal).completer(Completion.commandCompleter()).variable(HISTORY_FILE, Path.of(discordBot.getCurrentWorkingDir().toPath().toAbsolutePath() + "/.terminal_history")).variable(SECONDARY_PROMPT_PATTERN, isRealTerminal() ? colored("%P -> ") : "").variable(BLINK_MATCHING_PAREN, 0).option(HISTORY_IGNORE_SPACE, false).build();
            lineReader.getKeyMaps().put(MAIN, lineReader.getKeyMaps().get(EditingMode.VIINS.getKeyMap()));
            lineReader.unsetOpt(HISTORY_TIMESTAMPED);
            AutosuggestionWidgets autosuggestionWidgets = new AutosuggestionWidgets(lineReader);
            autosuggestionWidgets.enable();


            // this.setOutputStream(lineReader.getTerminal().output());
            // SurvivalDiscordBotLoader.getLogger().addHandler(this);

            discordBot.info("CLI listening for commands. Type '/help' or '?' to get help.");
            while (!shouldClose) {
                String line = null;
                try {
                    line = readLine("%P -> ", "");
                    String args[] = line.split("\\s+");
                    if (args.length > 0) {
                        List<String> argsList = new ArrayList<>();
                        String command = args[0];
                        for (int i = 1; i < args.length; i++) {
                            argsList.add(args[i]);
                        }
                        try {
                            if (exec(command, argsList)) {
                                discordBot.info("Command Executed: '" + command + "', Additional Args: " + argsList);
                            } else {
                                discordBot.info("Type 'help' or '?' to get help.");
                            }
                        } catch (Exception ex) {
                            discordBot.info("Command Error in Command: '" + command + "'");
                            ex.printStackTrace();
                        }
                    }

                    lineReader.getBuffer().down();
                    lineReader.getTerminal().flush();
                } catch (UserInterruptException e) {
                    shouldClose = true;
                    // TODO: shutdown bot too
                } catch (EndOfFileException e) {
                    e.printStackTrace();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String readLine(String prompt, String buffer) {
        return lineReader.readLine(colored(prompt), null, buffer);
    }

    public static boolean exec(String command, List<String> args) {
        CLICommandExecutor cliCommand = commandMap.get(command);
        if (cliCommand != null) {
            try {
                return cliCommand.executeCommand(command, args);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public int disable() {
        exitCode = 0;
        if (cliThread != null) {
            exitCode = cliThread.getState().hashCode();
            if (!cliThread.isInterrupted()) {
                cliThread.interrupt();
            }
            cliThread = null;
        }

        if (clearPromptThread != null) {
            if (!clearPromptThread.isInterrupted()) {
                clearPromptThread.interrupt();
            }
            clearPromptThread = null;
        }

        discordBot.info("disabled CLI");
        return exitCode;
    }

    public static boolean isRealTerminal(Terminal terminal) {
        return !Terminal.TYPE_DUMB.equals(terminal.getType()) && !Terminal.TYPE_DUMB_COLOR.equals(terminal.getType());
    }

    public static boolean isRealTerminal() {
        return isRealTerminal(terminal);
    }

    public static Charset terminalEncoding() {
        return terminal.encoding();
    }

    public enum EditingMode {
        EMACS(LineReader.EMACS),
        VIOPP(LineReader.VIOPP),
        VIINS(LineReader.VIINS),
        VISUAL(LineReader.VISUAL),
        MAIN(LineReader.MAIN),
        SAFE(LineReader.SAFE),
        MENU(LineReader.MENU);

        private final String keyMap;

        EditingMode(String keyMap) {
            this.keyMap = keyMap;
        }

        public String getKeyMap() {
            return keyMap;
        }
    }

    public History getHistory() {
        return lineReader.getHistory();
    }

    private static String colored(String value) {
        return new AttributedString(value, DEFAULT.foreground(BRIGHT)).toAnsi();
    }

}
