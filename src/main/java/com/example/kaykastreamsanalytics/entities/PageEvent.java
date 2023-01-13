package com.example.kaykastreamsanalytics.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
 @Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class PageEvent {
      @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
      Long id;
      String name_page;
      String user_name;
      Date date_event;
      long duration_event;
}
