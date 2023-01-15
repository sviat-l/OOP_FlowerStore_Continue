package com.example.Controllers;


import com.example.store.CactusFlower;
import com.example.store.Flower;
import com.example.store.RomashkaFlower;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    @GetMapping
    public List<Flower> getFlowers(){
        return List.of(new CactusFlower("cactus", 0, 100),
                new RomashkaFlower("romashka", 11, 13),
                new Flower("rose", 25, 50, "red"));
    }
}
