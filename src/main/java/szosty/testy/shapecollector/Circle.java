package szosty.testy.shapecollector;

public class Circle implements Shape {

    private double promien;

    public Circle(double promien) {
        this.promien = promien;
    }

    @Override
    public String name() {
        return "I'm CIRCLE";
    }

    @Override
    public double field() {
        return 3.14 * promien * promien;
    }
}
