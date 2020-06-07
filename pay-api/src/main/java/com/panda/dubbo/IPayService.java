package com.panda.dubbo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/pay") //这些注解就是REST
public interface IPayService {

    //暴露出现的服务
    //完成支付的功能
    @GET
    @Path("/{info}")
    String pay(@PathParam("info") String info);
}
