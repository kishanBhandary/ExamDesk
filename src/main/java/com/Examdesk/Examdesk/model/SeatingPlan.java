package com.Examdesk.Examdesk.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document("seatingPlans")
public class SeatingPlan {
        @Id
        private String id;
        private String subjectCode;
        private String examDate;
        private List<RoomAllocation> roomAllocations;
    }


