package com.worchock.recetascomidas.controller;

import com.worchock.recetascomidas.model.Categories;
import com.worchock.recetascomidas.model.ImageUtil;
import com.worchock.recetascomidas.services.implementacion.CategoriasServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriasController {

    @Autowired
    private CategoriasServicesImp categoriasServicesImp;

    @PostMapping("/guardarCategoria")
    public ResponseEntity<?> uploadImage(@RequestParam("image") MultipartFile file, @RequestParam("idLenguaje") Integer idLenguaje, @RequestParam("nombreCategoria") String nombreCategoria) throws IOException {
        Categories categories = new Categories();
        categories.setIdLenguaje(idLenguaje);
        categories.setNombreCategoria(nombreCategoria);
        categories.setImageData(ImageUtil.compressImage(file.getBytes()));
        categoriasServicesImp.save(categories);

        return ResponseEntity.status(HttpStatus.OK)
                .body("Excelente");
    }

    @GetMapping("/encontrarTodasLasCategorias")
    public List<Categories> findAllCategories(@RequestBody int idLenguaje)throws IOException {
        return categoriasServicesImp.findAllByIdLenguaje(idLenguaje);
    }
}
