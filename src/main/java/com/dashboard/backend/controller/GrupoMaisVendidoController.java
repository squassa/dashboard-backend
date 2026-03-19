package com.dashboard.backend.controller;

import com.dashboard.backend.model.GrupoMaisVendido;
import com.dashboard.backend.repository.GrupoMaisVendidoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/grupos")
@CrossOrigin
public class GrupoMaisVendidoController {

    private final GrupoMaisVendidoRepository repository;

    public GrupoMaisVendidoController(GrupoMaisVendidoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<GrupoMaisVendido> listar() {
        return repository.findAll();
    }

    @PostMapping
    public GrupoMaisVendido salvar(@RequestBody GrupoMaisVendido grupo) {
        return repository.save(grupo);
    }
}