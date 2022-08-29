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

package fun.surviv.discord;

import fun.surviv.discord.cli.SurvivalDiscordBotCLI;
import fun.surviv.discord.configuration.JsonConfig;
import fun.surviv.discord.configuration.defaults.DefaultDebugConfig;
import fun.surviv.discord.configuration.defaults.DefaultGeneralConfig;
import fun.surviv.discord.configuration.defaults.StatusConfig;
import fun.surviv.discord.configuration.types.DebugConfig;
import fun.surviv.discord.configuration.types.GeneralConfig;
import fun.surviv.discord.dc.DiscordBotImpl;
import fun.surviv.discord.logging.LogConstants;
import fun.surviv.discord.utils.Zipper;
import lombok.Getter;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.internal.entities.ActivityImpl;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * SurvivalDiscordbot; fun.surviv.discord:SurvivalDiscordBotLoader
 *
 * @author LuciferMorningstarDev - https://github.com/LuciferMorningstarDev
 * @since 27.08.2022
 */
public class SurvivalDiscordBotLoader implements Bot {

    @Getter
    private static final Logger logger;
    @Getter
    private static SurvivalDiscordBotLoader instance;

    static {
        logger = Logger.getLogger(SurvivalDiscordBotLoader.class.getName());
    }

    @Getter
    private final File libPath;
    @Getter
    private final File configPath;
    @Getter
    private final File currentWorkingDir;
    @Getter
    private JsonConfig<DebugConfig> debugConfig;
    @Getter
    private JsonConfig<GeneralConfig> generalConfig;
    @Getter
    private JsonConfig<StatusConfig> statusConfig;
    @Getter
    private SurvivalDiscordBotCLI cli;
    @Getter
    private DiscordBotImpl bot;

    public SurvivalDiscordBotLoader(File libPath, File configPath, File currentWorkingDir) {
        this.libPath = libPath;
        this.configPath = configPath;
        this.currentWorkingDir = currentWorkingDir;
        instance = this;
    }

    public static void log(String format, String... args) {
        if (logger == null) {
            return;
        }
        logger.info(String.format(format, args));
    }

    public static void log(String message) {
        if (logger == null) {
            return;
        }
        logger.info(LogConstants.BOT + message);
    }

    @Override
    public void enable() {
        try {

            File loggerPath = new File(currentWorkingDir, "logs/");
            if (!loggerPath.exists()) {
                loggerPath.mkdirs();
            }
            String fl = loggerPath.toPath().toAbsolutePath() + "/latest.log";
            File logFile = new File(fl);
            if (logFile.exists()) {
                Zipper.compressGzip(logFile.toPath(), Path.of(loggerPath.toPath().toAbsolutePath() + "/log." + loggerPath.listFiles().length + ".log.gz"));
            }
            FileHandler fh = new FileHandler(fl, 50000, 1);
            fh.setFormatter(new SimpleFormatter());
            fh.setLevel(Level.ALL);
            logger.addHandler(fh);
            log("Logger File: '" + fl + "'");
        } catch (Exception e) {
            e.printStackTrace();
        }

        log("Enabling Discord Bot");

        if (!libPath.exists()) {
            logger.info(LogConstants.FILES + "Creating LibsPath");
            libPath.mkdirs();
        }

        if (!configPath.exists()) {
            logger.info(LogConstants.FILES + "Creating Config Path");
            configPath.mkdirs();
        }


        try {
            String startFilePath = currentWorkingDir.toPath().toAbsolutePath() + "/startbot.sh";
            File startFile = new File(startFilePath);
            if (!startFile.exists()) {
                FileUtils.copyToFile(getClass().getResourceAsStream("/startbot.sh"), startFile);
            }
            if (!startFile.canExecute()) {
                startFile.setExecutable(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.setupConfigs();
        new Thread(() -> cli = new SurvivalDiscordBotCLI(this)).start();
        new Thread(() -> bot = new DiscordBotImpl(this)).start(); // creates new thread

        log("Discord Bot successfully loaded...");
    }

    private void setupConfigs() {
        try {
            File debugConfigFile = new File(configPath, "debug.json");
            this.debugConfig = new JsonConfig<>(DebugConfig.class, debugConfigFile);
            this.debugConfig.setDefault(DebugConfig.class, new DefaultDebugConfig());
            this.debugConfig.load(true);
            this.debugConfig.save(false);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        try {
            File generalConfigFile = new File(configPath, "general.json");
            this.generalConfig = new JsonConfig<>(GeneralConfig.class, generalConfigFile);
            this.generalConfig.setDefault(GeneralConfig.class, new DefaultGeneralConfig());
            this.generalConfig.load(true);
            this.generalConfig.save(false);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        try {
            File statusConfigFile = new File(configPath, "status.json");
            this.statusConfig = new JsonConfig<>(StatusConfig.class, statusConfigFile);
            this.statusConfig.setDefault(StatusConfig.class, new StatusConfig(
                    Arrays.asList(
                            (ActivityImpl) Activity.of(Activity.ActivityType.COMPETING, "Zombum"),
                            (ActivityImpl) Activity.of(Activity.ActivityType.PLAYING, "Minecraft auf surviv.fun"),
                            (ActivityImpl) Activity.of(Activity.ActivityType.WATCHING, "Discord Server"),
                            (ActivityImpl) Activity.of(Activity.ActivityType.LISTENING, "/commands")
                    )
            ));
            this.statusConfig.load(true);
            this.statusConfig.save(false);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public int disable() {
        log("CLI EXIT: " + cli.disable());
        log("BOT EXIT: " + bot.disable());
        return 0;
    }

    public void info(String format, String... args) {
        if (logger == null) {
            return;
        }
        logger.info(String.format(format, args));
    }

    public void info(String message) {
        if (logger == null) {
            return;
        }
        logger.info(LogConstants.BOT + message);
    }

}
