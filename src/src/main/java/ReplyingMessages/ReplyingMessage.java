package ReplyingMessages;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;

import java.util.ArrayList;

public abstract class ReplyingMessage {
    private static ArrayList<ReplyingMessage> allReplyingMessages = new ArrayList<ReplyingMessage>();

    public ReplyingMessage() {
        allReplyingMessages.add(this);
    }

    public static ArrayList<ReplyingMessage> getAllReplyingMessages() {
        return allReplyingMessages;
    }

    public static SendMessage getSendMessage(Update update, String text) {
        Message message = update.getMessage();
        return new SendMessage().setChatId(message.getChatId())
                .setReplyToMessageId(message.getMessageId()).setText(text);
    }

    public boolean accept(Update update) {
        return reply(update) != null;
    }

    abstract public SendMessage reply(Update update);
}
