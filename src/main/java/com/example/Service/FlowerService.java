//package com.example.Service;
//
//import com.example.store.Flower;
//import org.springframework.stereotype.Service;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//
//
//@Service
//public class FlowerService {
//    private final FlowerRepository flowerRepository;
//
//    @Autowired
//    public FlowerService(FlowerRepository flowerRepository) {
//        this.flowerRepository = flowerRepository;
//    }
//
//    public List<Flower> getFlowers() {
//        return flowerRepository.findAll();
//    }
//
//    public void addFlower(Flower flower) {
//        flowerRepository.save(flower);
//    }
//}