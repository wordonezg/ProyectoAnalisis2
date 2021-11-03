package com.example.servicebodega.interfaces;

import com.example.servicebodega.modelo.Bodega;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBodega extends CrudRepository<Bodega, Integer> {

}
