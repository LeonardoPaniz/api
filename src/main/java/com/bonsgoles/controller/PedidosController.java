package com.bonsgoles.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Pedidos;
import com.repository.PedidosRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/pedidos")
@AllArgsConstructor
public class PedidosController {

    private final PedidosRepository pedidosRepository;

    @GetMapping
    public List<Pedidos> list() {
        return pedidosRepository.findAll();
    }
}
