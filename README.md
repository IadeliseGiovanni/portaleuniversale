# ⚙️ Portale Universale - Backend (Spring Boot)

Questa è l'API REST sviluppata in Java per la gestione del sistema scolastico.

## 🛠️ Tecnologie
* **Java 17 / Spring Boot 3**
* **Spring Data JPA**: Per la gestione del database.
* **PostgreSQL**: Database relazionale.
* **ModelMapper**: Per la conversione tra Entity e DTO.

## 📁 Endpoints Principali
* `GET /api/scuola/all`: Recupera tutti gli studenti.
* `POST /api/scuola/save`: Salva un nuovo studente.
* `PUT /api/scuola/update/{id}`: Modifica uno studente esistente.
* `DELETE /api/scuola/delete/{id}`: Elimina uno studente.

## ⚙️ Configurazione
Assicurati di configurare le credenziali del database nel file `src/main/resources/application.properties` prima di avviare l'applicazione.
