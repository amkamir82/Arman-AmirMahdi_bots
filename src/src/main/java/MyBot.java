import ReplyingMessages.ReplyingMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.util.regex.Matcher;

public class MyBot extends TelegramLongPollingBot {
    @Override
    public String getBotToken() {
        return "1047236620:AAHmK47QnBdLwOXMlfY9AfcwPuPUEWIGNd4";
    }

    @Override
    public String getBotUsername() {
        return "@A_M_K_bot";
    }

    public void onUpdateReceived(Update update) {
        System.out.println(update);
        for (ReplyingMessage replyingMessage : ReplyingMessage.getAllReplyingMessages()) {
            if (replyingMessage.accept(update)) {
                try {
                    execute(replyingMessage.reply(update));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }


}
