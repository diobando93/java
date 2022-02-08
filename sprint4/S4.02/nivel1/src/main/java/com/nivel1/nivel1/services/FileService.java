package com.nivel1.nivel1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties.Tomcat.Resource;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

import com.nivel1.nivel1.constants.FileErrors;
import com.nivel1.nivel1.exceptions.FileNotFoundException;
import com.nivel1.nivel1.exceptions.FileSaveException;
import com.nivel1.nivel1.models.FotoModel;
import com.nivel1.nivel1.repositories.FileRepo;

@Service
public class FileService {
	 @Autowired
	  FileRepo fileRepo;

	    public FotoModel saveFile(MultipartFile file) {
	    	
	        String filename = StringUtils.cleanPath(file.getOriginalFilename());
	        

	        try {

	            if (filename.contains("...")) {
	                throw new FileSaveException(FileErrors.INVALID_FILE + filename);
	            }

	            FotoModel model = new FotoModel(filename, file.getContentType(), file.getBytes());
	            return fileRepo.save(model);

	        } catch (Exception e) {

	            throw new FileSaveException(FileErrors.FILE_NOT_STORED, e);
	        }

	    }
	    
	    public FotoModel getFile(String fileId) {

	        return fileRepo.findById(fileId).orElseThrow(() -> new FileNotFoundException(FileErrors.FILE_NOT_FOUND + fileId));
	    }

	    

}
