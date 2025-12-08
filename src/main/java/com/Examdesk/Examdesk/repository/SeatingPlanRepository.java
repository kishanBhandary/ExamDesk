package com.Examdesk.Examdesk.repository;

import com.Examdesk.Examdesk.model.SeatingPlan;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeatingPlanRepository extends MongoRepository<SeatingPlan, ObjectId> {
}
