package szosty.testy.shapecollector;

public class Square implements Shape {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public String name() {
        return "I'm SQUARE";
    }

    @Override
    public double field() {
        double field = length * length;
        System.out.println("Moje pole wynosi: " + field);
        return field;
    }
}
