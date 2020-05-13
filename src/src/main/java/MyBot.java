import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyBot extends TelegramLongPollingBot {
    private static Matcher matcher;

    @Override
    public String getBotToken() {
        return "1047236620:AAHmK47QnBdLwOXMlfY9AfcwPuPUEWIGNd4";
    }

    @Override
    public String getBotUsername() {
        return "@A_M_K_bot";
    }

    @Override
    public void onUpdateReceived(Update update) {
        long chatID = update.getMessage().getChatId();
        String command = update.getMessage().getText();
        int messageID = update.getMessage().getMessageId();
        SendMessage message = new SendMessage().setChatId(chatID).setReplyToMessageId(messageID);

        if (command.equalsIgnoreCase("amirmahdi")) {
            message.setChatId(chatID);
            message.setText("bale");
        } else if (command.equalsIgnoreCase("salam")) {
            message.setChatId(chatID);
            message.setText("salam o kir kharrr");
        } else if (command.equalsIgnoreCase("khoobi")) {
            message.setChatId(chatID);
            message.setText("ga khar mani?");
        } else if (command.equalsIgnoreCase("jvb ehsan bede")) {
            message.setChatId(chatID);
            message.setText("kos nagoo ehsan kiri");
        } else if (command.equalsIgnoreCase("jvb jafar bede")) {
            message.setChatId(chatID);
            message.setText("kos mige jafar vlsh kon");
        } else if (command.equalsIgnoreCase("سلام")) {
            message.setChatId(chatID);
            message.setText("کیر");
        } else if (command.equalsIgnoreCase("آیا احسان گا میخوره")) {
            message.setChatId(chatID);
            message.setText("خیلی");
        } else if (command.equalsIgnoreCase("آیا علی گا میخوره")) {
            message.setChatId(chatID);
            message.setText("خیلی");
        } else if (command.startsWith("آیا امیرمهدی")) {
            message.setChatId(chatID);
            message.setText("گاخارشی؟");
        } else if (command.startsWith("بیناموس") || command.startsWith("بی ناموس")) {
            message.setChatId(chatID);
            message.setText("باز این گا خورد");
        } else if ((matcher = getMather(command, "کیر")).find()) {
            message.setChatId(chatID);
            message.setText("از داشته هات بگو");
        }

        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    private Matcher getMather(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(input);
    }
}
