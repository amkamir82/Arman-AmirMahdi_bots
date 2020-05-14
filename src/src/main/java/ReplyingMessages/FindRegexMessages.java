package ReplyingMessages;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRegexMessages extends ReplyingMessage {
    private final String regex;
    private final String replyMessage;

    public FindRegexMessages(String regex, String replyMessage) {
        this.regex = regex;
        this.replyMessage = replyMessage;
    }

    @Override
    public SendMessage reply(Update update) {
        Matcher matcher = getMatcher(update.getMessage().getText());
        if (!matcher.find())
            return null;
        return FindRegexMessages.getSendMessage(update, replyMessage);
    }

    private Matcher getMatcher(String input) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(input);
    }
}
