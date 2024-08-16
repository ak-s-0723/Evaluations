package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.InstallRequestDto;
import org.example.evaluations.implementation.dtos.InstallResponseDto;
import org.example.evaluations.implementation.models.InstallStatus;
import org.example.evaluations.implementation.services.IDeployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/installs")
public class InstallsController {

    @Autowired
    private IDeployService deployService;

    @PostMapping
    public InstallResponseDto install(@RequestBody InstallRequestDto installRequestDto) {
        if(installRequestDto.getAppId() == null) {
            throw new IllegalArgumentException("AppId is null");
        }

        UUID appId = installRequestDto.getAppId();
        InstallStatus installStatus = deployService.install(appId);
        InstallResponseDto installResponseDto = new InstallResponseDto();
        installResponseDto.setStatus(installStatus);
        installResponseDto.setAppId(appId);
        return  installResponseDto;
    }
}
