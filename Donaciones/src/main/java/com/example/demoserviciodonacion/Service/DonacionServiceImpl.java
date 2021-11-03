package com.example.demoserviciodonacion.Service;

import com.example.demoserviciodonacion.dao.DonacionDao;
import com.example.demoserviciodonacion.entity.Donacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class DonacionServiceImpl implements IDonacionService {
    @Autowired
    private DonacionDao donacionDao;
    @Override
    @Transactional
    public List<Donacion> findAll(){
        return (List<Donacion>)  donacionDao.findAll();
    }

    @Override
    @Transactional
    public Optional<Donacion> findbyId(Long id) {
        return  donacionDao.findById(id);
    }
    @Override
    @Transactional
    public void save(Donacion donacion) {
        donacionDao.save(donacion);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        donacionDao.deleteById(id);
    }


}
