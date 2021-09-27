package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void removeArray()
    {
        App appTest = new App();
        String[] array = {"Mateo Gamero", "John Johnny", "Jen June", "Patrick Star", "Spongebob Square"};
        String[] newArray = new String[4];
        String[] removedIndex1Array = {"John Johnny", "Jen June", "Patrick Star", "Spongebob Square"};
        String[] removedIndex2Array = {"Mateo Gamero", "Jen June", "Patrick Star", "Spongebob Square"};
        String[] removedIndex3Array ={"Mateo Gamero", "John Johnny", "Patrick Star", "Spongebob Square"};
        String[] removedIndex4Array ={"Mateo Gamero", "John Johnny", "Jen June", "Spongebob Square"};
        String[] removedIndex5Array ={"Mateo Gamero", "John Johnny", "Jen June", "Patrick Star"};
            assertAll(() -> assertArrayEquals(removedIndex1Array, appTest.removeArray(array, newArray, array.length, 0)),
                    () -> assertArrayEquals(removedIndex2Array, appTest.removeArray(array, newArray, array.length, 1)),
                    () -> assertArrayEquals(removedIndex3Array, appTest.removeArray(array, newArray, array.length, 2)),
                    () -> assertArrayEquals(removedIndex4Array, appTest.removeArray(array, newArray, array.length, 3)),
                    () -> assertArrayEquals(removedIndex5Array, appTest.removeArray(array, newArray, array.length, 4)));
    }
}