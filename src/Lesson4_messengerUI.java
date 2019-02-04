import javax.swing.*;

/**
 * Java. Level 2. Lesson 4.
 * @author Dmitry Pozdeyev
 * @version 31.01.2019
 */

/*
Урок 4. Продвинутые вопросы создания графического интерфейса
1. Создать окно для клиентской части чата: большое текстовое поле для отображения переписки в центре окна.
Однострочное текстовое поле для ввода сообщений и кнопка для отсылки сообщений на нижней панели.
Сообщение должно отсылаться либо по нажатию кнопки на форме, либо по нажатию кнопки Enter.
При «отсылке» сообщение перекидывается из нижнего поля в центральное.
*/


public class Lesson4_messengerUI {

    private static MainChatWindow mainChatWindow;  //Объявляем окно

    public static void main(String[] args) {
        SwingUtilities.invokeLater (new Runnable() {
            @Override
            public void run() {
                mainChatWindow = new MainChatWindow(); //Создаем экземпляр окна
            }
        }); //
    }

}