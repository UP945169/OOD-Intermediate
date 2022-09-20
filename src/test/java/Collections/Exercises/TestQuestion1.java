package Collections.Exercises;

import com.fdmgroup.Collections.Exercises.CollectionsExercise;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestQuestion1 {

    CollectionsExercise exercise;


    @BeforeEach
    void setUp(){
        exercise = new CollectionsExercise();
    }

    @Test
    void test_Exercise1() {
        Set<String> UniqueName = exercise.getUniqueNames("John","Jane","John");
        assertEquals(2,UniqueName.size());
        assertTrue(UniqueName.contains("John"));
        assertTrue(UniqueName.contains("Jane"));
    }

    @Test
    void test_exercise2() {
        Map<String, Color> coloursInMap = exercise.selectUniqueColors();
        assertEquals(Color.blue, coloursInMap.get("blue"));
    }

    @Test
    void test_exercise3(){
        Map<Character, Integer> letterCount = exercise.getLetterCount("hello world");
        assertEquals(7, letterCount.keySet().size());
        assertEquals( 1, letterCount.get('h'));
        assertEquals( 1, letterCount.get('e'));
        assertEquals( 3, letterCount.get('l'));
        assertEquals( 2, letterCount.get('o'));
        assertEquals( 1, letterCount.get('w'));
        assertEquals( 1, letterCount.get('r'));
        assertEquals( 1, letterCount.get('d'));
    }

    @Test
    void test_exercise4(){
        int duplicateWords = exercise.countDuplicates("word word word this is a word");
        assertEquals(1,duplicateWords);
    }
}
