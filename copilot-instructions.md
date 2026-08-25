---
description: "Workspace-wide instructions for the Soc Ops Spring Boot social bingo project"
---

# Soc Ops Workspace Instructions

## Design Guide

The Soc Ops interface uses a focused cyberpunk mission-terminal aesthetic. Treat this as the established visual direction for future UI work.

### Visual Language

- Use a near-black blue surface with a restrained geometric grid texture.
- Use electric cyan for primary actions, active states, borders, and key status information.
- Use magenta sparingly for secondary identity cues, the free cell, and focus indication.
- Reserve amber for winning streaks and victory feedback.
- Keep glow effects subtle and subordinate to readable content. Avoid noisy flicker, excessive shadows, decorative blobs, and dense neon treatment.
- Prefer thin borders, compact HUD layouts, deliberate spacing, and small uppercase technical labels.

### Typography

- Use a local-first monospace stack for HUD, status, and game content, such as `IBM Plex Mono`, `Cascadia Code`, `SFMono-Regular`, and `Consolas`.
- Use a condensed local-first sans-serif fallback for large titles, such as `Arial Narrow` or `Liberation Sans Narrow`.
- Do not add remote font dependencies. Keep text legible at mobile sizes and wrap long bingo prompts safely.

### Components and States

- Keep the 5x5 board as the primary visual focus with stable square cells and responsive spacing.
- Normal cells use the dark panel surface, muted text, and a subtle line border.
- Selected cells use cyan border, cyan-tinted surface, and cyan text.
- The free cell uses magenta border and tint, is visibly distinct, and remains disabled.
- Winning cells use amber border, tint, text, and restrained glow.
- Keep lobby, active game, and victory overlay visually related as one HUD system.

### Accessibility and Motion

- Preserve `aria-pressed` and descriptive `aria-label` values on every board cell.
- Keep visible `:focus-visible` treatment with sufficient contrast.
- Ensure controls work with keyboard activation and disabled cells cannot be toggled.
- Respect `prefers-reduced-motion` and disable non-essential animations and transitions when requested.
- Validate contrast and layout at both mobile and desktop widths; no prompt, button, banner, or modal may overlap another element.

### Implementation Boundaries

- Prefer CSS variables and low-specificity semantic selectors in `app.css`; avoid hardcoded theme colors in new markup or JavaScript.
- CSS-only effects are preferred because the UI is served by a Thymeleaf template.
- Preserve the existing IDs and JavaScript state machine when changing presentation. Do not change API, persistence, or domain behavior for a visual redesign.
- Follow `.github/instructions/css-utilities.instructions.md` and `.github/instructions/frontend-design.instructions.md` for frontend changes.

## Project Contracts

- The project is a Spring Boot 3.4.2 application using Java 21, Thymeleaf, and vanilla JavaScript.
- The browser owns game state. Preserve the `socops-bingo-snapshot` localStorage key and its existing snapshot shape.
- Board positions are `0` through `24`; position `12` is a pre-selected, non-toggleable free cell.
- Keep `BoardAssembler` stateless and preserve its copy/new-list behavior.
- Keep the Java winning rules and `scanForStreak` in `game.html` synchronized when game rules change.
- Preserve the public browser functions `launchGame()`, `retreatToLobby()`, and `dismissVictoryModal()`.

## Validation

Before finishing code changes, run from `socops/`:

- `./mvnw validate`
- `./mvnw clean package`
- `./mvnw test`

For frontend changes, also start the app with `./mvnw spring-boot:run` and manually verify the lobby, active board, cell selection, free cell, victory overlay, localStorage restoration, keyboard navigation, and responsive layouts at `http://localhost:8080`.
