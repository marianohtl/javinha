package com.poccrud.crud.controller;

import com.poccrud.crud.dto.TransactionWpsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.poccrud.crud.services.TransactionService;

import java.util.List;

@RestController
@RequestMapping(value = "/transactions")
public class TransactionWpsController {

    @Autowired
    private TransactionService service;

    @GetMapping(value = "/origin/{id}")
    public ResponseEntity<List<TransactionWpsDTO>> findByOriginId(@PathVariable Long id) {
        List<TransactionWpsDTO> dto = service.findByOriginId(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping(value = "/destination/{id}")
    public ResponseEntity<List<TransactionWpsDTO>> findByDestinationId(@PathVariable Long id) {
        List<TransactionWpsDTO> dto = service.findByDestinationId(id);
        return ResponseEntity.ok(dto);
    }
}
