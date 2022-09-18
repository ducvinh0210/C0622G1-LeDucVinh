package quan_ly_hoc_sinh.view;

import quan_ly_hoc_sinh.controller.MainController;

import java.io.IOException;

public class ViewMain {
    public static void main(String[] args) throws IOException {
        MainController mainController = new MainController();
        mainController.menuDisplay();

    }
}



