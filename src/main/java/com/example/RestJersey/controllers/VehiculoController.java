package com.example.RestJersey.controllers;

import com.example.RestJersey.entities.Vehiculo;
import com.example.RestJersey.services.VehiculoService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import javassist.tools.reflect.CannotCreateException;
import org.springframework.stereotype.Component;


@Component
@Path("/")

public class VehiculoController {
    private VehiculoService vehiculoService;
    public VehiculoController(VehiculoService vehiculoService){
        this.vehiculoService = vehiculoService;
    }
    @GET
    @Path("/api/{tipo}")
    @Produces("application/json")
    public Response crear(@PathParam("tipo") String tipo){
        try{
            Vehiculo vehiculo = vehiculoService.crearVehiculo(tipo);
            return Response.status(Response.Status.CREATED).entity(vehiculo).build();
        }catch(CannotCreateException e){
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }

    @GET
    @Path("/api/obtener")
    @Produces("application/json")
    public Response obtenerVehiculos(){
        try{
            return Response.status(Response.Status.ACCEPTED).entity(vehiculoService.getAll()).build();
        }catch (NotFoundException e){
            return Response.status(Response.Status.NO_CONTENT).build();
        }
    }

}
