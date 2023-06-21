public class AbstractCalling {
    public static void main(String[] args) {
        AbstractDemo noExtend = new AbstractExtend1();
        noExtend.draw();
        noExtend.resize();

        AbstractExtend1 extend1 = new AbstractExtend1();
        extend1.draw();
        extend1.resize();
    }
}
