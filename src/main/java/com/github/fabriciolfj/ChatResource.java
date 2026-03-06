package com.github.fabriciolfj;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

@Path("/api/ai/test")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ChatResource {

    private static final Logger log = LoggerFactory.getLogger(ChatResource.class);

    @Inject
    private ClaudeAssistant claudeAssistant;

    @POST
    public Response chat(final ChatRequest request) {
        log.info("receive by {} message {}", request.getUser(), request.getMessage());

        final String response = claudeAssistant.chat(request.getUser(), request.getMessage());
        return Response.ok(
                Map.of("user", request.getUser(),
                        "reply", response)
        ).build();
    }
}
