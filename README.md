# Netflix Clone (Angular + Java)

A full-stack Netflix-inspired clone with:

- **Frontend:** Angular (standalone components)
- **Backend:** Java 17 + Spring Boot REST API

## Project structure

- `frontend/` Angular app for the UI
- `backend/` Spring Boot API for catalog and subscription endpoints

## Backend setup

```bash
cd backend
./mvnw spring-boot:run
```

If Maven Wrapper is not present, use:

```bash
mvn spring-boot:run
```

Backend runs at `http://localhost:8080`.

## Frontend setup

```bash
cd frontend
npm install
npm start
```

Frontend runs at `http://localhost:4200` and proxies `/api` requests to the backend.

## API endpoints

- `GET /api/titles/trending`
- `GET /api/titles/popular`
- `POST /api/subscriptions` with body `{ "email": "name@example.com" }`
