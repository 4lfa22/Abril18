package com.softtek.Abril18.repo;

import com.softtek.Abril18.modelo.Producto;
import java.util.List;

public interface IProductoRepo {
    Producto obtenerProducto();
    Producto crearProducto(Producto p);
    void eliminarProducto(int idProducto);
    Producto modificarProducto(Producto p);
    List<Producto> obtenerTodosProductos();
}
