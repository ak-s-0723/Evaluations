package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.dtos.InventoryUpdateRequestDto;
import org.example.evaluations.evaluation.models.Inventory;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class InventoryController {

    @GetMapping("/inventory/{inventoryId:[\\d]+}")
    public Inventory getInventoryById(@PathVariable Long inventoryId) {
       Inventory inventory = new Inventory();
       inventory.setId(inventoryId);
       return inventory;
    }


    @GetMapping("/inventory/guest/{guest}/date/{date}")
    public Inventory getInventoryByGuestNameAndDate(@PathVariable("guest") String guestName,
                                                    @PathVariable("date") String date) {

        try {
            Inventory inventory = new Inventory();
            inventory.setGuestName(guestName);
            Date inventoryDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            inventory.setDate(inventoryDate);
            return inventory;
        }catch (ParseException exception) {
            return null;
        }
    }


    @GetMapping("/inventory/date/{date}")
    public List<Inventory> listInventoriesOfParticularDate(@PathVariable String date) {
       List<Inventory> inventories = new ArrayList<>();
       try {
           Date inventoryDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
           Inventory inventory = new Inventory();
           inventory.setDate(inventoryDate);
           inventories.add(inventory);
           return inventories;
       }catch (ParseException exception) {
           return null;
       }
    }


    @PutMapping("/inventory/{inventoryId:[\\d]+}")
    public Inventory updateInventory(@PathVariable Long inventoryId, @RequestBody InventoryUpdateRequestDto requestDto) {
       Inventory inventory = new Inventory();
       inventory.setId(inventoryId);
       inventory.setGuestName(requestDto.getGuestName());
       inventory.setDate(requestDto.getDate());
       return inventory;
    }
}
