package quang.company.repository;


import org.hibernate.Session;
import org.hibernate.Transaction;
import quang.company.model.Picture;
import quang.company.repository.ConnectionUtil;

import java.util.List;

public class PictureRepositoryImp implements PictureRepository {

    @Override
    public List<Picture> findAll() {
        Session session = null;
        List<Picture> pictures = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            pictures = session.createQuery("FROM Picture ").getResultList();
        }
        finally {
            if(session != null){
                session.close();
            }
        }
        return pictures;
    }

    @Override
    public void save(Picture picture) {
        Session session = null;
        Transaction transaction = null;
       try {
           session = ConnectionUtil.sessionFactory.openSession();
           transaction =session.beginTransaction();
           session.save(picture);

           transaction.commit();
       }
       catch (Exception e){
           e.printStackTrace();
           if(transaction != null){
               transaction.rollback();
           }
       } finally {
           if(session != null) {
               session.close();
           }
       }
    }

    @Override
    public Picture findById(int id) {
        return null;
    }

    @Override
    public void update(Picture picture) {

    }

    @Override
    public void remove(int id) {

    }
}
