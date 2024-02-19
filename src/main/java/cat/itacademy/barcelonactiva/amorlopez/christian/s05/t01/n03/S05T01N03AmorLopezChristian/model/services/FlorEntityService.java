package cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n03.S05T01N03AmorLopezChristian.model.services;

import cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n03.S05T01N03AmorLopezChristian.model.dto.FlorEntityDTO;

import java.util.List;

public interface FlorEntityService {

    FlorEntityDTO createFlor (FlorEntityDTO florEntityDTO);

    FlorEntityDTO updateFlor (int id, FlorEntityDTO florEntityDTO);

    String deleteFlor(int id);

    FlorEntityDTO getOneFlor(int id);

    List<FlorEntityDTO> getAllFlor();
}
