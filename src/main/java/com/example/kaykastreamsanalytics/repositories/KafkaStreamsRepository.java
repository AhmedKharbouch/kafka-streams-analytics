package com.example.kaykastreamsanalytics.repositories;

import com.example.kaykastreamsanalytics.entities.PageEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KafkaStreamsRepository extends JpaRepository<PageEvent,Long> {


}
