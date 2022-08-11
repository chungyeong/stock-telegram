package com.stocktelegram.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class StockItemController {
    @GetMapping("/stockitem")
public List<?> getStockItems(){
        List<?> tracedItemsOfStock =
        return tracedItemsOfStock;
    }

}
