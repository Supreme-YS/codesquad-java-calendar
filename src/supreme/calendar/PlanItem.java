package supreme.calendar;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PlanItem {
    public Date planDate;
    public String detail;
    public String people = "";

    public static Date getDateFromString(String strDate) {
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    // 생성자
    public PlanItem(String date, String detail) {
        this.planDate = getDateFromString(date);
        this.detail = detail;
    }

    public Date getDate() {
        return planDate;
    }

    public void addPeople(String name) {
        people += name + ",";
    }
}
