package de.felixklauke.avalance.server.http;

import de.felixklauke.avalance.core.routing.RouterRequest;
import io.netty.handler.codec.http.HttpRequest;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class NettyRouterRequest extends RouterRequest {

    /**
     * Create a new router request.
     *
     * @param httpRequest The http request.
     */
    public NettyRouterRequest(HttpRequest httpRequest) {
        super();
    }
}