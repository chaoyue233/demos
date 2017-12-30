package chaoyue.thinkingInJava.study.chapter8.polyConstructors;

public class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + r);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(),radius = " + radius);
    }


}
