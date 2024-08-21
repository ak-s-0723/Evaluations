package org.example.evaluations.implementation.dtos;

import lombok.Data;
import org.example.evaluations.implementation.models.News;

import java.util.List;

@Data
public class RealTimeNewsData {
    private List<News> news;
}
