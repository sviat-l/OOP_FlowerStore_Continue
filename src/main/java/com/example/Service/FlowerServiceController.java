//package com.example.Service;
//
//import com.example.Service.FlowerService;
//import com.example.store.Flower;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/flowersService")
//public class FlowerServiceController {
//    private final FlowerService flowerService;
//
//    @Autowired
//    public FlowerServiceController(FlowerService flowerService) {
//        this.flowerService = flowerService;
//    }
//
//    @GetMapping
//    public List<Flower> getAllFlowers() {
//        return flowerService.getFlowers();
//    }
//
//    @PostMapping
//    public void addFlower(@RequestBody Flower flower) {
//        flowerService.addFlower(flower);
//    }
//}
