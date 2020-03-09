package com.bhavesh.aerospikeexample.resource;

import com.bhavesh.aerospikeexample.model.LivePrice;
import com.bhavesh.aerospikeexample.service.LivePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/v1/liveprice")
@EnableAutoConfiguration
public class LivePriceResource {

    @Autowired
    private LivePriceService livePriceService;

    @GetMapping
    public List<LivePrice> getAllUsers() {
        return livePriceService.getAll();
    }


    @PostMapping
    public List<LivePrice> create(@RequestBody final LivePrice livePrice){

        livePriceService.create(livePrice);

        return livePriceService.getAll();
    }
}
