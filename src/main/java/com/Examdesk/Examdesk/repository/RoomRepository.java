package com.Examdesk.Examdesk.repository;

import com.Examdesk.Examdesk.model.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room,String> {
    
}
