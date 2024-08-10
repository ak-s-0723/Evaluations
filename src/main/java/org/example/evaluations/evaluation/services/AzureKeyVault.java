package org.example.evaluations.evaluation.services;

public class AzureKeyVault implements IKeyVault {

    @Override
    public void saveSecret(String secretName, String secretValue) {
    }

    @Override
    public String retrieveSecret(String secretName) {
        return null;
    }
}
