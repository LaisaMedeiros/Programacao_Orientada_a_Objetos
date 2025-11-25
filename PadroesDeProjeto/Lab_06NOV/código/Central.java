import java.util.*;

public class Central {
    private static Central instance;
    private List<Robot>[] groups;
    private int groupCount;
    
    @SuppressWarnings("unchecked")
    private Central(){
        groups = (List<Robot>[]) new List[10];
        for (int i = 0; i < groups.length; i++) {
            groups[i] = new ArrayList<Robot>();
        }
        groupCount = 0;
    }
    
    public static Central getInstance() {
        if (instance == null) {
            instance = new Central();
        }
        return instance;
    }
    
    public void createGroup(){
        if (groupCount < groups.length) {
            groupCount++;
        }
    }
    
    public void addDrone(int group, Robot ro1){
        if (group >= 1 && group <= groupCount) {
            removeDrone(ro1);
            groups[group-1].add(ro1);
        }
    }
    
    public void removeDrone(Robot ro1) {
        for (int i = 0; i < groupCount; i++) {
            groups[i].remove(ro1);
        }
    }
    
    public void command(int group, int line, int column){
        if (group >= 1 && group <= groupCount && groups[group-1] != null) {
            for (Robot robot : groups[group-1]) {
                robot.setTarget(line, column);
                robot.setMoving(true); // Habilita movimento
            }
        }
    }
    
    public void command(int group, Move mov){
        if (group >= 1 && group <= groupCount && groups[group-1] != null) {
            for (Robot robot : groups[group-1]) {
                if (mov == Move.STOP) {
                    robot.setMoving(false); // Apenas desabilita movimento
                }
            }
        }
    }
}