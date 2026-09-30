package com.murilopussa.devtask.controller;

import com.murilopussa.devtask.service.TarefaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.murilopussa.devtask.model.Tarefa;

import java.util.List;

@RestController
public class TarefaController {
    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @GetMapping("/tarefas")
    public List<Tarefa> listarTarefas() {
        return tarefaService.listarTarefas();
    }

    @PostMapping("/tarefas")
    @ResponseStatus(HttpStatus.CREATED)
    public Tarefa adicionarTarefa(@RequestBody Tarefa tarefa){
        return tarefaService.adicionarTarefa(tarefa);
    }

    @GetMapping("/tarefas/{id}")
    public Tarefa buscarTarefa(@PathVariable Long id){
        return tarefaService.buscarTarefaPorId(id);
    }
}
