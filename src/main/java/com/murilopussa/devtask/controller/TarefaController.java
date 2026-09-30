package com.murilopussa.devtask.controller;

import com.murilopussa.devtask.service.TarefaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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
    public Tarefa adicionarTarefa(@RequestBody Tarefa tarefa){
        return tarefaService.adicionarTarefa(tarefa);
    }
}
