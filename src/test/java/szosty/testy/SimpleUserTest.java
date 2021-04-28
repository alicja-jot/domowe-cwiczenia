package szosty.testy;

import org.junit.*;

public class SimpleUserTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("We begin our tests: ");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("We ended our tests.");
    }

    @After
    public void before() {
        System.out.println("This test begin: ");
    }

    @Before
    public void after() {
        System.out.println("This test ended.");
    }

    @Test
    public void testGetNazwaUzytkownika() {
        //given
        SimpleUser simpleUser1 = new SimpleUser("Furby", "Pies");
        //when
        String result = simpleUser1.getUserName();
        System.out.println(result);
        //then
        Assert.assertEquals("Furby", result);
    }

    @Test
    public void testGetRealName() {
        //given
        SimpleUser simpleUser2 = new SimpleUser("Furby", "Pies");
        //when
        String realName = simpleUser2.getRealName();
        System.out.println(realName);
        //then
        Assert.assertEquals("Pies", realName);
    }
}