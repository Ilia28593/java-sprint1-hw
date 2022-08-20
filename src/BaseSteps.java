import java.util.HashMap;
import java.util.Map;

public class BaseSteps {
    public static Map<Integer, workingInfo> stat = new HashMap<>();

    static {
        stat.put(1,new workingInfo(MonthEnum.JANUARY, 0, 0));
        stat.put(2,new workingInfo(MonthEnum.FEBRUARY, 0, 0));
        stat.put(3,new workingInfo(MonthEnum.MARCH, 0, 0));
        stat.put(4,new workingInfo(MonthEnum.APRIL, 0, 0));
        stat.put(5,new workingInfo(MonthEnum.MAY, 0, 0));
        stat.put(6,new workingInfo(MonthEnum.JUNE, 0, 0));
        stat.put(7,new workingInfo(MonthEnum.JULY, 0, 0));
        stat.put(8,new workingInfo(MonthEnum.AUGUST, 0, 0));
        stat.put(9,new workingInfo(MonthEnum.SEPTEMBER, 0, 0));
        stat.put(10,new workingInfo(MonthEnum.OCTOBER, 0, 0));
        stat.put(11,new workingInfo(MonthEnum.NOVEMBER, 0, 0));
        stat.put(12,new workingInfo(MonthEnum.DECEMBER, 0, 0));
    }

    public static Map<Integer, workingInfo> getStat() {
        return stat;
    }

    public static void setStat(Integer month, Integer day, Integer steps) {
        workingInfo workingInfo = getStat().get(month);
        workingInfo.seеStepByDay(day, steps);
    }
}

