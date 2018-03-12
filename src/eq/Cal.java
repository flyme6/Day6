package eq;

public class Cal {
    /**
     * 画出万年历
     * @param year
     * @param month
     */
    static void print(int year, int month){
        System.out.printf("\n%4d年%2d月\n",year,month);
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\t");

        int weekday = getWeekday(year,month,1);
        for (int i = 1; i <= weekday; i++) {
            System.out.print("\t");
        }

        int Lastday = getDay(year,month);
        for (int i = 1; i <= Lastday; i++) {
            System.out.printf("%2d\t",i);
            if (getWeekday(year,month,i)  == 6){
                System.out.println();
            }
        }
    }

    static void print(int year){
        for (int i = 1; i <= 12; i++) {
            print(year,i);
        }
    }

//    根据月份获取月数
    private static int getDay(int year, int month) {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return IsLeap(year)? 29:28;
        }
        return 0;
    }
//    根据年，获取年数
    private static int getDay(int year) {
        return IsLeap(year)?366:365;
    }
//     判断是否闰年
    private static boolean IsLeap(int year) {
        if(year % 4 == 0 && year % 100 !=0 || year % 400 ==0){
            return true;
        }
        return false;
    }
//    根据年，月，日。获取周几
    private static int getWeekday(int year, int month, int day) {
        int days = 0;
        for (int i = 1; i < year; i++) {
            days += getDay(i);
        }
        for (int i = 1; i < month; i++) {
            days += getDay(year, i);
        }
        days += day -1;
        return (days + 1 ) % 7;
    }

    public static void main(String[] args) {
        System.out.println(IsLeap(2018));
        System.out.println(getDay(2018));
        System.out.println(getDay(2018,2));
        System.out.println(getWeekday(2018,3,8));
        print(2018,3);
        print(2018);
    }

}
