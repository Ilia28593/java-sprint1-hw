import java.util.HashMap;
import java.util.Objects;

public class Dto {
    private final MonthEnum month;
    private final HashMap<Integer, Integer> stepsByDay;

    public Dto(MonthEnum month, Integer day, Integer steps) {
        this.month = month;
        HashMap<Integer,Integer> putMap = new HashMap<>();
        putMap.put(day,steps);
        this.stepsByDay = putMap;
    }

    public void setDayAndRecordSteps(Integer day, Integer steps){
        Integer stepInDay = stepsByDay.get(day);
        if(Objects.nonNull(stepInDay)){
            stepsByDay.put(day,stepInDay+steps);
        } else {
            stepsByDay.put(day,steps);
        }
    }

    public HashMap<Integer, Integer> getStepsByDay() {
        return stepsByDay;
    }

    public MonthEnum getMonth() {
        return month;
    }
}
