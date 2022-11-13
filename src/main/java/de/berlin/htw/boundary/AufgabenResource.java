package de.berlin.htw.boundary;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import de.berlin.htw.control.ZahlenService;

/**
 * @author Alexander Stanik [stanik@htw-berlin.de]
 *
 */

 @Path("/aufgaben/1/")
public class AufgabenResource {

    @Inject
    ZahlenService service;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public void anlegen(@QueryParam("zahl") int zahl) {
        service.add(zahl);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String letztelesen() {
        return service.getlastZahl() + "";
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String aktualisieren(@QueryParam("zahl") int zahl, @QueryParam("newZahl") int newZahl) {
        service.update(zahl, newZahl);
        return "Zahl wurde aktualisiert";
    }

    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    public void loeschen(
        @QueryParam("number") String number) {
        service.remove(Integer.parseInt(number));
    }
}