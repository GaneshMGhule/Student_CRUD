# Student CRUD Application - Hibernate Integration

This project uses **Hibernate** as the ORM (Object-Relational Mapping) framework to manage database operations for the Student entity.

## Hibernate Overview

Hibernate simplifies database interactions by mapping Java classes to database tables using annotations and JPA (Java Persistence API).

### Key Annotations Used

- `@Entity`: Marks the Student class as a persistent Java class.
- `@Id`: Specifies the primary key of the entity.
- `@GeneratedValue`: Configures auto-generation strategy for IDs.
- `@Column`: Maps class fields to columns in the database table.

### Configuration

Hibernate is configured through **Spring Data JPA** in `application.properties`:

```properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

**## Screenshots**
#Student list
<img width="949" alt="image" src="https://github.com/user-attachments/assets/998a30de-168f-4c07-a2e6-7fd38f327d58" />
#Student Registration Page
<img width="953" alt="image" src="https://github.com/user-attachments/assets/604c2594-df1a-4f8c-be96-1bfe93523efa" />

#Student Update Page.
<img width="950" alt="image" src="https://github.com/user-attachments/assets/89ef14bf-8518-4edc-97a1-b4d4a12f5e29" />



