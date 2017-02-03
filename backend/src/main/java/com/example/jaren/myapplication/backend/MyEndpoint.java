package com.example.jaren.myapplication.backend;

import com.example.JokeProvider;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/**
 * An endpoint class for joke.
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.jaren.example.com",
                ownerName = "backend.myapplication.jaren.example.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method to provide a joke. */
    @ApiMethod(name = "getJoke")
    public MyBean getJoke(){
        MyBean response = new MyBean();
        response.setData(JokeProvider.getJoke());

        return response;
    }

}
