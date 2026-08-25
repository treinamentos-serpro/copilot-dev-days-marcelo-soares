package com.socops.data;

import java.util.List;

/**
 * Central catalogue of every icebreaker prompt that can appear on a board.
 * Tech Life theme — coding habits, IDE preferences, and developer culture.
 * Exactly 24 entries — one fewer than the 25-cell grid, because the
 * centre cell is always the free space.
 */
public final class IcebreakerPrompts {

    public static final String FREE_CELL_LABEL = "FREE SPACE";

    public static final List<String> ALL_PROMPTS = List.of(
            "has used dark mode today",
            "has more than 5 browser tabs open right now",
            "has ever named a variable 'temp' or 'foo'",
            "knows at least one keyboard shortcut by heart",
            "has ever Googled a syntax error",
            "uses spaces over tabs",
            "has copy-pasted from Stack Overflow today",
            "has restarted something to fix it",
            "has a mechanical keyboard",
            "has ever forgotten a semicolon",
            "uses VS Code as their main editor",
            "has ever said 'it works on my machine'",
            "has committed directly to main at least once",
            "prefers terminal over GUI tools",
            "has written a TODO comment and never returned",
            "has ever rage-quit a merge conflict",
            "has a rubber duck (real or virtual) for debugging",
            "can recite their most-used Git command from memory",
            "has ever deployed on a Friday",
            "has named a branch something like 'fix-final-FINAL-v2'",
            "has ever written regex and felt like a wizard",
            "has used print/console.log as a debugging strategy today",
            "has ever had a bug caused by a single missing character",
            "has ever written code after midnight to hit a deadline"
    );

    private IcebreakerPrompts() {
        /* catalogue only — no instances */
    }
}
