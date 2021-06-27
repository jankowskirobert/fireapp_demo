package com.softwaredcat.fireapp.event;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EventRepository extends ReactiveMongoRepository<EventEntity, String> {
}
