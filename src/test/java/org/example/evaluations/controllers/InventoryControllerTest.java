package org.example.evaluations.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.evaluations.evaluation.controllers.InventoryController;
import org.example.evaluations.evaluation.dtos.InventoryUpdateRequestDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.text.SimpleDateFormat;

import static org.hamcrest.Matchers.emptyOrNullString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(InventoryController.class)
public class InventoryControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testGetInventoryById() throws Exception {
        Long inventoryId = 1L;

        mockMvc.perform(get("/inventory/{inventoryId}", inventoryId))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.guestName").value("Your Name"))
                .andExpect(jsonPath("$.date").isNotEmpty());
    }

    @Test
    public void testGetInventoryByGuestNameAndDate() throws Exception {
        String guestName = "anuragkhanna";

        mockMvc.perform(get("/inventory/guest/anuragkhanna/date/2024-08-15"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(99999))
                .andExpect(jsonPath("$.guestName").value(guestName))
                .andExpect(jsonPath("$.date").value("2024-08-14T18:30:00.000+00:00"));
    }

    @Test
    public void testListInventoriesOfParticularDate() throws Exception {
        mockMvc.perform(get("/inventory/date/2024-08-15"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].guestName").value("Your Name"))
                .andExpect(jsonPath("$[0].id").value(99999))
                .andExpect(jsonPath("$[0].date").value("2024-08-14T18:30:00.000+00:00"));
    }

    @Test
    public void testListInventoriesOfParticularDate_invalidDateFormat() throws Exception {
        mockMvc.perform(get("/inventory/date/15augt2024"))
                .andExpect(status().isOk())
                .andExpect(content().string(emptyOrNullString()));
    }

    @Test
    public void testGetInventoryByGuestNameAndDate_invalidDateFormat() throws Exception {
        mockMvc.perform(get("/inventory/guest/anuragkhanna/date/invalid-date-format"))
                .andExpect(status().isOk())
                .andExpect(content().string(emptyOrNullString()));
    }

    @Test
    public void testUpdateInventory() throws Exception {
        InventoryUpdateRequestDto requestDto = new InventoryUpdateRequestDto();
        requestDto.setGuestName("Anurag Khanna");
        requestDto.setDate(new SimpleDateFormat("yyyy-MM-dd").parse("2024-08-15"));

        mockMvc.perform(put("/inventory/2")
                        .contentType("application/json")
                        .content(objectMapper.writeValueAsString(requestDto)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(2))
                .andExpect(jsonPath("$.guestName").value("Anurag Khanna"))
                .andExpect(jsonPath("$.date").value("2024-08-14T18:30:00.000+00:00"));
    }
}
