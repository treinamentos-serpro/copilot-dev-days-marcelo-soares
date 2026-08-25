# Soc Ops Agent Guide

## Mandatory checklist

Before finishing any code change, run from `socops/`:

- [ ] Lint/validation: `./mvnw validate`
- [ ] Build: `./mvnw clean package`
- [ ] Tests: `./mvnw test`

## Project

Soc Ops is a Spring Boot 3.4.2 social bingo game using Java 21. The backend serves a Thymeleaf page and a JSON endpoint; the browser owns game state.

- Entry point: [`SocOpsApplication.java`](socops/src/main/java/com/socops/SocOpsApplication.java)
- HTTP boundary: [`BingoRestController.java`](socops/src/main/java/com/socops/web/BingoRestController.java)
- Domain rules: [`BoardAssembler.java`](socops/src/main/java/com/socops/service/BoardAssembler.java)
- Models/data: [`BingoCell.java`](socops/src/main/java/com/socops/model/BingoCell.java), [`WinningStreak.java`](socops/src/main/java/com/socops/model/WinningStreak.java), [`PlayPhase.java`](socops/src/main/java/com/socops/model/PlayPhase.java), [`IcebreakerPrompts.java`](socops/src/main/java/com/socops/data/IcebreakerPrompts.java)
- Browser UI: [`game.html`](socops/src/main/resources/templates/game.html)
- Styles: [`app.css`](socops/src/main/resources/static/css/app.css)

Run locally with `./mvnw spring-boot:run` at `http://localhost:8080`. Prefer the Maven Wrapper and the existing VS Code tasks.

## Rules for changes

- Keep `BoardAssembler` stateless and preserve its copy/new-list behavior.
- Board positions are `0`-`24`; position `12` is a pre-selected, non-toggleable free cell.
- Keep at least 24 prompts in `IcebreakerPrompts`; new prompts must be inclusive, respectful, low-risk conversation starters. See [`quiz-master.agent.md`](.github/agents/quiz-master.agent.md).
- Winning rules exist in Java and `scanForStreak` in `game.html`; update both together.
- The browser persists `socops-bingo-snapshot` in `localStorage`; the backend does not store games.
- Add focused domain tests in [`BoardAssemblerTests.java`](socops/src/test/java/com/socops/service/BoardAssemblerTests.java). Controller, HTTP, template and JavaScript tests are not currently automated, so manually verify those surfaces.
- For CSS/frontend work, follow [`css-utilities.instructions.md`](.github/instructions/css-utilities.instructions.md) and [`frontend-design.instructions.md`](.github/instructions/frontend-design.instructions.md).

## References

Use existing documentation rather than duplicating it: [`README.md`](README.md), [`README.pt_BR.md`](README.pt_BR.md), [`workshop/GUIDE.md`](workshop/GUIDE.md), [`workshop/01-setup.md`](workshop/01-setup.md), [`workshop/02-design.md`](workshop/02-design.md), [`workshop/03-quiz-master.md`](workshop/03-quiz-master.md), [`workshop/04-multi-agent.md`](workshop/04-multi-agent.md), [`CONTRIBUTING.md`](CONTRIBUTING.md), and [`SECURITY.md`](SECURITY.md).
