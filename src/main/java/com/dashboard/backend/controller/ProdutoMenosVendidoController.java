package com.dashboard.backend.controller;

import com.dashboard.backend.model.ProdutoMenosVendido;
import com.dashboard.backend.repository.ProdutoMenosVendidoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/produtos")
@CrossOrigin
public class ProdutoMenosVendidoController {

    private final ProdutoMenosVendidoRepository repository;

    public ProdutoMenosVendidoController(ProdutoMenosVendidoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<ProdutoMenosVendido> listar() {
        return repository.findAll();
    }

    @PostMapping
    public ProdutoMenosVendido salvar(@RequestBody ProdutoMenosVendido produto) {
        return repository.save(produto);
    }
}