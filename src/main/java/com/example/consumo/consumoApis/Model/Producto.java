package com.example.consumo.consumoApis.Model;

import lombok.Data;

import java.util.Date;

@Data
public class Producto {

    private Long id;

    private String nombre;

    private String descripcion;

    private Date caducidad;

    private Proveedor proveedor;
}
