# 🎬 Screenmatch

---

![Status](https://img.shields.io/badge/Status-Concluído-green)
![Linguagem](https://img.shields.io/badge/Linguagem-Java-red)
![IDE](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-blue)


---

## ✨ Visão Geral do Projeto

**Screenmatch** é um projeto desenvolvido em Java para praticar **Orientação a Objetos (POO)**, cálculos simples, herança e polimorfismo.  
Ele simula uma plataforma de streaming com filmes e séries, permitindo trabalhar com:

- Classes e herança (`Filme`, `Serie`, `Titulo`)
- Avaliações e cálculo de médias
- Cálculo de duração total para maratonas
- Recomendações automáticas com base em notas ou visualizações
- Criação e exibição de episódios associados a uma série

> 📝 **Nota:** Trata-se de uma aplicação simples em linha de comando, focada em lógica e estruturação de código.

---

## 🚀 Como Rodar o Projeto

1. **Clone o repositório:**

   ```bash
   git clone "https://github.com/Jullya-Nigro07/screenmatch.git"
    ```

2. Abra no IDE:
    Abra o projeto no **IntelliJ IDEA** (ou qualquer IDE com suporte a Java).


3. Compile e execute:
Rode a classe principal **Main** para testar os cálculos, avaliações e recomendações.

---

### 📁 Estrutura do projeto


        src/
        └── br.com.screenmatch/
                ├── calculos/     
                │   ├── CalculadoraDeTempo.java
                │   ├── Classificavel.java
                │   └── FilmeRecomendacao.java
                │
                ├── modelos
                │    ├── Titulo.java
                │    ├── Filme.java
                │    ├── Serie.java
                │    └── Episodio.java
                │
                ├── principal/
                     ├── Main.java

---

## ✅ Funcionalidades Principais

### 🎥 Filmes
- Criar filmes com nome e ano
- Definir duração
- Avaliar várias vezes
- Calcular média de avaliações
- Classificação automática via interface **Classificavel**
- Exibir ficha técnica

---

### 📺 Séries
- Criar séries com nome e ano
- Definir temporadas, episódios e duração por episódio
- Cálculo automático da duração total da série
- Definir total de visualizações
- Classificação automática baseada em visualizações
- Exibir ficha e recomendação

---

### 🎞️ Episódios

Criar episódios com:

- Número do episódio
- Nome do episódio
- Série associada
- Exibir descrição completa do episódio.

---

### ⏱️ Calculadora de Maratona

- Somar o tempo total de filmes e séries
- Exibir a duração total acumulada

---

### ⭐ Sistema de Recomendação

A classe **FilmeRecomendacao** retorna mensagens como:

- "Não temos avaliações sufientes"
- "Não é muito avaliado"
- "Boa avaliação!"
- "Muito bem avaliado!"
- "Top 10 da plataforma!"

Ou uma mensagem padrão "Nenhuma classificação" caso não se enquadre em nenhuma regra.

---

### 🧑‍💻 Tecnologias e Conceitos

- Java
- POO (Herança, Encapsulamento, Polimorfismo)
- Interfaces
- Organização do projeto em pacotes
- Listas e iterações com `ArrayList`
- Override de métodos (`toString)
