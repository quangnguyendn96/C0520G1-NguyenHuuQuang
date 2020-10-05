package quang.company.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import quang.company.model.Blog;
import quang.company.service.BlogService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BlogController {
    @Autowired
    private BlogService blogService;


    @GetMapping
    public ResponseEntity<List<Blog>> showAll() {
        List<Blog> list = blogService.findAll();
        if (list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity add(@RequestBody Blog blog) {
        blogService.save(blog);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("find/{id}")
    public ResponseEntity findById(@PathVariable long id) {
        Blog blog = blogService.findById(id);
        if (blog == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity edit(@PathVariable long id, @RequestBody Blog blog) {
        Blog blog1 = blogService.findById(id);
        if (blog1 == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        blog1.setNameBlog(blog.getNameBlog());
        blog1.setNameBlog(blog.getBlogContent());
        blogService.save(blog1);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity delete(@PathVariable long id) {
        blogService.delete(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }
}

