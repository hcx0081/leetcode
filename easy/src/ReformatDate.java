import java.util.HashMap;

/**
 * {@code @Description:} 1507.转变日期格式
 */
public class ReformatDate {
    public static void main(String[] args) {
        System.out.println(reformatDate("6th Jun 1933"));
    }

    public static String reformatDate(String date) {
        String day;
        if (date.charAt(3) != ' ') {
            day = date.substring(0, 2);
        } else {
            day = date.substring(0, 1);
            day = "0" + day;
        }

        HashMap<String, String> monthMap = initMonthMap();
        String month = monthMap.get(date.substring(date.indexOf(" ") + 1, date.indexOf(" ") + 4));


        String year = date.substring(date.lastIndexOf(" ") + 1, date.lastIndexOf(" ") + 5);
        return year + "-" + month + "-" + day;
    }

    public static HashMap<String, String> initMonthMap() {
        HashMap<String, String> monthMap = new HashMap<>();
        monthMap.put("Jan", "01");
        monthMap.put("Feb", "02");
        monthMap.put("Mar", "03");
        monthMap.put("Apr", "04");
        monthMap.put("May", "05");
        monthMap.put("Jun", "06");
        monthMap.put("Jul", "07");
        monthMap.put("Aug", "08");
        monthMap.put("Sep", "09");
        monthMap.put("Oct", "10");
        monthMap.put("Nov", "11");
        monthMap.put("Dec", "12");
        return monthMap;
    }
}
