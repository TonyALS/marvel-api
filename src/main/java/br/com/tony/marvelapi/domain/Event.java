package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
public class Event {
    private final Long id;
    private final String title;
    private final String description;
    private final String resourceURI;
    private final List<Url> urls;
    private final LocalDateTime modified = LocalDateTime.now();
    private final LocalDate start = LocalDate.now();
    private final LocalDate end = LocalDate.now().plusDays(3L);
    private final Image thumbnail;
    private final ComicList comicList;
    private final StoryList storyList;
    private final SeriesList seriesList;
    private final CharacterList characterList;
    private final CreatorList creatorList;
    private final EventSummary next;
    private final EventSummary previous;
    private final Integer available;
    private final Integer returned;
    private final String collectionURI;
    private final List<EventSummary> items;
}
