package com.softtek.Abril18.repo;

import com.softtek.Abril18.modelo.Producto;

import java.util.List;

public class ProductoRepo implements IProductoRepo{
    @Override
    public Producto obtenerProducto() {
        return new Producto();
    }

    @Override
    public Producto crearProducto(Producto p) {
        p.setIdProducto();
        p.setNombreProducto();
        p.setPrecioUnitario();
        p.setUnidadesStock();
        return p;
    }

    @Override
    public void eliminarProducto(int id) {

    }

    @Override
    public Producto modificarProducto(Producto p) {
        return null;
    }

    @Override
    public List<Producto> obtenerTodosProductos() {
        return List.of();
    }
}
