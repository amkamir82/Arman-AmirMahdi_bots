import ReplyingMessages.EqualMessages;
import ReplyingMessages.FindRegexMessages;
import ReplyingMessages.SpecialPersonMessages;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;


public class Main {
    public static void main(String[] args) throws TelegramApiRequestException {
        init();
        ApiContextInitializer.init();
        TelegramBotsApi bot = new TelegramBotsApi();
        bot.registerBot(new MyBot());
    }

    private static void init() {
        new SpecialPersonMessages(122115491, new String[]{
                "باز تو گه خوردی؟",
                "بس کن احسان خیلی کس میگی",
                "اه کس نگو اینقد",
                "برو کونتو بده اوبنه",
                "برو خایه‌مال",
                "کیر ملکه تو حلقومت",
                "کیر به حقانیتت",
                "این یک دفعه ر نمیرینم بهت راحت باش",
                "کسی سگشو گم نکرده؟",
                "زشته با دهن روزه اینقد گه‌خوری",

        });

        new EqualMessages("amirmahdi", "bale");
        new EqualMessages("salam", "salam o kir kharrr");
        new EqualMessages("khoobi", "ga khar mani?");
        new EqualMessages("jvb ehsan bede", "kos nagoo ehsan kiri");
        new EqualMessages("jvb jafar bede", "kos mige jafar vlsh kon");
        new EqualMessages("سلام", "کیر");

        new FindRegexMessages("کیرم", "از داشته‌هات حرف بزن");
        new FindRegexMessages("(a?)(آیا امیرمهدی).+", "گاخارشی؟");
        new FindRegexMessages("آیا" + " .+ " + "گا میخوره", "خیلی");
        new FindRegexMessages("بی‌ناموس", "نگو ناموس. غنچه میکنی هنوز اذان نگفتن");
    }
}
