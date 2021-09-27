package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    ArrayList<Double> arrayList = new ArrayList<Double>();
    App appTest = new App();
    @Test
    void average()
    {
        arrayList.add(1.0);
        arrayList.add(131.0);
        arrayList.add(117.0);
        arrayList.add(154.0);
        arrayList.add(5334.0);
        arrayList.add(14.0);
        assertEquals(958.5, appTest.average(arrayList));
        assertNotEquals(958.3, appTest.average(arrayList));
    }

    @Test
    void max()
    {
        arrayList.add(1.0);
        arrayList.add(131.0);
        arrayList.add(117.0);
        arrayList.add(154.0);
        arrayList.add(5334.0);
        arrayList.add(14.0);
        assertEquals(5334.0, appTest.max(arrayList));
        assertNotEquals(5334.1, appTest.max(arrayList));
    }

    @Test
    void min()
    {
        arrayList.add(1.0);
        arrayList.add(131.0);
        arrayList.add(117.0);
        arrayList.add(154.0);
        arrayList.add(5334.0);
        arrayList.add(14.0);
        assertEquals(1.0, appTest.min(arrayList));
        assertNotEquals(1.1, appTest.min(arrayList));
    }

    @Test
    void std()
    {
        arrayList.add(1.0);
        arrayList.add(131.0);
        arrayList.add(117.0);
        arrayList.add(154.0);
        arrayList.add(5334.0);
        arrayList.add(14.0);
        assertEquals(1957.63, appTest.std(arrayList));
        assertNotEquals(1957.64, appTest.std(arrayList));
    }
}