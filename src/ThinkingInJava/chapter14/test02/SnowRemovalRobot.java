package ThinkingInJava.chapter14.test02;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-1-27
 * Time: 下午1:39
 * To change this template use File | Settings | File Templates.
 */
public class SnowRemovalRobot implements Robot {
    private String name;

    public SnowRemovalRobot(String name) {
        this.name = name;
    }

    public String name(){return name;}
    public String model(){return "SnowBot Service 11";}
    public List<Operation> operations(){
        return Arrays.asList(
                new Operation(){
                    public String description(){
                        return name +" can shovel snow";
                    }
                    public void command(){
                        System.out.println(name + " shoveling snow");
                    }
                },
                new Operation(){
                    public String description(){
                        return name +" can chip ice";
                    }
                    public void command(){
                        System.out.println(name + " chipping ice");
                    }
                },
                new Operation(){
                    public String description(){
                        return name +" can clear the roof";
                    }
                    public void command(){
                        System.out.println(name + " clearing roof");
                    }
                }
        );
    }

    public static void main(String[] args) {
        Robot.Test.Test(new SnowRemovalRobot("Slusher"));
    }
}
