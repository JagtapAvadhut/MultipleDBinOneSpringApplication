package com.SpringDb.postgresSQL.repository;

import com.SpringDb.postgresSQL.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<Company,Long> {
}
