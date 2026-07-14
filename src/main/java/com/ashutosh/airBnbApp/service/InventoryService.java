package com.ashutosh.airBnbApp.service;

import com.ashutosh.airBnbApp.dto.HotelPriceResponseDto;
import com.ashutosh.airBnbApp.dto.HotelSearchRequest;
import com.ashutosh.airBnbApp.dto.InventoryDto;
import com.ashutosh.airBnbApp.dto.UpdateInventoryRequestDto;
import com.ashutosh.airBnbApp.dto.*;
import com.ashutosh.airBnbApp.entity.Room;
import org.springframework.data.domain.Page;

import java.util.List;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceResponseDto> searchHotels(HotelSearchRequest hotelSearchRequest);

    List<InventoryDto> getAllInventoryByRoom(Long roomId);

    void updateInventory(Long roomId, UpdateInventoryRequestDto updateInventoryRequestDto);
}
