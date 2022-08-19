import java.util.HashMap;
import java.util.Map;

public class Data {
    public static Map<Integer,Dto> stat = new HashMap<>();

    static {
        stat.put(1,new Dto(MonthEnum.JANUARY, 0, 0));
        stat.put(2,new Dto(MonthEnum.FEBRUARY, 0, 0));
        stat.put(3,new Dto(MonthEnum.MARCH, 0, 0));
        stat.put(4,new Dto(MonthEnum.APRIL, 0, 0));
        stat.put(5,new Dto(MonthEnum.MAY, 0, 0));
        stat.put(6,new Dto(MonthEnum.JUNE, 0, 0));
        stat.put(7,new Dto(MonthEnum.JULY, 0, 0));
        stat.put(8,new Dto(MonthEnum.AUGUST, 0, 0));
        stat.put(9,new Dto(MonthEnum.SEPTEMBER, 0, 0));
        stat.put(10,new Dto(MonthEnum.OCTOBER, 0, 0));
        stat.put(11,new Dto(MonthEnum.NOVEMBER, 0, 0));
        stat.put(12,new Dto(MonthEnum.DECEMBER, 0, 0));
    }

    public static Map<Integer, Dto> getStat() {
        return stat;
    }

    public static void setStat(Integer month, Integer day, Integer steps) {
        Dto dto = getStat().get(month);
        dto.setDayAndRecordSteps(day, steps);
    }
}

