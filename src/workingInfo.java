import java.util.HashMap;
import java.util.Objects;

public class workingInfo {
    private final MonthEnum month;
    private final HashMap<Integer, Integer> stepsByDay;

    public workingInfo(MonthEnum month, Integer day, Integer steps) {
        this.month = month;
        HashMap<Integer,Integer> putMap = new HashMap<>();
        for (int i = 0; i < 31; i++) {
            putMap.put(i,0);
        }
        putMap.put(day,steps);
        this.stepsByDay = putMap;
    }

    public void seеStepByDay(Integer day, Integer steps){
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

}
