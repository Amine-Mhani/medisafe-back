package ma.ensaj.medisafe.services;

import ma.ensaj.medisafe.beans.Category;
import ma.ensaj.medisafe.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(int id) {
        return categoryRepository.findById(id).get();
    }

    public Category create(Category category) {
        return categoryRepository.save(category);
    }

    public void update(Category category) {
        categoryRepository.save(category);
    }

    public void delete(int id) {
        categoryRepository.delete(categoryRepository.findById(id).get());
    }
}

