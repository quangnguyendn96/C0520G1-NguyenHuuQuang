package quang.company.service;

import quang.company.model.Picture;
import quang.company.repository.PictureRepository;
import quang.company.repository.PictureRepositoryImp;

import java.util.List;

public class PictureServiceImp implements PictureService {
PictureRepository pictureRepository = new PictureRepositoryImp();
    @Override
    public void save(Picture picture) {
        pictureRepository.save(picture);
    }

    @Override
    public List<Picture> findAll() {
        return pictureRepository.findAll();
    }

}
