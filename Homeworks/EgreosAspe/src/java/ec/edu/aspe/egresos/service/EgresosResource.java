/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.aspe.egresos.service;

import ec.edu.aspe.egresos.model.CasaComercial;
import ec.edu.aspe.egresos.operation.LinkSearch;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author HP
 */
@Path("consultar")
public class EgresosResource {

    @Context
    private UriInfo context;
    LinkSearch link = new LinkSearch();
    /**
     * Creates a new instance of EgresosResource
     */
    public EgresosResource() {
    }

    /**
     * Retrieves representation of an instance of ec.edu.aspe.egresos.service.EgresosResource
     * @return an instance of ec.edu.aspe.egresos.model.CasaComercial
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CasaComercial getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }
    
    @Path("casaComercial")  
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CasaComercial> setCasas() 
    {
        return link.listCasaComercial();
    }
    
    @Path("NombreCasas")  
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> setBuscarCasa()
    {
        return link.cargarCC();
    }
    
    @Path("RUC/{NOMBRE_CC}")  
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String setRuc(@PathParam("NOMBRE_CC") String NOMBRE_CC)
    {
        return link.cargarRUC(NOMBRE_CC);
    }
    
    @Path("Venta/{PRODUCTOS_CC}")  
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String setProducto(@PathParam("PRODUCTOS_CC") String PRODUCTOS_CC)
    {
        return link.cargarVenta(PRODUCTOS_CC);
    }
    
    @Path("NombreCasa/{PRODUCTOS_CC}")  
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String setProductoDisponible(@PathParam("PRODUCTOS_CC") String PRODUCTOS_CC)
    {
        return link.cargarProducto(PRODUCTOS_CC);
    }
 
    /**
     * PUT method for updating or creating an instance of EgresosResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(CasaComercial content) {
    }
}
