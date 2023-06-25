package br.com.joao.producer.controller;

import br.com.joao.producer.services.ProductService;
import br.com.joao.producer.services.StringService;
import dtos.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/product")
public class ProductController {

    private final ProductService service;

    @PostMapping
    public ResponseEntity<ProductDTO> produces(@RequestBody ProductDTO dto){
        service.createProduct(dto);
        return ResponseEntity.status(CREATED).build();
    }

}
