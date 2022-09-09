package com.book.artical.Controller;

import com.book.artical.Entity.ArticalDTO;
import com.book.artical.Service.ArticalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ArticalController {
    @Autowired
    private ArticalService articalService;

    @PostMapping("/createArtical")
    public ArticalDTO create(@RequestBody ArticalDTO articalDTO){
        return articalService.create(articalDTO);
    }
    @GetMapping("/getArtical/{id}")
    public ArticalDTO findById(@PathVariable ("id") Integer id){
        return articalService.findById(id);
    }
    @GetMapping("/get")
    public ArrayList<ArticalDTO> getAllId(){
        return articalService.getAllId();
    }
    @PutMapping("/updateArtical/{id}")
    public ArticalDTO update(@PathVariable ("id") Integer id ,@RequestBody ArticalDTO articalDTO){
        return articalService.update(id,articalDTO);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable ("id") Integer id){
        articalService.delete(id);
    }
}
