package com.example.consumo.consumoApis.client;

import com.example.consumo.consumoApis.Model.Producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@FeignClient(name = "producto-client", url = "localhost:8080")

public interface ProductoClient {

        @GetMapping("/obtener/producto")
        List<Producto> getProductos();

}

