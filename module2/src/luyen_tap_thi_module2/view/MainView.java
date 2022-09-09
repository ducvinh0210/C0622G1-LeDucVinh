package luyen_tap_thi_module2.view;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import luyen_tap_thi_module2.controller.MainController;

import java.io.IOException;

public class MainView {
    public static void main(String[] args) throws IOException {
        MainController mainController= new MainController();
        mainController.displayMenu();
    }
}
