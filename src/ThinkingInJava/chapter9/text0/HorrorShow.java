package ThinkingInJava.chapter9.text0;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-3
 * Time: 下午8:00
 * To change this template use File | Settings | File Templates.
 */
interface Monster{
    void menace();
}
interface DangerousMonster extends Monster{
    void destory();
}
interface Lethal{
    void kill();
}
class DragonZilla implements DangerousMonster{
    @Override
    public void menace() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void destory() {
    }
}
interface Vampire extends DangerousMonster,Lethal{
    void drinkBlood();
}
class VeryBadVampire implements Vampire{
    @Override
    public void menace() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void destory() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void drinkBlood() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void kill() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
public class HorrorShow {
    static void u(Monster b){b.menace();}
    static void  v(DangerousMonster b){b.menace();b.destory();}
    static void w(Lethal l){l.kill();}
    public static  void main(String[] args  ){
        DangerousMonster d = new DragonZilla();
        u(d);
        v(d);
        Vampire v = new VeryBadVampire();
        u(v);
        v(v);
        w(v);
    }
}
