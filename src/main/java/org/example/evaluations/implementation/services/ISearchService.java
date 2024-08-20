package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.dtos.LinkedInSearchRequest;
import org.example.evaluations.implementation.models.LinkedInSearchItem;

import java.util.List;

public interface ISearchService {
    List<LinkedInSearchItem> searchPeople(LinkedInSearchRequest linkedInSearchRequest);
}
