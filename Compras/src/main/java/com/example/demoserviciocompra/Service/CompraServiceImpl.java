package com.example.demoserviciocompra.Service;

import com.example.demoserviciocompra.dao.CompraDao;
import com.example.demoserviciocompra.entity.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CompraServiceImpl implements ICompraService {
    @Autowired
    private CompraDao compraDao;
    @Override
    @Transactional
    public List<Compra> findAll(){
        return (List<Compra>)  compraDao.findAll();
    }

    @Override
    @Transactional
    public Optional<Compra> findbyId(Long id) {
        return  compraDao.findById(id);
    }
    @Override
    @Transactional
    public void save(Compra compra) {
        compraDao.save(compra);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        compraDao.deleteById(id);
    }


}
