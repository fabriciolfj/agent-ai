package com.github.fabriciolfj;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService
public interface ClaudeAssistant {

    @SystemMessage("voce e um assistente financeiro...")
    String chat(@MemoryId final String userId, @UserMessage final String msg);
}
