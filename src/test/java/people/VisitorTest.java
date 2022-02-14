package people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        visitor1 = new Visitor(14, 120, 40.0);
        visitor2 = new Visitor(20,154,60.0);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor1.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(154, visitor2.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor1.getMoney(), 0.1);
    }

    @Test
    public void canCheckAgeAboveFifteen(){ assertEquals(false, visitor1.checkAgeIfFifteen(visitor1));}

    @Test
    public void canCheckAgeAboveEighteen(){ assertEquals(true,visitor2.checkAgeIfEighteen(visitor2));}

    @Test
    public void canCheckAgeAboveTwelve(){assertEquals(true, visitor1.checkAgeIfTwelve(visitor1));}

    @Test
    public void canCheckHeight(){assertEquals(true,visitor2.checkHeightOfVisitor(visitor2));}

}
