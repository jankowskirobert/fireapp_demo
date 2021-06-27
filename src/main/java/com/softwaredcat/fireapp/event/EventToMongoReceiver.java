package com.softwaredcat.fireapp.event;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

public class EventToMongoReceiver {

    private final EventRepository eventRepository;

    public EventToMongoReceiver(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @RabbitListener(queues = "testqueue")
    public void receive(Event e) {
        EventEntity eventEntity = new EventEntity();
        eventEntity.setMessage(e.getMessage());
        eventRepository.save(eventEntity).block();
    }

}
