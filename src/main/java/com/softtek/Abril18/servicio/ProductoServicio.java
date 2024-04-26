package com.softtek.Abril18.servicio;

import com.softtek.Abril18.modelo.Producto;
import com.softtek.Abril18.repo.IProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio implements IProductoServicio {
    @Autowired
    private IProductoRepo productoRepo;

    @Override
    public Producto obtenerProducto(int id) {
        return productoRepo.obtenerProducto(id);
    }

    @Override
    public Producto crearProducto(Producto producto) {
        return productoRepo.crearProducto(producto);
    }

    @Override
    public void eliminarProducto(int id) {
        productoRepo.eliminarProducto(id);
    }

    @Override
    public Producto modificarProducto(Producto producto) {
        return productoRepo.modificarProducto(producto);
    }

    @Override
    public List<Producto> obtenerTodosProductos() {
        return productoRepo.obtenerTodosProductos();
    }
}
