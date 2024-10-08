# Stock Tracker Backend

## Overview
Stock Tracker Backend is a Spring Boot application that provides an API for fetching stock data from external sources. It is designed to work in conjunction with the Stock Tracker Frontend.

## Features
- Fetches real-time stock prices.
- Handles requests for different stock symbols.
- Provides API endpoints for frontend consumption.

## Technologies Used
- **Java**: The programming language used for development.
- **Spring Boot**: Framework for building the backend RESTful API.
- **H2 Database**: In-memory database for quick data storage during development.
- **Maven**: Dependency management and project management tool.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 11 or higher.
- Maven for dependency management.

### Clone the Repository
To get started with the backend project, clone the repository to your local machine:

```
git clone https://github.com/USERNAME/REPOSITORY_NAME.git
cd REPOSITORY_NAME
```

### Build the Project
Navigate to the project directory and build the project using Maven:

```
mvn clean install
```
### Run the Application
You can run the Spring Boot application using the following command:

```
mvn spring-boot:run
```
### Access the API
Open your web browser and go to:
```
http://localhost:8080/api/stocks/{symbol}
```
Replace {symbol} with the stock code you want to fetch.

### Contributing
If you'd like to contribute to this project, please fork the repository and submit a pull request with your changes.

### License
This project is licensed under the MIT License - see the LICENSE file for details.

### Acknowledgments
Thanks to the Spring Boot community for their extensive documentation and support.
