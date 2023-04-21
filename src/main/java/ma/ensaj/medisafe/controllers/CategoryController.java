package ma.ensaj.medisafe.controllers;

import ma.ensaj.medisafe.beans.Category;
import ma.ensaj.medisafe.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Category")
@CrossOrigin
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getAllCategorys() {
        return categoryService.findAll();
    }

    @PostMapping("/add")
    public Category createCategory(@RequestBody Category category) {
        return categoryService.create(category);
    }

    @DeleteMapping("/delete")
    public void deleteCategory(@RequestParam int id) {
        categoryService.delete(id);
    }

    @GetMapping("/get")
    public Category getCategoryById(@RequestParam int id) {
        return categoryService.findById(id);
    }

    @PostMapping("/update")
    public void updateCategory(@RequestBody Category new_Category) {
        Category category = categoryService.findById(new_Category.getId());

        categoryService.update(new_Category);
    }
}

