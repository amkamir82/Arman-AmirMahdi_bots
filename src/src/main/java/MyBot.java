//import org.telegram.telegrambots.api.methods.send.SendMessage;
//import org.telegram.telegrambots.api.objects.Update;
//import org.telegram.telegrambots.bots.TelegramLongPollingBot;
//import org.telegram.telegrambots.exceptions.TelegramApiException;
//
//public class MyBot extends TelegramLongPollingBot {
//
//    @Override
//    public String getBotToken() {
//        return "1047236620:AAHmK47QnBdLwOXMlfY9AfcwPuPUEWIGNd4";
//    }
//
//    @Override
//    public String getBotUsername() {
//        return "@A_M_K_bot";
//    }
//
//    @Override
//    public void onUpdateReceived(Update update) {
//        long chatID = update.getMessage().getChatId();
//        String command = update.getMessage().getText();
//        int messageID = update.getMessage().getMessageId();
//        SendMessage message = new SendMessage().setChatId(chatID).setReplyToMessageId(messageID);
//
//        if (command.equalsIgnoreCase("amirmahdi")) {
//            message.setChatId(chatID);
//            message.setText("bale");
//        } else if (command.equalsIgnoreCase("salam")) {
//            message.setChatId(chatID);
//            message.setText("salam o kir khar");
//        } else if (command.equalsIgnoreCase("khoobi")) {
//            message.setChatId(chatID);
//            message.setText("ga khar mani?");
//        } else {
//            message.setChatId(chatID);
//            message.setText("khafe baw");
//        }
//
//        try {
//            execute(message);
//        } catch (TelegramApiException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
