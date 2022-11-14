import org.example.StringDrink;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringDrink_test {
    @Test
    public void stringDrink() {
        StringDrink drink = new StringDrink("ABCD");
        assertEquals("ABCD", drink.getText());
        drink.setText("DCBA");
        assertEquals("DCBA", drink.getText());
    }
}
