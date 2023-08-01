package org.acme;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Teacher {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected Integer id;

  @ManyToMany(fetch = FetchType.LAZY)
  private Set<Pupil> pupils;

  public Teacher() {
    this.pupils = new HashSet<>();
  }

}
