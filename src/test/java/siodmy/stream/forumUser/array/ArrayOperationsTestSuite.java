package siodmy.stream.forumUser.array;

import org.junit.Assert;
import org.junit.Test;
import siodmy.stream.array.ArrayOperations;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //given
        int[] tablicaOcen = new int[6];
        tablicaOcen[0] = 1;
        tablicaOcen[1] = 1;
        tablicaOcen[2] = 5;
        tablicaOcen[3] = 5;
        tablicaOcen[4] = 5;
        tablicaOcen[5] = 5;

        //when
        double srednia = ArrayOperations.getAverage(tablicaOcen);
        System.out.println(srednia);
        //then
        Assert.assertEquals(3.6, srednia, 0.1);
    }

}
