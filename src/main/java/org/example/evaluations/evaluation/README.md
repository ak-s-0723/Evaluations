# Creating Tables for different types of Employees present in Scaler

## Requirements

You are provided with Model Classes for different types of Employees. 

As you guys are aware that, Instructor and Ta are hired on contract basis normally while SoftwareDeveloper and ProgramManager have more defined need and charter

You need to make sure that Tables are created for all concrete classes and characteristics of Superclass will be used in all inherited classes throughout Hierarchy.

`PermanentEmployee` will contain data for full-time employees other than SoftwareDeveloper and ProgramManager.
`ContractualEmployee` will contain data for all part-time employees other than Instructor and Ta.

So we want tables for them as well.

Moreover Instructor and Ta will also have fields applicable for all Contractual Employees and SoftwareDeveloper and ProgramManager will also have fields applicable for all PermanentEmployees.

Note - PK for ContractualEmployees will be alias and for PermanentEmployees will be email.

## Testing

You can also check which tables with what fields are created in H2 by running Application in IntellIJ and opening  `http://localhost:8080/h2-console` on browser and put values as below
- Saved Settings: `Generic H2(Embedded)`
- Setting Name: `Generic H2(Embedded)`
- Driver Class: `org.h2.Driver`
- JDBC URL: `jdbc:h2:mem:class10_ques5`
- User Name: `sa`
- Password: `password`
- click Connect

## Hints

- Nothing is needed from your side in pom.xml or application.properties
- No new file need to be created.
- No new field need to be added, No field need to be removed or modified.
- If you will try to run testcases without defining relations, all Testcases will fail.