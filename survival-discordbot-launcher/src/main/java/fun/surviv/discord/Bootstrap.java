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

import fun.surviv.discord.dependency.DependencyInit;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

/**
 * SurvivalDiscordbot; fun.surviv.discord:Bootstrap
 *
 * @author LuciferMorningstarDev - https://github.com/LuciferMorningstarDev
 * @since 27.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Bootstrap {

    @Getter
    private static final Logger logger;
    private static SurvivalDiscordBotLoader bot;

    static {
        logger = Logger.getLogger(Bootstrap.class.getName());
    }

    public static void main(String[] args) {
        try {

            logger.severe("loading dependencies...");
            for (String depend : DependencyInit.getDependencies()) {
                Agent.getAgent().load(depend);
            }
            logger.severe("loaded dependencies...");


        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            Path currentRelativePath = Paths.get("");
            bot = new SurvivalDiscordBotLoader(Agent.getLibDir(), new File(currentRelativePath.toAbsolutePath().toString(), "configuration/"), new File(currentRelativePath.toAbsolutePath().toString()));
            new Thread(() -> bot.enable()).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                if (bot != null) {
                    bot.disable();
                }
                bot = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "ShutDownHook"));

    }

}
