package principle.demeter;

/**
 * Created by geely 迪米特原则
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);

    }
}
