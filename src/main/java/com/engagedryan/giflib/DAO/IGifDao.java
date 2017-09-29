package com.engagedryan.giflib.DAO;

import com.engagedryan.giflib.model.Gif;

import java.util.List;

public interface IGifDao {

    List<Gif> findAll();
    Gif findById(Long id);
    void save(Gif gif);
    void delete(Gif gif);

}
