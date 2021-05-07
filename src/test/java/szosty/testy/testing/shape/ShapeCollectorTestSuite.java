package szosty.testy.testing.shape;

import org.junit.Assert;
import org.junit.Test;
import szosty.testy.shapecollector.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddShapeToList() {
        //given
        ArrayList<Shape> listaKsztaltow = new ArrayList<>();
        ShapeCollector shapeCollector = new ShapeCollector(listaKsztaltow);
        Shape shape1 = new Triangle(12, 5);
        //when
        shapeCollector.addShapeToList(shape1);
        //then
        Assert.assertEquals(1, listaKsztaltow.size());
    }

    @Test
    public void testDeleteShapeFromList(){
        //given
        ArrayList<Shape> lista = new ArrayList<>();
        lista.add(new Circle(10));
        lista.add(new Circle(23));
        lista.add(new Square(100));
        ShapeCollector shapeCollector = new ShapeCollector(lista);
        //when
        shapeCollector.deleteShapeFromList(lista.get(1));
        //then
        Assert.assertEquals(2, lista.size());
    }

    @Test
    public void testFindShape() {
        //given
        ArrayList<Shape> lista = new ArrayList<>();
        lista.add(new Circle(10));
        lista.add(new Circle(23));
        Shape square = new Square(100);
        lista.add(square);
        ShapeCollector shapeCollector = new ShapeCollector(lista);
        //when
        Shape findOne = shapeCollector.findShape(2);
        //then
        Assert.assertEquals(square, findOne);
    }

    @Test
    public void testShowFigures() {
        //given
        ArrayList<Shape> lista = new ArrayList<>();
        lista.add(new Square(22));
        lista.add(new Square(12));
        lista.add(new Triangle(22, 5));
        ShapeCollector shapeCollector = new ShapeCollector(lista);
        //when
        ArrayList<Shape> result = shapeCollector.showFigures();
        //then
        Assert.assertEquals(3, result.size());
    }
}
