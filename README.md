# 🏋️‍♂️ Spartans Supplements API ⚔️

![Java](https://img.shields.io/badge/Java-Backend-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![API](https://img.shields.io/badge/API-REST-green?style=for-the-badge)
![SOLID](https://img.shields.io/badge/SOLID-Architecture-blue?style=for-the-badge)
![Render](https://img.shields.io/badge/Deploy-Render-purple?style=for-the-badge)

---

# 🚀 Sobre o Projeto

A **Spartans Supplements API** é um projeto de **backend** desenvolvido para fornecer dados e funcionalidades para um aplicativo mobile (Android).

O sistema segue os princípios **SOLID**, garantindo um código:

✅ Organizado  
✅ Escalável  
✅ Fácil de manter  
✅ Desacoplado  

A API foi desenvolvida para ser consumida por um app feito no **Android Studio**.

---

# 🎯 Objetivo

Criar uma **API REST** robusta para:

✔ Gerenciar produtos (suplementos)  
✔ Fornecer dados para o app mobile  
✔ Centralizar regras de negócio no backend  
✔ Permitir evolução futura do sistema  

---

# 🧠 Arquitetura (SOLID)

O projeto foi estruturado seguindo boas práticas de arquitetura:

### 🧩 Controller
Responsável por expor os **endpoints da API**.

📌 Aqui o frontend faz requisições HTTP (GET, POST, PUT, DELETE)

---

### ⚙ Service
Contém a **lógica de negócio**.

📌 Processa dados antes de enviar para o controller

---

### 🗄 Repository
Responsável pela **comunicação com o banco de dados**

📌 CRUD e persistência

---

### 📦 Model
Representa as **entidades do sistema**

📌 Ex: Produto, Usuário, Pedido

---

### 🔁 Princípios SOLID aplicados

✔ **S - Single Responsibility** → cada classe tem uma única função  
✔ **O - Open/Closed** → código aberto para extensão  
✔ **L - Liskov Substitution** → uso correto de herança  
✔ **I - Interface Segregation** → interfaces específicas  
✔ **D - Dependency Inversion** → uso de abstrações  

---

# 🌐 Endpoints da API

Os endpoints estão localizados na camada **Controller**.

Exemplos:

```http
GET /produtos
POST /produtos
GET /produtos/{id}
PUT /produtos/{id}
DELETE /produtos/{id}
```

📌 Esses endpoints são consumidos pelo app mobile.

---

# 📱 Integração com o Frontend

O frontend foi desenvolvido no:

📱 **Android Studio**

A comunicação acontece via:

- 🌐 HTTP Requests  
- 📄 JSON  

📌 O app consome os dados diretamente da API.

---

# ☁️ Deploy

A API foi publicada na nuvem utilizando:

🚀 **Render**

Isso permite:

✔ Acesso remoto à API  
✔ Integração com o app mobile  
✔ Ambiente online para testes  

---

# 🛠 Tecnologias Utilizadas

- ☕ **Java (Backend)**
- 🌐 **API REST**
- 📄 **JSON**
- 🧠 **Arquitetura SOLID**
- ☁️ **Render (Deploy)**
- 📱 **Android Studio (Frontend)**

---

# ▶️ Como Rodar o Projeto

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/seu-repositorio/spartans-supplements-api.git
```

---

### 2️⃣ Abrir na IDE

💻 IntelliJ IDEA  
💻 VS Code  

---

### 3️⃣ Rodar a aplicação

Execute a classe principal do projeto.

---

# 👨‍💻 Autores

Desenvolvido por:

Leandro. F Lima,
José P. Torres e 
André M. Pereira

---

# ⭐ Conclusão

A **Spartans Supplements API** demonstra na prática a criação de um backend bem estruturado, utilizando:

✔ Princípios SOLID  
✔ Arquitetura em camadas  
✔ Integração com frontend mobile  
✔ Deploy em nuvem  

---

🔥 Projeto ideal para evoluir como desenvolvedor backend e construir sistemas reais!
