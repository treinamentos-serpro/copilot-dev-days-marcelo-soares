package com.socops.data;

import java.util.List;

/**
 * Central catalogue of every icebreaker prompt that can appear on a board.
 * Exactly 24 entries — one fewer than the 25-cell grid, because the
 * centre cell is always the free space.
 */
public final class IcebreakerPrompts {

    public static final String FREE_CELL_LABEL = "FREE SPACE";

    public static final List<String> ALL_PROMPTS = List.of(
            "has defended a ridiculous movie opinion with a presentation",
            "would survive a zombie movie because of one oddly specific skill",
            "has a song they play before doing something dramatic",
            "can identify a movie from an aggressively vague plot summary",
            "has chosen a series based entirely on its opening credits",
            "would cast a colleague as the hero of a heist movie",
            "has a fictional character they would invite to dinner",
            "has watched a movie so bad it became excellent",
            "can invent a better title for a famous movie",
            "has accidentally memorized an entire ad jingle",
            "would enter a talent show with a completely unnecessary skill",
            "has a soundtrack for a very ordinary daily task",
            "can name a song that belongs in a spaceship chase",
            "has paused a movie to explain the plot to someone",
            "would turn their workday into a musical number",
            "has a favorite villain who is objectively a terrible person",
            "can describe their week as a movie genre",
            "has rewatched one scene more times than the whole movie",
            "would make a documentary about a surprisingly mundane topic",
            "can hum a song for someone to guess",
            "has invented a spin-off for a fictional side character",
            "would bring one fictional gadget to the real world",
            "can deliver a five-second award acceptance speech",
            "can recommend a film using only three enthusiastic words"
    );

    private IcebreakerPrompts() {
        /* catalogue only — no instances */
    }
}
