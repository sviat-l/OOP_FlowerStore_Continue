package com.example.Service;

import com.example.store.Flower;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, String> {}
