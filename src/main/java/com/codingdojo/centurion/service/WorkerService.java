package com.codingdojo.centurion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.centurion.model.Worker;
import com.codingdojo.centurion.repository.WorkerRepository;

@Service
public class WorkerService {

    private final WorkerRepository workerRepository;

    @Autowired
    public WorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    // Add a new worker
    public Worker addWorker(Worker worker) {
        // Additional validations or business logic can go here
        return workerRepository.save(worker);
    }

    // Fetch all workers
    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }

    // Fetch a single worker by ID
    public Worker getWorkerById(Long id) {
        Optional<Worker> optionalWorker = workerRepository.findById(id);
        if (!optionalWorker.isPresent()) {
            throw new RuntimeException("Worker not found!");
        }
        return optionalWorker.get();
    }

    // Update a worker's details
    public Worker updateWorker(Long id, Worker workerDetails) {
        Worker worker = getWorkerById(id); // Reusing the getWorkerById method to fetch the existing worker
        worker.setName(workerDetails.getName());
        worker.setLastName(workerDetails.getLastName());
        worker.setRut(workerDetails.getRut());
        // Save the updated worker details to the database
        return workerRepository.save(worker);
    }

    // Delete a worker
    public void deleteWorker(Long id) {
        workerRepository.deleteById(id);
    }
}
