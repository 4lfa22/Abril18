package com.softtek.Abril18.repo;

import com.softtek.Abril18.modelo.Producto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductoRepo implements IProductoRepo {
    private List<Producto> productos;

    public ProductoRepo() {
        this.productos = new ArrayList<>();
    }

    @Override
    public Producto obtenerProducto(int id) {
        for (Producto producto : productos) {
            if (producto.getIdProducto() == id) {
                return producto;
            }
        }
        return null;
    }

    @Override
    public Producto crearProducto(Producto p) {
        p.setIdProducto(generarIdUnico());
        productos.add(p);
        return p;
    }

    @Override
    public void eliminarProducto(int id) {
        productos.removeIf(p -> p.getIdProducto() == id);
    }

    @Override
    public Producto modificarProducto(Producto p) {
        for (Producto producto : productos) {
            if (producto.getIdProducto() == p.getIdProducto()) {
                producto.setNombreProducto(p.getNombreProducto());
                producto.setPrecioUnitario(p.getPrecioUnitario());
                producto.setUnidadesStock(p.getUnidadesStock());
                return producto;
            }
        }
        return null;
    }

    @Override
    public List<Producto> obtenerTodosProductos() {
        return productos;
    }

    private int generarIdUnico() {
        return productos.size() + 1;
    }
}
