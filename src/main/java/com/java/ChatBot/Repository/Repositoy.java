package com.java.ChatBot.Repository;

import com.java.ChatBot.Model.Model;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Repositoy extends JpaRepository<Model, UUID> {
}
