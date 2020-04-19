package com.leesin;

import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * @description:
 * @author: Leesin Dong
 * @date: Created in 2020/4/19 14:58
 * @modified By:
 */
@Path("/pay")
public interface IPayService {
    //暴露出去的服务
    @GET
    @Path("/{info}")
    String pay(@PathParam("info") String info);
}
