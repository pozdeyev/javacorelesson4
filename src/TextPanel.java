import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

/**
 * Java. Level 2. Lesson 4.
 * @author Dmitry Pozdeyev
 * @version 31.01.2019
 */


public class TextPanel extends JPanel {

    private JTextArea textArea; //Объявляем TextArea

    TextPanel() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        textArea = new JTextArea(); //Создаем экземпляр текстового поля

        //Параметры переноса слов
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false); //Без редактирования

        Border line = BorderFactory.createLineBorder(Color.WHITE);
        Border empty = new EmptyBorder(10, 10, 10, 10);
        CompoundBorder border = new CompoundBorder(line, empty);
        textArea.setBorder(border);

        textArea.setFont(new Font("Dialog", Font.PLAIN, 14)); //Шрифт

        JScrollPane jScrollPane = new JScrollPane(textArea);
        add(jScrollPane, BorderLayout.CENTER);
    }



    JTextArea getTextArea() {
        return textArea;
    }
}
