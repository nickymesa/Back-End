package com.app.demo.domain.dto;

public class ProductosDTO {

    private Long id;
    private String codigoProducto;
    private String nombreProducto;
    private String descripcion;
    private String categoria;
    private String ubicacion;
    private String proveedor;

    // Constructores, getters y setters

    public ProductosDTO() {
    }

    public ProductosDTO(Long id, String codigoProducto, String nombreProducto, String descripcion, String categoria, String ubicacion, String proveedor) {
        this.id = id;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.ubicacion = ubicacion;
        this.proveedor = proveedor;
    }

    // Getters y setters
}
