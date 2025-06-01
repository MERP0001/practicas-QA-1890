package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Carrito {
    private List<ItemCarrito> items = new ArrayList<>();

    public void agregarProducto(Producto producto, int cantidad) {
        for (ItemCarrito item : items) {
            if (item.getProducto().equals(producto)) {
                item.setCantidad(item.getCantidad() + cantidad);
                return;
            }
        }
        items.add(new ItemCarrito(producto, cantidad));
    }

    public void eliminarProducto(Producto producto) {
        Iterator<ItemCarrito> iterator = items.iterator();
        while (iterator.hasNext()) {
            ItemCarrito item = iterator.next();
            if (item.getProducto().equals(producto)) {
                iterator.remove();
                return;
            }
        }
    }

    public void modificarCantidad(Producto producto, int nuevaCantidad) {
        for (ItemCarrito item : items) {
            if (item.getProducto().equals(producto)) {
                if (nuevaCantidad <= 0) {
                    eliminarProducto(producto);
                } else {
                    item.setCantidad(nuevaCantidad);
                }
                return;
            }
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.getProducto().getPrecio() * item.getCantidad();
        }
        return total;
    }

    public List<ItemCarrito> getItems() {
        return items;
    }
} 