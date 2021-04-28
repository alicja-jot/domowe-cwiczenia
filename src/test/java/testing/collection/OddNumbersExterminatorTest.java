package testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class OddNumbersExterminatorTest {

    @Before
    public void before() {
        System.out.println("WYkonuję test.");
    }

    @After
    public void after() {
        System.out.println("Zakonczylem test.");
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //given
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(28);
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(1);
        list.add(27);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //when
        ArrayList<Integer> oddNumbers = oddNumbersExterminator.exterminate(list);
        //then
        Assert.assertEquals(3, oddNumbers.size());
    }


    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();
        //when
        ArrayList<Integer> emptyResult = oddNumbersExterminator.exterminate(emptyList);
        //then
        Assert.assertEquals(0, emptyResult.size());
    }
}