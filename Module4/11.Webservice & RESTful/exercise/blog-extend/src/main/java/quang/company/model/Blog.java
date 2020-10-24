package quang.company.model;

import javax.persistence.*;

@Table
@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idBlog;

    String nameBlog;
    String blogContent;



    public Blog() {
    }

    public long getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(long idBlog) {
        this.idBlog = idBlog;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }


}
