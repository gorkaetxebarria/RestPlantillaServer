package controller;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/Holamundo")
public class Holamundo {

    @GET
    @Path("/saludo")
    public String  saludo(){
        return "hola mundo rest";
    }
    @GET
    @Path("/adios")
    public String  adios(){
        return "adios mundo rest";
    }
    
}
