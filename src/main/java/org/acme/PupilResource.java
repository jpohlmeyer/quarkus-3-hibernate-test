package org.acme;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/pupil")
public class PupilResource {

  @Inject
  EntityManager entityManager;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Transactional
  @Path("addMerge")
  public String addPupilMerge() {
    Pupil pupil = new Pupil();
    entityManager.merge(pupil);
    return "success";
  }

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Transactional
  @Path("addPersist")
  public String addPupilPersist() {
    Pupil pupil = new Pupil();
    entityManager.persist(pupil);
    return "success";
  }

}
