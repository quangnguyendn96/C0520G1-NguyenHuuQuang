package quang.company.service;

import quang.company.model.Picture;

import java.util.List;

public interface PictureService {
    void save(Picture picture);
    public List<Picture> findAll();
    Picture findById(int id);
    List<String> prohibit();
}
