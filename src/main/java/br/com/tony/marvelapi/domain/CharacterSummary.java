package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CharacterSummary {
    private final String resourceURI;
    private final String name;
    private final String role;
}
