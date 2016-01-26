package ThinkingInJava.chapter8.test01;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-1
 * Time: 下午8:42
 * To change this template use File | Settings | File Templates.
 */
class Glyph{
    void draw(){
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}
class RoundGlyph extends Glyph{
    private int radius =1;
    RoundGlyph(int r){
        radius=r;
        System.out.println("RoundGlyph.RoundGlyph(),radius="+radius);

    }
    void draw(){
        System.out.println("RoundGlyph.draw(), radius="+radius);
    }
}
public class PolyConstructors {
    public static void main(String[] args){
        new RoundGlyph(5);
    }
}
