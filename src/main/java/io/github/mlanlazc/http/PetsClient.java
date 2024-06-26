// This file was generated by liblab | https://liblab.com/

package io.github.mlanlazc.http;

import io.github.mlanlazc.exceptions.ApiException;
import java.util.List;

public interface PetsClient {
  java.util.List<io.github.mlanlazc.models.Pet> listPets(Integer limit) throws ApiException;
  String createPets(io.github.mlanlazc.models.Pet input) throws ApiException;
  io.github.mlanlazc.models.Pet showPetById(String petId) throws ApiException;
}
