import javax.swing.*;

import java.awt.event.*;

/*
 * Класс главного окна
 * */
public class MainFrame extends JFrame {
    //Кнопка
    private JButton button1;
    //Второе окно
    private Dialog dialog;
    //Конструктор главного окна
    public MainFrame() {
        //Устанавливаем размеры главного окна
        setSize(400, 500);
        //Создаем объект панели, на котором будет отображаться кнопка
        JPanel panel = new JPanel();
        //Добавляем BoxLayout
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        //Создаем кнопку
        button1 = new JButton("show dialog");
        //Устанавливаем размеры кнопки
        button1.setSize(100, 50);
        //Выравниваем по центру по оси X
        button1.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        //Создаем диалог
        dialog = new Dialog();
        //Обрабатываем событие при нажатии на кнопку
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // Делаем видимым второе окно
                dialog.setVisible(true);
            }

        });
        //Добавляем кнопку на панель
        panel.add(button1);
        //Дабавляем панель на главное окно
        add(panel);
        //Делаем окно по центру
        setLocationRelativeTo(null);
        //Делаем видимым главное окно
        setVisible(true);

    }

    public static void main(String[] args)
    {
        //Запускаем главное окно
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();
            }
        });
    }
}