## 📋 Sobre o Projeto

O sistema simula o funcionamento de um **bootcamp de desenvolvimento**, onde desenvolvedores podem se inscrever, consumir conteúdos (cursos e mentorias) e acumular XP (pontos de experiência) conforme avançam no programa.

---

## 🏗️ Estrutura do Projeto

```
src/
└── br/com/dio/desafio/domain/
    ├── Conteudo.java   # Classe abstrata base para conteúdos
    ├── Curso.java      # Representa um curso com carga horária
    ├── Mentoria.java   # Representa uma mentoria com data
    ├── Bootcamp.java   # Agrupa conteúdos e devs inscritos
    └── Dev.java        # Representa um desenvolvedor participante
Main.java               # Classe principal para execução
```

---

## 🧩 Diagrama de Classes

```
          ┌──────────────────┐
          │   <<abstract>>   │
          │    Conteudo      │
          │──────────────────│
          │ # title: String  │
          │ # description    │
          │ # XP_PADRAO=10d  │
          │──────────────────│
          │ + calculateXp()  │
          └────────┬─────────┘
                   │
        ┌──────────┴──────────┐
        │                     │
┌───────▼──────┐     ┌────────▼──────┐
│    Curso     │     │   Mentoria    │
│──────────────│     │───────────────│
│ hourlyLoad   │     │ date          │
│──────────────│     │───────────────│
│ calculateXp()│     │ calculateXp() │
│  = 10*horas  │     │  = XP + 20    │
└──────────────┘     └───────────────┘

┌──────────────────────────┐      ┌─────────────────────────────┐
│        Bootcamp          │      │            Dev              │
│──────────────────────────│      │─────────────────────────────│
│ name: String             │      │ name: String                │
│ description: String      │◄─────│ enteredContents: Set        │
│ initialDate: LocalDate   │      │ completedContents: Set      │
│ finalDate: LocalDate     │      │─────────────────────────────│
│ registeredDevs: Set<Dev> │      │ + subscribeBootcamp()       │
│ contents: Set<Conteudo>  │      │ + progress()                │
└──────────────────────────┘      │ + calculateTotalXp()        │
                                  └─────────────────────────────┘
```

---

## 📁 Descrição das Classes

### `Conteudo` (abstract / sealed)
Classe base selada que define a estrutura comum de todo conteúdo do bootcamp. Só pode ser estendida por `Curso` e `Mentoria`.

| Campo | Tipo | Descrição |
|---|---|---|
| `title` | String | Título do conteúdo |
| `description` | String | Descrição do conteúdo |
| `XP_PADRAO` | double | XP base (10.0) |

### `Curso`
Representa um curso com carga horária. O XP é calculado multiplicando a carga horária pelo XP padrão.

> **Fórmula XP:** `XP_PADRAO × hourlyLoad`

### `Mentoria`
Representa uma mentoria com data agendada. O XP é fixo e acrescenta 20 ao XP padrão.

> **Fórmula XP:** `XP_PADRAO + 20`

### `Bootcamp`
Agrega os conteúdos disponíveis e mantém o registro dos devs inscritos. O bootcamp tem duração de **45 dias** a partir da data de criação.

### `Dev`
Representa um desenvolvedor que pode se inscrever em um bootcamp, progredir pelos conteúdos e acumular XP.

| Método | Descrição |
|---|---|
| `subscribeBootcamp(bootcamp)` | Inscreve o dev e carrega os conteúdos disponíveis |
| `progress()` | Conclui o primeiro conteúdo pendente |
| `calculateTotalXp()` | Soma o XP de todos os conteúdos concluídos |

---

## ▶️ Como Executar

### Pré-requisitos
- Java 17 ou superior (utiliza `sealed classes`, recurso do Java 17+)

### Compilação e execução

```bash
# Compilar todas as classes
javac -d out src/br/com/dio/desafio/domain/*.java src/Main.java

# Executar
java -cp out Main
```

---

## 💡 Conceitos de POO Aplicados

- **Herança** — `Curso` e `Mentoria` herdam de `Conteudo`
- **Abstração** — `Conteudo` é uma classe abstrata com método `calculateXp()` a ser implementado
- **Encapsulamento** — atributos privados/protegidos com getters e setters
- **Polimorfismo** — cada subclasse implementa `calculateXp()` de forma distinta
- **Sealed Classes** (Java 17+) — `Conteudo` restringe suas subclasses permitidas

---

## 📊 Exemplo de Saída

```
Daniel EnteredContents: [Curso{title='Java Course 1'...}, ...]
--------------------------
Daniel EnteredContents: [Curso{title='Java Course 3'...}, Mentoria{...}]
Daniel CompletedContents: [Curso{title='Java Course 1'...}, Curso{title='Java Course 2'...}]
XP: 160.0
===============================================
Gustavo EnteredContents: [Curso{title='Java Course 1'...}, ...]
--------------------------
Gustavo EnteredContents: [Curso{title='Java Course 2'...}, ...]
Gustavo CompletedContents: [Curso{title='Java Course 1'...}]
XP: 80.0
```

---

## 🛠️ Tecnologias

- **Java 17+**
- **IntelliJ IDEA**


Desenvolvido como parte dos desafios práticos da **DIO — Digital Innovation One**.
