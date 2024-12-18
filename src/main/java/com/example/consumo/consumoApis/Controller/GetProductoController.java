package com.example.consumo.consumoApis.Controller;


import com.example.consumo.consumoApis.Model.Producto;
import com.example.consumo.consumoApis.client.ProductoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GetProductoController {

    @Autowired
    private ProductoClient productoClient;

    @GetMapping("/producto")
    public List<Producto> obtenerProductos(){
        return productoClient.getProductos();
    }


}
