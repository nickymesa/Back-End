package com.app.demo.Productos.controller;
import com.app.demo.domain.dto.ProductosDTO;
import com.app.demo.domain.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productos")
public class ProductosController {

    private final ProductosService productosService;

    @Autowired
    public ProductosController(ProductosService productosService) {
        this.productosService = productosService;
    }

    @PostMapping("/crear")
    public ResponseEntity<ProductosDTO> crearProducto(@RequestBody ProductosDTO productoDTO) {
        ProductosDTO productoCreado = productosService.crearProducto(productoDTO);
        return new ResponseEntity<>(productoCreado, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductosDTO> obtenerProducto(@PathVariable Long id) {
        ProductosDTO producto = productosService.obtenerProducto(id);
        if (producto != null) {
            return new ResponseEntity<>(producto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Puedes agregar más métodos para actualizar, eliminar, listar productos, etc.
}
