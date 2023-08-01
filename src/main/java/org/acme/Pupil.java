package org.acme;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Pupil {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected Integer id;

  @ManyToMany(fetch = FetchType.LAZY, mappedBy = "pupils")
  private Set<Teacher> teachers;

  public Pupil() {
    this.teachers = new HashSet<>();
  }

}
