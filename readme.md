MySQL Database
localhost:3306
User:peter
PW ...

Alternative H2 Datenbank:
- in jpa-config.xml
- Suche nach "ALTERNATIVE_H2"
- Kommentare herausnehmen und Kommentare für MySQL hinzufügen, an den Stellen:
    - <bean id="dataSource"
    - <prop key="hibernate.dialect">