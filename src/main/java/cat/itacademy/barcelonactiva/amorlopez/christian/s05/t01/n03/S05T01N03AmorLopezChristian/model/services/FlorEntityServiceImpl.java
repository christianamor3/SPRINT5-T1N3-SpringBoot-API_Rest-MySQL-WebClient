package cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n03.S05T01N03AmorLopezChristian.model.services;

import cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n03.S05T01N03AmorLopezChristian.model.dto.FlorEntityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.util.List;

@Service
public class FlorEntityServiceImpl implements FlorEntityService {

    @Autowired
    private WebClient webClient;


    @Override
    public FlorEntityDTO createFlor(FlorEntityDTO florEntityDTO) {
      try {
    	  return webClient // Nos devuelve la conexion con la API de puerto 9001.
    			  .post() // Tipo de consulta que le hacemos a la API de 9001.
    			  .uri("/flor/add") // URI que necesitamos para hacer la consulta.
    			  .bodyValue(florEntityDTO) // Parametros que necesita la consulta
    			  .retrieve()
    			  .bodyToMono(FlorEntityDTO.class)
    			  .block();
      } catch (WebClientResponseException wcre) {
    	  System.out.println(wcre.getResponseBodyAsString());
    	  throw new RuntimeException("Error al cargar la flor");
      } catch (RuntimeException rte) {
    	  System.out.println(rte.getMessage());
    	  throw new RuntimeException("Error al cargar la flor");
      }
    }

    @Override
    public FlorEntityDTO updateFlor(int id, FlorEntityDTO florEntityDTO) {
    	try {
    		return webClient
    				.put()
    				.uri("/flor/update/{id}", id)
    				.bodyValue(florEntityDTO)
    				.retrieve()
    				.bodyToMono(FlorEntityDTO.class)
    				.block();
    	} catch (WebClientResponseException wcre) {
      	  System.out.println(wcre.getResponseBodyAsString());
      	  throw new RuntimeException("Error al cargar la flor");
        } catch (RuntimeException rte) {
      	  System.out.println(rte.getMessage());
      	  throw new RuntimeException("Error al cargar la flor");
        }
      }

    @Override
    public String deleteFlor(int id) {
    	try {
    		return webClient
    				.delete()
    				.uri("/flor/delete/{id}", id)
    				.retrieve()
    				.bodyToMono(String.class)
    				.block();
    	} catch (WebClientResponseException wcre) {
      	  System.out.println(wcre.getResponseBodyAsString());
      	  throw new RuntimeException("Error al cargar la flor");
        } catch (RuntimeException rte) {
      	  System.out.println(rte.getMessage());
      	  throw new RuntimeException("Error al cargar la flor");
        }
      }

    @Override
    public FlorEntityDTO getOneFlor(int id) {
    	try {
    		return webClient
    				.get()
    				.uri("/flor/getOne/{id}", id)
    				.retrieve()
    				.bodyToMono(FlorEntityDTO.class)
    				.block();
    	} catch (WebClientResponseException wcre) {
      	  System.out.println(wcre.getResponseBodyAsString());
      	  throw new RuntimeException("Error al cargar la flor");
        } catch (RuntimeException rte) {
      	  System.out.println(rte.getMessage());
      	  throw new RuntimeException("Error al cargar la flor");
        }
      }

    @Override
    public List<FlorEntityDTO> getAllFlor() {
    	try {
    		return webClient
    				.get()
    				.uri("/flor/getAll")
    				.retrieve()
    				.bodyToFlux(FlorEntityDTO.class)
    				.collectList()
    				.block();
    	} catch (WebClientResponseException wcre) {
      	  System.out.println(wcre.getResponseBodyAsString());
      	  throw new RuntimeException("Error al cargar la flor");
        } catch (RuntimeException rte) {
      	  System.out.println(rte.getMessage());
      	  throw new RuntimeException("Error al cargar la flor");
        }
      }
}
