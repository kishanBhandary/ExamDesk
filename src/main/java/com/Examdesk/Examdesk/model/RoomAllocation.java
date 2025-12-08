package com.Examdesk.Examdesk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class RoomAllocation {
    private String roomNo;
    private List<Seat> seats;

}
