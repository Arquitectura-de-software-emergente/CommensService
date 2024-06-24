package com.tripmicroservice.tripmicroservice.resource;

import com.tripmicroservice.tripmicroservice.mapping.dto.RatingDto;
import com.tripmicroservice.tripmicroservice.mapping.dto.ReservationDto;
import com.tripmicroservice.tripmicroservice.mapping.dto.ServicesDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TripResponse {
    private int Id;
    private String Title;
    private String Description;
    private int Duration;
    private String Difficulty;

    List<ServicesDto> servicesDtoList;
    private List<ReservationDto> reservations; // Incluir la lista de reservas
    private List<RatingDto> ratings; // Incluir la lista de reservas

}