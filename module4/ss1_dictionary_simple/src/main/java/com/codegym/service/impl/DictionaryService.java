package com.codegym.service.impl;

import com.codegym.model.DictionaryApp;
import com.codegym.repository.IDictionaryRepository;
import com.codegym.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryService implements IDictionaryService {
    @Autowired
    IDictionaryRepository dictionaryRepository;

    @Override
    public String findWord(String word) {
        List<DictionaryApp> dictionaryAppList = dictionaryRepository.getListDictionary();
        for (DictionaryApp dictionaryApp : dictionaryAppList) {
            if (dictionaryApp.getEn().equals(word)) {
                return dictionaryApp.getVie();
            }
        }
        return "not found word";
    }

}
