package com.dashboard.backend.controller;

import com.dashboard.backend.model.Cmv;
import com.dashboard.backend.repository.CmvRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cmv")
@CrossOrigin
public class CmvController {

    private final CmvRepository repository;

    public CmvController(CmvRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Cmv> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Cmv salvar(@RequestBody Cmv cmv) {
        return repository.save(cmv);
    }
}