package com.worchock.recetascomidas.controller;

import com.worchock.recetascomidas.model.Categories;
import com.worchock.recetascomidas.model.ImageUtil;
import com.worchock.recetascomidas.services.implementacion.CategoriasServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/categorias")
public class CategoriasController {

    @Autowired
    private CategoriasServicesImp categoriasServicesImp;

    @PostMapping
    public ResponseEntity<?> uploadImage(@RequestParam("image") MultipartFile file, @RequestBody Categories categories) throws IOException {
        categories.setImageData(ImageUtil.compressImage(file.getBytes()));
        categoriasServicesImp.save(categories);

        return ResponseEntity.status(HttpStatus.OK)
                .body("Excelente");
    }
}
