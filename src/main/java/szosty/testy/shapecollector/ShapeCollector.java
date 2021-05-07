package szosty.testy.shapecollector;

import szosty.testy.shapecollector.Shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> kolekcjaFigur;

    public ShapeCollector(ArrayList<Shape> kolekcjaFigur) {
        this.kolekcjaFigur = kolekcjaFigur;
    }

    public void addShapeToList (Shape shape) {
        kolekcjaFigur.add(shape);
        System.out.println("Dodalem ksztalt do kolekcji - " + shape.name());
    }

    public void deleteShapeFromList (Shape shape) {
        kolekcjaFigur.remove(shape);
        System.out.println("Usunalem ksztalt z kolekcji - " + shape.name());
    }

    public Shape findShape (int index) {
            return kolekcjaFigur.get(index);
    }

    public ArrayList<Shape> showFigures() {
        System.out.println("Ilosc figur w kolekcji: " + kolekcjaFigur.size());
        return kolekcjaFigur;
    }

}
