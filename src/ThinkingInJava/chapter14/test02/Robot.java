package ThinkingInJava.chapter14.test02;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-1-27
 * Time: 下午1:35
 * To change this template use File | Settings | File Templates.
 */
public interface Robot {
    String name();
    String model();
    List<Operation> operations();
    class Test{
        public static void Test(Robot robot){
            if(robot instanceof Null){
                System.out.println("Null Robot");
            }
            System.out.println("Robot Name: "+robot.name());
            System.out.println("Robot Model: "+ robot.model());
            for(Operation operation : robot.operations()){
                System.out.println(operation.description());
                operation.command();
            }
        }
    }
}
