
# Exercici API Rest connectada a una altra API Rest

Accedeix a la pàgina ->[https://start.spring.io/](https://start.spring.io/), i genera un projecte Spring boot amb les següents característiques:

PROJECT (gestor de dependències) - Maven o Gradle

LANGUAGE - Java

SPRING BOOT - La darrera versió estable

PROJECT METADATA

Group - cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03

Artifact - S05T0N03GognomsNom

Name - S05T01N03GognomsNom

Description - S05T01N03GognomsNom

Package name - cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03

PACKAGIN - Jar

JAVA - Mínim versió 11

Dependències:

-   Spring Boot DevTools
-   Spring Web

Fent servir **RestTemplate** o **WebClient**, t’hauràs de connectar a l’API que has fet al nivell 2, per cridar i testar totes les peticions que permet aquesta API.

Tingues en compte, que en aquesta tasca del nivell 3, no tens cap referència a cap base de dades, ni necessites fer servir JPA, ja que el teu repositori accedirà a l’API del nivell 2.

No et cal crear una Vista, perquè aquest nivell 3 està previst com una API Rest, però hauràs de crear totes les capes fins al controlador com qualsevol altra aplicació:

- cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.controllers
- cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.domain
- cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.dto
- cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.services
- cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.repository

La classe controladora, haurà de ser capaç d’atendre les següents peticions:

- http://localhost:9002/flor/clientFlorsAdd
- http://localhost:9002/flor/clientFlorsUpdate
- http://localhost:9002/flor/clientFlorsDelete/{id}
- http://localhost:9002/flor/clientFlorsGetOne/{id}
- http://localhost:9002/flor/clientFlorsAll

Com pots veure, a l’arxiu application.properties, hauràs de configurar que el port a usar sigui el 9002.

Per a provar el nivell 3, hauràs de tenir en marxa l’API del nivell 2. No tindràs problemes, ja que l’API del nivell 3 treballa amb el port 9002 i la del nivell 2 amb el port 9001.

**Has d’incloure **swagger** perquè quasevol desenvolupador/a pugui tenir una idea ràpida dels recursos de que disposa l’API.**

Captures de comprobacio:

![t1 n3](https://github.com/christianamor3/SPRINT5-T1N3-SpringBoot-API_Rest-MySQL-WebClient/assets/151139448/c1c4c2ea-13f1-4162-990d-f9aaffc386d1)
![t1 n3 v2](https://github.com/christianamor3/SPRINT5-T1N3-SpringBoot-API_Rest-MySQL-WebClient/assets/151139448/9ed0df9a-f595-441b-9936-4a2fa635c0ea)
![t1 n3 v3](https://github.com/christianamor3/SPRINT5-T1N3-SpringBoot-API_Rest-MySQL-WebClient/assets/151139448/9128260e-51f4-499f-bc62-1ae2d376c4df)
![t1 n3 v4](https://github.com/christianamor3/SPRINT5-T1N3-SpringBoot-API_Rest-MySQL-WebClient/assets/151139448/49a3f94a-a3cd-4f7b-aa52-d589dfc043fb)

