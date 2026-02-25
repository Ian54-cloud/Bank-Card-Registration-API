# Bank-Card-Registration-API
A RESTful backend application built with Spring Boot that handles bank card registration, validation, and in-memory storage.  This project demonstrates the implementation of a layered architecture (Controller–Service–Model) and server-side validation logic for sensitive financial data such as card number, CVV, PIN, and cardholder name.

# Core Features

REST API endpoints for:

Registering bank cards (POST /banks/cards)

Retrieving stored cards (GET /banks/cards)

Deleting card records (DELETE /banks/cards)

# Input validation for:

16-digit card number

4-digit CVV

4-digit PIN

Non-empty cardholder name


Built with:

Java 17

Spring Boot (Web MVC)

Maven

## Architecture

Controller Layer – Handles HTTP requests and routes

Service Layer – Contains business logic and validation rules

Model Layer – Encapsulates card data

## Purpose

This project was built to strengthen understanding of:

REST API design principles

Backend validation patterns

Layered application architecture in Spring Boot

Handling structured JSON requests and response
