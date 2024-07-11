package com.rocketseat.planner.trip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TripService {

    @Autowired
    private final TripRepository repository;
    private final ParticipantService participantService;
    private final ActivityService activityService;
    private final LinkService linkService;

    @Autowired
    public TripService(TripRepository repository, ParticipantService participantService, ActivityService activityService, LinkService linkService) {
        this.repository = repository;
        this.participantService = participantService;
        this.activityService = activityService;
        this.linkService = linkService;
    }

    private class ParticipantService {}

    private class ActivityService {}

    private class LinkService {}

}
