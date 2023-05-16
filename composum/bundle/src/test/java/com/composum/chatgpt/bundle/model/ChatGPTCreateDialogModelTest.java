package com.composum.chatgpt.bundle.model;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Test;

public class ChatGPTCreateDialogModelTest {

    private ChatGPTCreateDialogModel model = new ChatGPTCreateDialogModel();

    @Test
    public void testGetPredefinedPrompts() {
        Map<String, String> predefinedPrompts = model.getPredefinedPrompts();
        assertNotNull(predefinedPrompts);
        assertTrue(!predefinedPrompts.isEmpty());
    }

    @Test
    public void testGetContentSelectors() {
        Map<String, String> contentSelectors = model.getContentSelectors();
        assertNotNull(contentSelectors);
        assertTrue(!contentSelectors.isEmpty());
    }

    @Test
    public void testGetTextLengths() {
        Map<String, String> textLengths = model.getTextLengths();
        assertNotNull(textLengths);
        assertTrue(!textLengths.isEmpty());
    }

}
