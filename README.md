<div align="center">

# 🎲 Soc Ops

**Social Bingo for in-person mixers — powered by GitHub Copilot**

Find people who match the prompts. Get 5 in a row. Break the ice.

[![Live Demo](https://img.shields.io/badge/🎮_Live_Demo-4A90E2?style=for-the-badge)](https://copilot-dev-days.github.io/agent-lab-java/)
[![Lab Guide](https://img.shields.io/badge/📚_Lab_Guide-5C6BC0?style=for-the-badge)](workshop/GUIDE.md)
[![Java 21](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.2-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)

🌐 [Português (BR)](README.pt_BR.md) | [Español](README.es.md)

</div>

---

## ✨ What is Soc Ops?

Soc Ops is a **social bingo game** built for workshops and in-person events. Each card has 25 icebreaker prompts — mingle with the room to find people who match, mark them off, and race to 5 in a row.

It's also a **hands-on Copilot lab**: you'll use GitHub Copilot Agents to redesign the UI, generate custom quiz themes, and build new features end-to-end — all inside VS Code.

---

## 🗺️ Lab Guide

Work through the lab in order, or jump to any part:

| Part | Title | Time |
|:----:|-------|:----:|
| [**00**](workshop/00-overview.md) | Overview & Checklist | — |
| [**01**](workshop/01-setup.md) | Setup & Context Engineering | 15 min |
| [**02**](workshop/02-design.md) | Design-First Frontend | 15 min |
| [**03**](workshop/03-quiz-master.md) | Custom Quiz Master | 10 min |
| [**04**](workshop/04-multi-agent.md) | Multi-Agent Development | 20 min |

> 📝 Lab guides are also available in the [`workshop/`](workshop/) folder for offline reading.

---

## 🚀 Quick Start

**Prerequisites:** [Java 21 JDK](https://adoptium.net/) · [Maven 3.9+](https://maven.apache.org/) · VS Code v1.107+ with GitHub Copilot

```bash
# Clone and run
git clone <your-repo-url>
cd socops
./mvnw spring-boot:run
# → Open http://localhost:8080
```

```bash
# Build
./mvnw clean package

# Test
./mvnw test
```

> **Tip:** Open the repo in a [GitHub Codespace](https://codespaces.new) for a zero-install experience.

---

## 🏗️ Tech Stack

| Layer | Technology |
|-------|-----------|
| Backend | Spring Boot 3.4.2, Java 21 |
| Templates | Thymeleaf |
| Frontend | Vanilla JS, Custom CSS utilities |
| Deploy | GitHub Pages (auto on push to `main`) |

---

## 🤝 Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md) and [SECURITY.md](SECURITY.md).
