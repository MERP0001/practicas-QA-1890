import org.example.ItemCarrito;
import org.example.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemCarritoTest {
    @Test
    void testConstructorAndGetters() {
        Producto producto = new Producto("Pan", 2.5);
        ItemCarrito item = new ItemCarrito(producto, 3);
        assertEquals(producto, item.getProducto());
        assertEquals(3, item.getCantidad());
    }

    @Test
    void testSetters() {
        Producto producto1 = new Producto("Leche", 1.0);
        Producto producto2 = new Producto("Queso", 3.0);
        ItemCarrito item = new ItemCarrito(producto1, 2);
        item.setProducto(producto2);
        item.setCantidad(5);
        assertEquals(producto2, item.getProducto());
        assertEquals(5, item.getCantidad());
    }

    @Test
    void testToString() {
        Producto producto = new Producto("Huevos", 4.0);
        ItemCarrito item = new ItemCarrito(producto, 1);
        String str = item.toString();
        assertTrue(str.contains("Huevos"));
        assertTrue(str.contains("1"));
    }
} 