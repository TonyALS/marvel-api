package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class Story {
    private final Long id;
    private final Integer available;
    private final Integer returned;
    private final String collectionURI;
    private final List<StorySummary> items;
}
