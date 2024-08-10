# Achieve Dependency Injection using @Qualifier annotation

## You project requires use of KeyVault and you need to add functionality in both AzureKeyVault and GoogleKeyVault so that they can be used in respective controllers

## Requirements
You need to complete saveSecret and retrieveSecret functions in both KeyVaults and use them in respective controllers to achieve Dependency Injection using @Qualifier

1. In AzureKeyVault, use TreeMap to internally save and retrieve secrets.
2. In GoogleKeyVault, use HashMap to internally save and retrieve secrets.
3. Annotate Both GoogleKeyVault and AzureKeyVault with correct spring annotation so that Spring will be able to create bean(singleton object) for them.
4. After completing above methods, You need to inject AzureKeyVault in AzureController and GoogleKeyVault in GoogleController with use of Spring @Qualifier annotation.

