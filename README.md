PersBank is a modular, cloud-ready banking backend designed to model the core primitives of a retail banking system. It implements domain-driven concepts such as customers, accounts, transactions, and fund transfers, while demonstrating best practices in API design, consistency guarantees, and service decomposition.

🚀 **Features**

**Core Banking Domain**

Customer creation and management

Account lifecycle management (open, close, suspend)

Ledger-based balance model (available vs. booked balance)

Transaction listing and retrieval

Internal funds transfer with validation


**Technical Features**

Java 17 + Spring Boot microservices

Domain-driven design (DDD) applied to a fintech context

RESTful APIs with proper HTTP semantics

Exception handling, validation, and error contracts

Dockerized for easy development

Modular architecture separating domain, infrastructure, and API layers


**Data Consistency**

Atomic fund transfers

Idempotency patterns (design included for future expansion)

Prevention of double spending

Audit-friendly transaction model