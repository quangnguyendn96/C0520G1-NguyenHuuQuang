package quang.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quang.company.model.Picture;
import quang.company.repository.PictureRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PictureServiceImp implements PictureService {
    @Autowired
    PictureRepository pictureRepository;

    @Override
    public void save(Picture picture) {
        pictureRepository.save(picture);
    }

    @Override
    public List<Picture> findAll() {
        return pictureRepository.findAll();
    }

    @Override
    public Picture findById(int id) {
        return pictureRepository.findById(id).orElse(null);
    }

    public List<String> prohibit() {
        List<String> list = new ArrayList<>();
        list.add("cet");
        list.add("lon");
        list.add("dmm");
        list.add("dkm");
        return list;
    }
}
