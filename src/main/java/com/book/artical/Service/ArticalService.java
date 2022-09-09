package com.book.artical.Service;

import com.book.artical.DAO.ArticalDAO;
import com.book.artical.Entity.ArticalDTO;
import com.book.artical.Repository.ArticalRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArticalService {
    @Autowired
    private ArticalRepository articalRepository;
    private ModelMapper modelMapper = new ModelMapper();
    public ArticalDTO convertDAOtoDTO(ArticalDAO articalDAO){
        return modelMapper.map(articalDAO ,ArticalDTO.class);
    }
    public ArticalDAO convertDTOtoDAO(ArticalDTO articalDTO){
        return modelMapper.map(articalDTO,ArticalDAO.class);
    }
//    create
    public ArticalDTO create(ArticalDTO articalDTO){
        ArticalDAO articalDAO = this.convertDTOtoDAO(articalDTO);
        articalDAO.setId(articalDAO.getId());
        articalDAO = articalRepository.save(articalDAO);
        return modelMapper.map(articalDAO,ArticalDTO.class);
    }
    //get by id
    public ArticalDTO findById(int id){
        Optional<ArticalDAO> articalDAO = articalRepository.findById(id);
        return modelMapper.map(articalDAO,ArticalDTO.class);
    }
    public ArrayList<ArticalDTO> getAllId(){
        List<ArticalDAO> articalDAOList = articalRepository.findAll();
        ArrayList<ArticalDTO> arrayList = new ArrayList<>();
        for(ArticalDAO articalDAO : articalDAOList){
            arrayList.add(modelMapper.map(articalDAO,ArticalDTO.class));
        }
        return arrayList;
    }
    public ArticalDTO update(Integer id,ArticalDTO articalDTO){

        ArticalDAO articalDAO = this.convertDTOtoDAO(articalDTO);
        articalDAO.setId(id);
        articalDAO = articalRepository.save(articalDAO);
        return modelMapper.map(articalDAO,ArticalDTO.class);
    }
    public void delete(Integer id){
        articalRepository.deleteById(id);
    }
}
