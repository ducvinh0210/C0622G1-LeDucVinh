package quan_ly_nhan_su.view;

import quan_ly_nhan_su.controller.MainController;

import java.io.IOException;

public class MainView {
    public static void main(String[] args) throws IOException {
        MainController mainController= new MainController();
        mainController.menuDisplay();
    }
}
