import org.example.Carrito;
import org.example.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarritoTest {
    @Test
    void testAgregarProducto() {
        Carrito carrito = new Carrito();
        Producto producto = new Producto("Pan", 2.5);
        carrito.agregarProducto(producto, 2);
        assertEquals(1, carrito.getItems().size());
        assertEquals(2, carrito.getItems().get(0).getCantidad());
    }

    @Test
    void testAgregarProductoExistenteSumaCantidad() {
        Carrito carrito = new Carrito();
        Producto producto = new Producto("Pan", 2.5);
        carrito.agregarProducto(producto, 2);
        carrito.agregarProducto(producto, 3);
        assertEquals(1, carrito.getItems().size());
        assertEquals(5, carrito.getItems().get(0).getCantidad());
    }

    @Test
    void testEliminarProducto() {
        Carrito carrito = new Carrito();
        Producto producto = new Producto("Leche", 1.0);
        carrito.agregarProducto(producto, 1);
        carrito.eliminarProducto(producto);
        assertEquals(0, carrito.getItems().size());
    }

    @Test
    void testModificarCantidad() {
        Carrito carrito = new Carrito();
        Producto producto = new Producto("Queso", 3.0);
        carrito.agregarProducto(producto, 2);
        carrito.modificarCantidad(producto, 5);
        assertEquals(5, carrito.getItems().get(0).getCantidad());
    }

    @Test
    void testModificarCantidadACeroElimina() {
        Carrito carrito = new Carrito();
        Producto producto = new Producto("Jamon", 5.0);
        carrito.agregarProducto(producto, 2);
        carrito.modificarCantidad(producto, 0);
        assertEquals(0, carrito.getItems().size());
    }

    @Test
    void testCalcularTotal() {
        Carrito carrito = new Carrito();
        carrito.agregarProducto(new Producto("Pan", 2.5), 2);
        carrito.agregarProducto(new Producto("Leche", 1.0), 3);
        assertEquals(2*2.5 + 3*1.0, carrito.calcularTotal());
    }
} 