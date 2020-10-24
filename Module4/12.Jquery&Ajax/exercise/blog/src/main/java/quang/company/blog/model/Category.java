package quang.company.blog.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int idCategory;
    private String typeCategory;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    Collection<Blog> blog;

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getTypeCategory() {
        return typeCategory;
    }

    public void setTypeCategory(String typeCategory) {
        this.typeCategory = typeCategory;
    }

    public Collection<Blog> getBlog() {
        return blog;
    }

    public void setBlog(Collection<Blog> blog) {
        this.blog = blog;
    }
}
