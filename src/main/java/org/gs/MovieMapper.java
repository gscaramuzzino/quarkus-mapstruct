package org.gs;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi")
public interface MovieMapper {

  // --- DAO to DTO
  @Mapping(target = "promotion", expression = "java(movie.getTitle() + ' ' + movie.getDirector())")
  MovieDTO toDTO(Movie movie);

  // -- DTO to DAO
  @Mapping(target="id", ignore=true)
  Movie toDAO(MovieDTO movieDTO);
}
