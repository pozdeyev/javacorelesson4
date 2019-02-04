import javax.swing.*;
import java.awt.*;

/**
 * Java. Level 2. Lesson 4.
 * @author Dmitry Pozdeyev
 * @version 31.01.2019
 */


public class MainChatWindow extends JFrame {

    public MainChatWindow(){

        int sizeX = 400; //Горизонтальный размер окна
        int sizeY = 600; //Вертикальный размер окна

        int centerX = (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2);  //Определение центра по X
        int centerY = (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2); //Определение центра по Y

        setTitle("Сетевой чат на Java"); //Заголовок
        setLocation (centerX -  sizeX/2, centerY-sizeY/2); //Располагаем окно по центру экрана
        setSize(new Dimension(sizeX, sizeY));
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        TextPanel textPanel = new TextPanel();                        //Создаем экземпляр текстовой панели
        SendPanel sendPanel = new SendPanel(textPanel.getTextArea()); //Создаем экземпляр панели набора сообщения

        add(textPanel, BorderLayout.CENTER);
        add(sendPanel, BorderLayout.SOUTH);

        setVisible(true);





    }

}
