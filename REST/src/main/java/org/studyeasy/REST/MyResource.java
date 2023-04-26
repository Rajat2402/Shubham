package org.studyeasy.REST;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.studyeasy.REST.model.brandModel;
import org.studyeasy.REST.service.brandService;

@Path("/showroom")
public class MyResource {

	brandService service=new brandService();

	@Path("/brands")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<brandModel> getListUser() {
        return service.getListUser();
    }
}
