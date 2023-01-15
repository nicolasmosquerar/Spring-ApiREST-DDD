
# Basic project using bancolombia scaffold for clean architecture

if you want more information you can read the official article  [Clean Architecture  Aislando los detalles](https://medium.com/bancolombia-tech/clean-architecture-aislando-los-detalles-4f9530f35d7a)

# Architecture

![Clean Architecture](https://miro.medium.com/max/1400/1*ZdlHz8B0-qu9Y-QO3AXR_w.png)

## Domain

### Models

This is the innermost module of this architecture, it belongs to the domain layer and has the logic and bussines rules using models entities 


### Usecases

This module belongs to domain layer too, it implements the use cases of the systems and define the bussines logic of the application and reacting to the invocations of the entry points

## Infrastructure


### Driven Adapters

Driven adapters represent external implementations of our system, like external rest conections, soap, databases, plain text readings and whatever data sources that we need to interact with our application.


### Entry Points

The entry points represent  the place in the application where the execution of the program begins


## Application

This is the outermost module of the architecture, it resolve all the dependencies and create the beans of the use case automatically, injecting those ones in concret implementations,besides this, it start the application.

=======
# Spring-ApiREST-DDD
This is a simple implementation of a REST API in springBoot using DDD

