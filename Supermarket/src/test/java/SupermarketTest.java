import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Julia Schleien
 * @version 1.0
 * @category Test
 * @since 05/06/2020 - 15:40
 */

class SupermarketTest {

    private Supermarket supermarket = new Supermarket();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        supermarket.setValue(30.0);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void addTenPercentToTheValue() {
        assertEquals(33, supermarket.addTenPercentToTheValue());

        supermarket.setValue(15);
        assertEquals(16.5, supermarket.addTenPercentToTheValue());

        supermarket.setValue(-10);
        assertEquals(0, supermarket.addTenPercentToTheValue());
    }
}