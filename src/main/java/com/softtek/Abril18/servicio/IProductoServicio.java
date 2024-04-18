package com.softtek.Abril18.servicio;

import com.softtek.Abril18.modelo.Producto;

public interface IProductoServicio {
    Producto obtenerProducto();
    Producto crearProducto(Producto p);
    void eliminarProducto(int id);
    Producto modificarProducto(Producto p);
}
