package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.evaluations.implementation.models.InstallStatus;
import org.example.evaluations.implementation.models.Version;

import java.util.UUID;

@Setter
@Getter
public class InstallResponseDto {
    private InstallStatus status;
    private final Version version = new Version();
    private UUID appId;
}
