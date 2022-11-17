package de.berlin.htw.boundary;

import javax.inject.Inject;
import javax.print.attribute.standard.MediaPrintableArea;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
    @Produces("application/example")
    public String anlegen(@QueryParam("zahl") int zahl) {
        return service.addList(zahl);
    }

    @Path("/2/")
    @GET
    @Produces("application/example")
    public String ganzeListe(){
        return service.getList();
    }

    @GET
    @Produces("application/example")
    public String letztelesen() {
        return service.getLastNumber();
    }

    @PUT
    @Produces("application/example")
    public String aktualisieren(@QueryParam("zahl") int zahl) {
        service.updateLastListElement(zahl);
        return "Die letzte Zahl wurde aktualisiert";
    }

    @DELETE
    @Produces("application/example")
    public String loeschen() {
        return service.removeLastListElement();
    }
}
