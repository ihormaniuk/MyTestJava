package LessonsJavaCore_4;

import static PrintAndScanner.Print.print;

public class LessonRobotMain {
    public static void fs (LessonRobot l){
        l.work();
    }
    public static void f(LessonRobot[] r){
        for(LessonRobot l : r){
            fs(l);
        }
    }

    public static void main(String[] args){
        LessonRobot[] lessonRobot1 = {
                new LessonRobot (),
                new CoffeRobot(),
                new RobotDancer (),
                new RobotCoocker ()
        };
        f(lessonRobot1);

        int id = 0;

        LessonRobot robot = new LessonRobot ();
        robot.work ();
        CoffeRobot coffeRobot = new CoffeRobot ();
        coffeRobot.work ();
        RobotDancer robotDancer = new RobotDancer ();
        robotDancer.work ();
        RobotCoocker robotCoocker = new RobotCoocker ();
        robotCoocker.work ();

        System.out.println ( "-----------------------------------------" );
        System.out.println ( " Це масив Класу - Robot і його нащадків " );
        System.out.println ( "-----------------------------------------" );
        System.out.println ( "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓" );
        System.out.println ();

        LessonRobot[] robots = {robot,coffeRobot,robotDancer,robotCoocker};
        for ( LessonRobot lessonRobot : robots ) {
            System.out.println ("ID : " + id++ + " " + lessonRobot );
        }
    }
}