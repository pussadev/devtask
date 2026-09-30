package com.murilopussa.devtask.service;

import com.murilopussa.devtask.model.StatusTarefa;
import com.murilopussa.devtask.model.Tarefa;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class TarefaService {

    private List<Tarefa> tarefas = new ArrayList<>();
    private Long proximoId = 3L;

    public TarefaService() {
        Tarefa tarefa = new Tarefa(
                1L,
                "Estudar Spring Boot",
                "Continuar desenvolvendo o DevTask",
                StatusTarefa.PENDENTE
        );

        Tarefa tarefa2 = new Tarefa(
                2L,
                "Estudar Java",
                "Revisar orientação a objetos",
                StatusTarefa.EM_ANDAMENTO
        );

        tarefas.add(tarefa);
        tarefas.add(tarefa2);
    }

    public List<Tarefa> listarTarefas() {

        return tarefas;
    }

    public Tarefa adicionarTarefa(Tarefa tarefa){
        tarefa.setId(proximoId);
        proximoId++;
        tarefas.add(tarefa);

        return tarefa;
    }

    public Tarefa buscarTarefaPorId(Long id){
        for (Tarefa tarefa: tarefas){
            if (tarefa.getId().equals(id)) {
                return tarefa;
            }
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Tarefa não encontrada"
        );
    }
}
