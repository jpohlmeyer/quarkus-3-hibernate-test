package org.acme;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/teacher")
public class TeacherResource {

  @Inject
  EntityManager entityManager;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Transactional
  @Path("addMerge")
  public String addTeacherMerge() {
    Teacher teacher = new Teacher();
    entityManager.merge(teacher);
    return "success";
  }

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Transactional
  @Path("addPersist")
  public String addTeacherPersist() {
    Teacher teacher = new Teacher();
    entityManager.persist(teacher);
    return "success";
  }

}
