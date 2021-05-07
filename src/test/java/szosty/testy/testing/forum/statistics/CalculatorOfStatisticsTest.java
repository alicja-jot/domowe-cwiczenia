package szosty.testy.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Answers;

import java.util.ArrayList;

import  static org.mockito.Mockito.*;

public class CalculatorOfStatisticsTest {

    @Test
    public void testCalculateStatisticsForZeroPosts() {
        //given
        CalculatorOfStatistics calculatorOfStatistics = new CalculatorOfStatistics();
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(0);

        //when
        calculatorOfStatistics.calculateStatistics(statistics);
        String result = calculatorOfStatistics.showStatistics();
        System.out.println(result);
        //then
        Assert.assertEquals(0, calculatorOfStatistics.getNumberOfPosts(), 0.0);
    }

    @Test
    public void testCalculateStatisticsFor1000Posts() {
        //given
        CalculatorOfStatistics calculatorOfStatistics = new CalculatorOfStatistics();
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(1000);
        //when
        calculatorOfStatistics.calculateStatistics(statistics);
        //then
        Assert.assertEquals(1000, calculatorOfStatistics.getNumberOfPosts(), 0.0);
    }

    @Test
    public void testCalculateForZeroComments() {
        //given
        CalculatorOfStatistics calculatorOfStatistics = new CalculatorOfStatistics();
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(0);
        //when
        calculatorOfStatistics.calculateStatistics(statistics);
        //then
        Assert.assertEquals(0, calculatorOfStatistics.getNumberOfComments(), 0.0);
    }

    @Test
    public void testCalculateForLessCommentsThenPosts() {
        //given
        CalculatorOfStatistics calculatorOfStatistics = new CalculatorOfStatistics();
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(1);
        when(statistics.postsCount()).thenReturn(10);
        //when
        calculatorOfStatistics.calculateStatistics(statistics);
        //then
        Assert.assertTrue(calculatorOfStatistics.getNumberOfComments() < calculatorOfStatistics.getNumberOfPosts());
    }

    @Test
    public void testCalculateForMoreCommentsThenPosts() {
        //given
        CalculatorOfStatistics calculatorOfStatistics = new CalculatorOfStatistics();
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(1);
        //when
        calculatorOfStatistics.calculateStatistics(statistics);
        //then
        Assert.assertTrue(calculatorOfStatistics.getNumberOfComments() > calculatorOfStatistics.getNumberOfPosts());
    }

    @Test
    public void testCalculateForZeroUsers() {
        //given
        CalculatorOfStatistics calculatorOfStatistics = new CalculatorOfStatistics();
        Statistics statistics = mock(Statistics.class, Answers.RETURNS_DEEP_STUBS);
        ArrayList<String> listsOfUsers = new ArrayList<>();
        when(statistics.usersNames()).thenReturn(listsOfUsers);
        //when
        calculatorOfStatistics.calculateStatistics(statistics);
        //then
        Assert.assertEquals(0, calculatorOfStatistics.getNumberOfUsers(), 0.0);
    }

    @Test
    public void testCalculateFor100Users() {
        //given
        CalculatorOfStatistics calculatorOfStatistics = new CalculatorOfStatistics();
        Statistics statistics = mock(Statistics.class, Answers.RETURNS_DEEP_STUBS);
        ArrayList<String> listOfUsers = new ArrayList<>();

        for(int i=0; i<100; i++) {
            String name = "";
            listOfUsers.add(name);
        }

        when(statistics.usersNames()).thenReturn(listOfUsers);
        //when
        calculatorOfStatistics.calculateStatistics(statistics);
        //then
        Assert.assertEquals(100, calculatorOfStatistics.getNumberOfUsers(), 0.0);
    }
}