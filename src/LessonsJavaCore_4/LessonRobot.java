package LessonsJavaCore_4;


public class LessonRobot {
//    String speakWork = "Я Robot – я просто працюю";
    public String toString(){
        String speakWork = "Я Robot – я просто працюю";
        return speakWork;
    }
    public void work(){
        System.out.println ( toString() );
    }
}
class CoffeRobot extends LessonRobot {
    @Override
    public String toString ( ) {
        String speakWork = "Я CoffeRobot – я варю каву";
        return speakWork;
    }
        @Override
    public void work() {
        System.out.println ( toString () );

    }
}
class RobotDancer extends LessonRobot {
    @Override
    public String toString ( ) {
        String speakWork = "Я RobotDancer – я просто танцюю";
        return speakWork;
    }
        @Override
    public void work() {
        System.out.println ( toString ());
    }
}
class RobotCoocker extends LessonRobot {
    @Override
    public String toString ( ) {
        String speakWork = "Я RobotCoocker – я просто готую";
        return speakWork;
    }
        @Override
    public void work() {
        System.out.println ( toString ());
    }
}
