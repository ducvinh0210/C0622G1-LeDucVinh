package furama_resort.utils.exception;

import java.time.LocalDate;
import java.time.Period;

public class CheckException {

    public static void checkDateOfBirth(LocalDate dateOfBirth) throws InfomationException {
        LocalDate today= LocalDate.now();
        boolean checkAge= Period.between(dateOfBirth,today).getYears()<18||
                Period.between(dateOfBirth,today).getYears()>100;
        if (checkAge){
            throw new InfomationException("ban nhap khong dung,độ tuổi từ 18-100");


        }


    }


}
