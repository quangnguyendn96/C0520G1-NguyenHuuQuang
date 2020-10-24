package quang.company.blog.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Table
@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idBlog;
    @NotEmpty
    String nameBlog;

    String blogContent;

    @ManyToOne()
    @JoinColumn(name = "idCategory")
    Category category;


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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
