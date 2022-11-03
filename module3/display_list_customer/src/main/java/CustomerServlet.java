import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet",urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    private static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer("Mai Văn Hoàng", "1983-08-20", "Hà Nội","http://hoahongmakeup.com/wp-content/uploads/2018/06/trang-diem-chup-anh-chan-dung.jpg"));
        customerList.add(new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang","https://studios.vn/wp-content/uploads/2017/05/bi-quyet-chup-anh-chan-dung-ngoai-troi-cho-nhiep-anh-gia-7.jpg"));
        customerList.add(new Customer("Nguyễn Thái Hòa", "1983-08-22", "Nam Định","https://achaumedia.vn/wp-content/uploads/2020/03/b31c6330591453953a95d6329a47e7a6.jpg"));
        customerList.add(new Customer("Trần Đăng Khoa", "1983-08-17", "Hà Tây","https://teddystudio.vn/wp-content/uploads/2020/05/neu-thac-mac-cam-may-anh-chup-gai-khong-dep-bang-thang-xai-dien-thoai-thi-hay-doc-ngay-bai-nay-01.jpg"));
        customerList.add(new Customer("Nguyễn Đình Thi", "1983-08-19", "Hà Nội","http://hoahongmakeup.com/wp-content/uploads/2018/06/trang-diem-chup-anh-chan-dung-1.jpg"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }
}
