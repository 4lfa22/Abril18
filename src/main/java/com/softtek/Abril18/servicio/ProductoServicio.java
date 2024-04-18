package com.softtek.Abril18.servicio;

import com.softtek.Abril18.modelo.Producto;
import com.softtek.Abril18.repo.ProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductoServicio implements IProductoServicio{
    @Autowired
    private ProductoRepo repo;
    @Override
    public Producto obtenerProducto() {
        return repo.obtenerProducto();
    }

    @Override
    public Producto crearProducto(Producto p) {
        return repo.crearProducto(p);
    }

    @Override
    public void eliminarProducto(int id) {

    }

    @Override
    public Producto modificarProducto(Producto p) {
        return null;
    }

}
