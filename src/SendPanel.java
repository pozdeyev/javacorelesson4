import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Java. Level 2. Lesson 4.
 * @author Dmitry Pozdeyev
 * @version 31.01.2019
 */

public class SendPanel extends JPanel {

    private JTextField textField; //Текстовое поле ввода
    private JTextArea textArea;
    private String linebreak; //Переменная для переноса строки
    private Date date;
    private  SimpleDateFormat dateFormat; // объявляем переменную с типом SimpleDate


    SendPanel(JTextArea textArea) {
        this.textArea = textArea;

        textField = new JTextField() {

            @Override
            public void addNotify() {
                super.addNotify();
                requestFocus();
            }
        };
        linebreak = "";
        dateFormat = new SimpleDateFormat("HH:mm"); //формат отображения времени
        intiate();
    }

    //Cоздание кнопки
    private void intiate() {
        setLayout(new BorderLayout());
        JButton sendButton = new JButton("Отправить");

        sendButton.addActionListener(new SendBtnListener());
        textField.addActionListener(new SendBtnListener());

        add(textField, BorderLayout.CENTER); //Полве ввода по центру
        add(sendButton, BorderLayout.EAST);  //Кнопка на востоке
    }

    //Метод возвращающий текущее время
    private String getTime() {
        date = new Date();
        return dateFormat.format(date);
    }

    //Метод заполняющий textArea
    private void addmessage() {
        String message = textField.getText();

        if (!message.isEmpty()) {
            textArea.setText(String.format("%s%s[%s] %s", textArea.getText(), linebreak, getTime(), message));
            textField.setText(""); //очистка поля ввода
            linebreak = "\n";
        }
    }

    //"Слушаем" текстовое поле ввода и кнопку
    private class SendBtnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() instanceof JButton) {
                addmessage();
            }

            if (e.getSource() instanceof JTextField) {
                addmessage();
            }
        }
    }


}
