/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ogurec.resttask.service;

import com.ogurec.resttask.Myuser;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author j-jun
 */
@Stateless
@Path("com.ogurec.resttask.myuser")
public class MyuserFacadeREST extends AbstractFacade<Myuser> {

    @PersistenceContext(unitName = "com.ogurec_resttask_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public MyuserFacadeREST() {
        super(Myuser.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Myuser entity) {
        super.create(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        try{
            super.remove(super.find(id));
        }
        catch(Exception e)
        {
        }
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Myuser find(@PathParam("id") String id) {
        return super.find(id);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
