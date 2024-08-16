package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.evaluations.implementation.models.CheckUpdateStatus;
import org.example.evaluations.implementation.models.Version;

import java.util.UUID;

@Setter
@Getter
public class CheckUpdateResponseDto {
    private UUID appId;
    private CheckUpdateStatus status;
    private Version version;
}
