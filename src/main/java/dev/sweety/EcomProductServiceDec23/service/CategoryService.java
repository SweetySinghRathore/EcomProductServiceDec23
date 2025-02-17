package dev.sweety.EcomProductServiceDec23.service;

import dev.sweety.EcomProductServiceDec23.dto.CategoryResponseDTO;
import dev.sweety.EcomProductServiceDec23.dto.CreateCategoryRequestDTO;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    CategoryResponseDTO getCategory(UUID categoryId);
    List<CategoryResponseDTO> getAllCategories();
    CategoryResponseDTO createCategory(CreateCategoryRequestDTO categoryRequestDTO);
    CategoryResponseDTO updateCategory(CreateCategoryRequestDTO categoryRequestDTO, UUID categoryId);
    boolean deleteCategory(UUID categoryId);
    double getTotalPriceForCategory(UUID categoryId);
}
