package com.codingdojo.centurion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.centurion.model.Worker;
import com.codingdojo.centurion.service.WorkerService;

@RestController
@RequestMapping("/api/workers")
public class WorkerController {

    private final WorkerService workerService;

    @Autowired
    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    // Create a new worker
    @PostMapping
    public ResponseEntity<Worker> addWorker(@RequestBody Worker worker) {
        Worker newWorker = workerService.addWorker(worker);
        return ResponseEntity.ok(newWorker);
    }

    // Retrieve all workers
    @GetMapping
    public ResponseEntity<List<Worker>> getAllWorkers() {
        List<Worker> workers = workerService.getAllWorkers();
        return ResponseEntity.ok(workers);
    }

    // Retrieve a single worker by ID
    @GetMapping("/{id}")
    public ResponseEntity<Worker> getWorkerById(@PathVariable Long id) {
        Worker worker = workerService.getWorkerById(id);
        return ResponseEntity.ok(worker);
    }

    // Update a worker's details
    @PutMapping("/{id}")
    public ResponseEntity<Worker> updateWorker(@PathVariable Long id, @RequestBody Worker workerDetails) {
        Worker updatedWorker = workerService.updateWorker(id, workerDetails);
        return ResponseEntity.ok(updatedWorker);
    }

    // Delete a worker
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteWorker(@PathVariable Long id) {
        workerService.deleteWorker(id);
        return ResponseEntity.ok().build();
    }
}