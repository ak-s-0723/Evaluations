package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.InstallStatus;
import org.example.evaluations.implementation.models.UpdateStatus;
import org.example.evaluations.implementation.models.Version;

import java.util.UUID;

public interface IDeployService {
    InstallStatus install(UUID appId);

    UpdateStatus update(UUID appId, String version);

    Version getLatestVersion(UUID appId, String installedVersion);
}
