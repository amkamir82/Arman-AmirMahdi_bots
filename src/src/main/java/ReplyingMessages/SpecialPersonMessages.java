package ReplyingMessages;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;

import java.util.Random;

public class SpecialPersonMessages extends ReplyingMessage {
    private final int userID;
    private final String[] replyingMessages;
    private final Random random = new Random();

    public SpecialPersonMessages(int id, String[] replyingMessages) {
        this.userID = id;
        this.replyingMessages = replyingMessages;
    }

    @Override
    public SendMessage reply(Update update) {
        if (update.getMessage().getContact().getUserID() != userID)
            return null;
        return SpecialPersonMessages.getSendMessage(update,
                replyingMessages[random.nextInt(replyingMessages.length)]);
    }
}
