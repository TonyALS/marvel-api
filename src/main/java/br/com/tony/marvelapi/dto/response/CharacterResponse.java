package br.com.tony.marvelapi.dto.response;

import br.com.tony.marvelapi.domain.ComicList;
import br.com.tony.marvelapi.domain.EventList;
import br.com.tony.marvelapi.domain.SeriesList;
import br.com.tony.marvelapi.domain.StoryList;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Builder
@Getter
public final class CharacterResponse {
    @JsonProperty(value = "id")
    private final Long id;

    @JsonProperty(value = "name")
    private final String name;

    @JsonProperty(value = "description")
    private final String description;

    @JsonProperty(value = "modified")
    private final LocalDateTime modified = LocalDateTime.now();

    @JsonProperty(value = "thumbnail")
    private final ImageResponse imageResponse;

    @JsonProperty(value = "resourceURI")
    private final String resourceURI;

    @JsonProperty(value = "comics")
    private final ComicList comicList;

    @JsonProperty(value = "series")
    private final SeriesList seriesList;

    @JsonProperty(value = "stories")
    private final StoryList storyList;

    @JsonProperty(value = "events")
    private final EventList eventList;

    @JsonProperty(value = "urls")
    private final List<UrlResponse> urlResponses;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharacterResponse that = (CharacterResponse) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(imageResponse, that.imageResponse) && Objects.equals(resourceURI, that.resourceURI) && Objects.equals(comicList, that.comicList) && Objects.equals(seriesList, that.seriesList) && Objects.equals(storyList, that.storyList) && Objects.equals(eventList, that.eventList) && Objects.equals(urlResponses, that.urlResponses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, imageResponse, resourceURI, comicList, seriesList, storyList, eventList, urlResponses);
    }
}
