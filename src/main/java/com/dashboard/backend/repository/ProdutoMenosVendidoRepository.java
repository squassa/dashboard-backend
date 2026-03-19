package com.dashboard.backend.repository;

import com.dashboard.backend.model.ProdutoMenosVendido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoMenosVendidoRepository extends JpaRepository<ProdutoMenosVendido, Long> {
}