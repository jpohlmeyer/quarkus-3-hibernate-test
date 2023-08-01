package org.acme;

import jakarta.persistence.*;

@Entity
public class Pupil {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected Integer id;

}
