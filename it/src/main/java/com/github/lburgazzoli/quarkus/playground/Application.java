/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.lburgazzoli.quarkus.playground;

import javax.enterprise.context.ApplicationScoped;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/test")
@ApplicationScoped
public class Application {

    @GET
    @Path("/do/{what}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject doSomething(@PathParam("name") String what) {
        /*
        final Source source = Sources.fromBytes(name, "yaml", null, code.getBytes(StandardCharsets.UTF_8));
        final RoutesLoader loader = new YamlRoutesLoader();
        final RouteBuilder routes = loader.load(context, source);

        context.addRoutes(routes);

        return Json.createObjectBuilder()
            .add("components", extractComponents())
            .add("routes", extractRoutes())
            .add("endpoints", extractEndpoints())
            .build();
         */
        return Json.createObjectBuilder().build();
    }
}
