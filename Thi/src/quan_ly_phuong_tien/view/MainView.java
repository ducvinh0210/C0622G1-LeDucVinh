package quan_ly_phuong_tien.view;

import quan_ly_phuong_tien.controller.MainController;

import java.io.IOException;

public class MainView {
    public static void main(String[] args) throws IOException {
        MainController mainController= new MainController();

        mainController.menuManagemnet();
    }

}
