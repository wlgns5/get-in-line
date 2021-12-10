package com.getInLine.lavine.controller.api;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RequestMapping("/api")
@RestController
public class APIPlaceController {

    @GetMapping("/places")
    public List<String> getPlaces() {return Arrays.asList("place1", "place2");}

    @PostMapping("/places")
    public Boolean createPlaces() {return true;}

    @GetMapping("/places/{placeId}")
    public String getPlace(@PathVariable Integer placeId) {return "place " + placeId;}

    @PutMapping("/places/{placeId}")
    public Boolean modifyPlace(@PathVariable Integer placeId) {return true;}

    @DeleteMapping("/places/{placeId}")
    public Boolean removePlace(@PathVariable Integer placeId) {return true;}
}
