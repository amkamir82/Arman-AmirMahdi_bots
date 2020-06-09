import ReplyingMessages.EqualMessages;
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
        new EqualMessages("عه؟", "کیرخر");
        new EqualMessages("e?", "kire khar");
        new EqualMessages("na rastesh", "kiiiiiir");
        new EqualMessages("نه راستش", "کییییییر");
        new SpecialPersonMessages(122115491,
                new String[]{
                        "کیرم تو قیافت",
                        "کیر پانیذ تو هویتت",
                        "احسان جدی‌ام خیلی کسشر میگی جدی بس کن خفه شو معذرت بخواه و سیکتیر کن اینقد رو مخ نرو کیرم تو خودتو حرفت اوبی به تخمم هم نیست زندگیت"
                }
        );
//        new EqualMessages("کسکش", "بشین سرش کیسه بکش");
//        new EqualMessages("کس کش", "بشین سرش کیسه بکش");
//        new EqualMessages("کصکش", "بشین سرش کیسه بکش");
//        new EqualMessages("کص کش", "بشین سرش کیسه بکش");
//        new EqualMessages("salam", "کیرخر");
//        new EqualMessages("jvb ehsan bede", "kos nagoo ehsan kiri");
//        new EqualMessages("جواب احسان بده", "ولش کن، کلا عادت داره کس بگه");
//        new EqualMessages("سلام", "کیرخر");
//        new EqualMessages("کیر", "از داشته‌هات حرف بزن");
//        new EqualMessages("کیری", "سرش بمیری");
//        new FindRegexMessages("(a?)(آیا امیرمهدی).+", "گاخارشی؟");
//        new FindRegexMessages("آیا" + " .+ " + "گا میخوره", "خیلی");
//        new FindRegexMessages("بی‌ ناموس", "نگو ناموس. غنچه میکنی هنوز اذان نگفتن");
//        new FindRegexMessages("بیناموس", "نگو ناموس. غنچه میکنی هنوز اذان نگفتن");
//        new FindRegexMessages("بی‌ناموس", "نگو ناموس. غنچه میکنی هنوز اذان نگفتن");
//        new FindRegexMessages("@Ehsan_M_1380", "این کونیو تگ نکنین");
//        new FindRegexMessages("احسان", "اسم این کیری رو جلو من نیارین");
//        new FindRegexMessages(" کس ", "میگی کس دهنت آب نمیوفته کیری؟");
//        new FindRegexMessages(" کص ", "میگی کص دهنت آب نمیوفته کیری؟");
//        new FindRegexMessages("کس ", "میگی کس دهنت آب نمیوفته کیری؟");
//        new FindRegexMessages("کص ", "میگی کص دهنت آب نمیوفته کیری؟");
//        new FindRegexMessages("کیرم", "همون 2 سانتی رو میگی؟");
//        new FindRegexMessages("کیری", "سرش بمیری");
//        new FindRegexMessages("کون", "سوراخ لا پاتو ببین بعد بگو کون کله کیری");
//        new FindRegexMessages("@masbri", "این کونیو تگ نکنین");
//        new FindRegexMessages("مصبری", "اسم این کیری رو جلو من نیارین");
    }
}
