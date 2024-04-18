package com.softtek.Abril18.controlador;

import com.softtek.Abril18.modelo.Producto;
import com.softtek.Abril18.repo.ProductoRepo;
import com.softtek.Abril18.servicio.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.ParameterResolutionDelegate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productos")
public class ControladorProducto {
    @Autowired
    private IProductoServicio servicio;

    @GetMapping
    public Producto obtenerProducto(){
        return servicio.obtenerProducto();
    }

    @GetMapping("/{id}")
    public Producto obtenerUno(int id){
        return
    }

    @PostMapping
    public Producto crearProducto(@RequestBody Producto p){
        return servicio.crearProducto(p);
    }

    @DeleteMapping("/{idProducto}")
    public void eliminarProducto(@PathVariable int idProducto){
        servicio.eliminarProducto(idProducto);
    }
}
