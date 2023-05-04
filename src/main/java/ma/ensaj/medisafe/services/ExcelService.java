package ma.ensaj.medisafe.services;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import ma.ensaj.medisafe.beans.Medicaments;
import ma.ensaj.medisafe.helper.ExcelHelper;
import ma.ensaj.medisafe.repositories.MedicamentssRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ExcelService {
    @Autowired
    MedicamentssRepository repository;

    public void save(MultipartFile file) {
        try {
            List<Medicaments> tutorials = ExcelHelper.excelToTutorials(file.getInputStream());
            repository.saveAll(tutorials);
        } catch (IOException e) {
            throw new RuntimeException("fail to store excel data: " + e.getMessage());
        }
    }



    public List<Medicaments> getAllTutorials() {
        return repository.findAll();
    }
}