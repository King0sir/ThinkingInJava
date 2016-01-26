package ThinkingInJava.chapter8.test01;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-1
 * Time: 下午7:29
 * To change this template use File | Settings | File Templates.
 */
class Characteristic{
    private String s;
    Characteristic(String s){
        this.s=s;
        System.out.println("Create Characteristic "+s);
    }
    protected void dispose(){
        System.out.println("disposing Characteristic    "+s);
    }
}

class Description{
     private String s;
    Description(String s){
        this.s=s;
        System.out.println("Createing Descritpion   "+s);
    }
    protected void dispose(){
        System.out.println("disposing Descritpion   "+s);
    }
        }
class LivingCreature{
    private Characteristic p = new Characteristic("is alive");
    private Description t = new Description("Basic Living Creature");
    LivingCreature(){
        System.out.println("LivingCreature()");
    }
    protected void dispose(){
        System.out.println("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}
class Animal extends LivingCreature{
    private Characteristic p = new Characteristic("has heart");
    private Description t = new Description("Animal not Vegetable");
    Animal(){System.out.println("Animal()");}
    protected void dispose(){
        System.out.println("Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
class Amphibian extends Animal{
    private Characteristic p = new Characteristic("can live in water");
    private Description t = new Description("Both water and land");
    Amphibian(){System.out.println("Amphibian()");}
    protected void dispose(){
        System.out.println("Amphibian dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

public class Forg extends Amphibian{
    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eat bugs");
    public Forg(){System.out.println("forg()");}
    protected void dispose(){
        System.out.println("Forg dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
    public static void main(String[] args  ){
        Forg f=new Forg();
        System.out.println("bye");
        f.dispose();
    }
}
