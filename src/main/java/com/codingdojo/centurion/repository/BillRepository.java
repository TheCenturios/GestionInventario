package com.codingdojo.centurion.repository;

import com.codingdojo.centurion.model.Bill;
import com.codingdojo.centurion.model.Bill.BillStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {

    List<Bill> findByWorkerId(Long workerId);

    List<Bill> findByIssueDateBetween(LocalDate start, LocalDate end);

    List<Bill> findByStatus(BillStatus status);
}

