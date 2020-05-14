package ReplyingMessages;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;

public class EqualMessages extends ReplyingMessage {
    private final String text;
    private final String replyMessage;

    public EqualMessages(String text, String replyMessage) {
        this.text = text;
        this.replyMessage = replyMessage;
    }

    @Override
    public SendMessage reply(Update update) {
        String text = update.getMessage().getText();
        if(!this.text.equalsIgnoreCase(text))
            return null;
        return EqualMessages.getSendMessage(update, this.replyMessage);
    }
}
