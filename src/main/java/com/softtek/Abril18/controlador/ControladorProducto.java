package com.softtek.Abril18.controlador;

import com.softtek.Abril18.modelo.Producto;
import com.softtek.Abril18.servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "http://localhost:4200")
public class ControladorProducto {
    @Autowired
    private ProductoServicio productoServicio;

    @GetMapping("/{id}")
    public Producto obtenerProducto(@PathVariable int id) {
        return productoServicio.obtenerProducto(id);
    }

    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoServicio.crearProducto(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable int id) {
        productoServicio.eliminarProducto(id);
    }

    @PutMapping("/{id}")
    public Producto modificarProducto(@PathVariable int id, @RequestBody Producto producto) {
        producto.setIdProducto(id);
        return productoServicio.modificarProducto(producto);
    }

    @GetMapping()
    public List<Producto> obtenerProductos(){
        return productoServicio.obtenerTodosProductos();
    }
}
