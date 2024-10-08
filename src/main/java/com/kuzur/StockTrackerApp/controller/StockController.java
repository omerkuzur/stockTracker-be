package com.kuzur.StockTrackerApp.controller;

import com.kuzur.StockTrackerApp.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stocks")
@CrossOrigin(origins = "http://localhost:3000") // React uygulamanızın adresi
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping("/{symbol}")
    public String getStockPrice(@PathVariable String symbol) {
        return stockService.getStockPrice(symbol); // Hisse fiyatını döndür
    }
}