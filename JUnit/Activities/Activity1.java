
import java.util.ArrayList;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {

    static ArrayList<String> list1;

    @BeforeEach
    void setUp() throws Exception {
        list1 = new ArrayList<String>();
        list1.add("Naruto"); 
        list1.add("Luffy");
    }

    @Test
    public void insertTest() {

        assertEquals(2, list1.size(), "Wrong size");
        list1.add(2, "Saitama");
        assertEquals(3, list1.size(), "Wrong size");


        assertEquals("Naruto", list1.get(0), "Wrong element");
        assertEquals("Luffy", list1.get(1), "Wrong element");
        assertEquals("Saitama", list1.get(2), "Wrong element");
    }

    @Test
    public void replaceTest() {

        list1.set(1, "Saitama");


        assertEquals(2, list1.size(), "Wrong size");

        assertEquals("Naruto", list1.get(0), "Wrong element");
        assertEquals("Saitama", list1.get(1), "Wrong element");
    }
}