package com.softtek.Abril18.servicio;

import com.softtek.Abril18.modelo.Producto;
import java.util.List;

public interface IProductoServicio {
    Producto obtenerProducto(int id);
    Producto crearProducto(Producto producto);
    void eliminarProducto(int id);
    Producto modificarProducto(Producto producto);
    List<Producto> obtenerTodosProductos();
}
