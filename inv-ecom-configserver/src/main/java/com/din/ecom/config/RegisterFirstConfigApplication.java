package com.din.ecom.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/*
 * In a registration-first approach, the Config server registers 
 * with the Discovery server similarly to as other services 
 * do and the client application can bootstrap the Config server metadata using the 
 * applicable discovery settings. The benefits of this approach is that the client 
 * application only need to know the service name of the Config service. 
 * The disadvantage is that a extra network round trip is needed to get the Config service
 *  metadata before the client application can connect to it to get the properties.
 * 
 */

@Profile("registration-first")
@Configuration
@EnableDiscoveryClient
public class RegisterFirstConfigApplication {

}
