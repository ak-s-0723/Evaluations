package org.example.evaluations.implementation.services;

public interface IKeyVault {
    void saveSecret(String secretName,String secretValue);

    String retrieveSecret(String secretName);
}
