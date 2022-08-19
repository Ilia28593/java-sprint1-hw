import java.util.HashMap;
import java.util.Map;

public class BaseSteps {
    public static Map<Integer, WorkingInfo> stat = new HashMap<>();

    static {
        stat.put(1,new WorkingInfo(MonthEnum.JANUARY, 0, 0));
        stat.put(2,new WorkingInfo(MonthEnum.FEBRUARY, 0, 0));
        stat.put(3,new WorkingInfo(MonthEnum.MARCH, 0, 0));
        stat.put(4,new WorkingInfo(MonthEnum.APRIL, 0, 0));
        stat.put(5,new WorkingInfo(MonthEnum.MAY, 0, 0));
        stat.put(6,new WorkingInfo(MonthEnum.JUNE, 0, 0));
        stat.put(7,new WorkingInfo(MonthEnum.JULY, 0, 0));
        stat.put(8,new WorkingInfo(MonthEnum.AUGUST, 0, 0));
        stat.put(9,new WorkingInfo(MonthEnum.SEPTEMBER, 0, 0));
        stat.put(10,new WorkingInfo(MonthEnum.OCTOBER, 0, 0));
        stat.put(11,new WorkingInfo(MonthEnum.NOVEMBER, 0, 0));
        stat.put(12,new WorkingInfo(MonthEnum.DECEMBER, 0, 0));
    }

    public static Map<Integer, WorkingInfo> getStat() {
        return stat;
    }

    public static void setStat(Integer month, Integer day, Integer steps) {
        WorkingInfo workingInfo = getStat().get(month);
        workingInfo.setDayAndRecordSteps(day, steps);
    }
}

