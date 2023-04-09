package com.example.server.repository;

import com.example.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
    
    
    Server findByIpAddress (String ipAddress);
}
