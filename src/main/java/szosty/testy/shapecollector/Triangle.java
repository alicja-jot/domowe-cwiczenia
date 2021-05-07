package szosty.testy.shapecollector;

public class Triangle implements Shape {
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String name() {
        return "I'm TRIANGLE";
    }

    @Override
    public double field() {
        double field = 0.5 * (a * h);
        return field;
    }
}
