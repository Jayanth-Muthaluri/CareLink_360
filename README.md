# CareLink 360: Integrated Healthcare Ecosystem
### Application Engineering and Development (AED) Final Project | Group 15

CareLink 360 is a multi-enterprise healthcare management platform designed to unify disparate entities—including hospitals, insurance providers, NGOs, donation centers, and government agencies—into a single, streamlined workflow. Built using a modular Java architecture, the system leverages a role-based access control (RBAC) model and WorkQueue-driven processes to facilitate seamless inter-enterprise communication.

---

## Project Overview
The primary objective of CareLink 360 is to bridge communication gaps within the healthcare sector. By centralizing patient requests, insurance verifications, laboratory logistics, and financial assistance programs, the platform ensures data integrity and operational efficiency.

The system is engineered following a rigorous hierarchical structure:
**EcoSystem → Networks → Enterprises → Organizations → Roles → WorkQueues**

---

## Key Features
* **Multi-Enterprise Integration:** Comprehensive modules for Hospital, Insurance, NGO, and Government enterprises.
* **Role-Based Dashboards:** Custom interfaces for diverse stakeholders, including Doctors, Lab Assistants, Patients, Insurance Agents, Accountants, and NGO Coordinators.
* **Workflow Orchestration:** A robust WorkQueue system for request routing, multi-stage approvals, and task processing.
* **Object Persistence:** Implementation of DB4O for efficient storage of networks, enterprises, user credentials, and transactional data.
* **Modular Architecture:** A decoupled design separating the Java Swing UI from core Business Layer logic.
* **Comprehensive Documentation:** Includes detailed UML class diagrams, sequence diagrams, and architectural maps.

---

## Technical Stack
* **Language:** Java
* **Framework:** Java Swing (UI)
* **Persistence:** DB4O (Object-Oriented Database)
* **Design Pattern:** Model-View-Controller (MVC)

---

## Repository Structure
* **/Business:** Core business logic, domain models, role definitions, and workflow management classes.
* **/userinterface:** Java Swing components and UI panels categorized by user role.
* **/db4o:** Database utility classes and persistence configurations.
* **/diagrams:** UML class diagrams and system architecture documentation.
* **/assets:** Project proposals, milestone reports, and presentation materials.

---

## Development Roadmap
The project was executed over a four-week lifecycle to ensure systematic implementation and testing:

1. **Week 1:** Architectural design, UML modeling, and repository initialization.
2. **Week 2:** Development of the Business Layer and core logic.
3. **Week 3:** UI development and cross-enterprise workflow integration.
4. **Week 4:** System testing, bug optimization, and final packaging.

---

## Collaborators
**Northeastern University | Group 15**
* Gagana Ananda
* Syed Hameed Uddin
* Jayanth Muthaluri
* Mallesh Mallikarjunaiah

---

## License
This repository contains an academic project submitted for the Application Engineering and Development (AED) course at Northeastern University. All rights reserved.
