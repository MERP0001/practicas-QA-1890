import org.example.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {
    @Test
    void testConstructorAndGetters() {
        Producto producto = new Producto("Pan", 2.5);
        assertEquals("Pan", producto.getNombre());
        assertEquals(2.5, producto.getPrecio());
    }

    @Test
    void testSetters() {
        Producto producto = new Producto("Leche", 1.0);
        producto.setNombre("Queso");
        producto.setPrecio(3.0);
        assertEquals("Queso", producto.getNombre());
        assertEquals(3.0, producto.getPrecio());
    }

    @Test
    void testEqualsAndHashCode() {
        Producto p1 = new Producto("Jamon", 5.0);
        Producto p2 = new Producto("Jamon", 5.0);
        Producto p3 = new Producto("Queso", 5.0);
        assertEquals(p1, p2);
        assertEquals(p1.hashCode(), p2.hashCode());
        assertNotEquals(p1, p3);
    }

    @Test
    void testToString() {
        Producto producto = new Producto("Huevos", 4.0);
        String str = producto.toString();
        assertTrue(str.contains("Huevos"));
        assertTrue(str.contains("4.0"));
    }
} 