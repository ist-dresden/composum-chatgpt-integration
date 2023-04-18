package com.composum.chatgpt.base.service.chat;

import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Service to generate content (keywords / descriptions from a text, and so forth.)
 */
public interface GPTContentCreationService {

    /**
     * Generates a list of keywords from the given text.
     *
     * @param text The text to generate keywords from.
     * @return A list of generated keywords, possibly empty.
     */
    @Nonnull
    List<String> generateKeywords(@Nullable String text);

    /**
     * Generates a description from the given text.
     *
     * @param text     The text to generate a description from.
     * @param maxwords approximate maximum number of words in the description, if > 0
     * @return A generated description, possibly empty.
     */
    @Nonnull
    String generateDescription(@Nullable String text, int maxwords);

    /**
     * Executes a given prompt from the user using ChatGPT.
     *
     * @param prompt   the prompt text from the user
     * @param maxwords used to hard limit text length - not used as an explicit instruction to ChatGPT, just to set maxtokens to 4/3 of that.
     */
    @Nonnull
    String executePrompt(@Nullable String prompt, int maxwords);

    /**
     * Executes a given prompt from the user using ChatGPT, using the given text as context.
     *
     * @param prompt   the prompt text from the user
     * @param text     the text to use as context for the prompt
     * @param maxwords used to hard limit text length - not used as an explicit instruction to ChatGPT, just to set maxtokens to 4/3 of that.
     */
    @Nonnull
    String executePromptOnText(@Nullable String prompt, @Nullable String text, int maxwords);

}
