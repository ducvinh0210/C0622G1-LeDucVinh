package com.codegym.repository.impl;

import com.codegym.model.DictionaryApp;
import com.codegym.repository.IDictionaryRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class DictionaryRepository implements IDictionaryRepository {
   private static List<DictionaryApp> dictionaryAppList= new ArrayList<>();
static {
    dictionaryAppList.add(new DictionaryApp("car","xe oto"));
    dictionaryAppList.add(new DictionaryApp("home", "nha"));
    dictionaryAppList.add(new DictionaryApp("apple","qua tao"));
    dictionaryAppList.add(new DictionaryApp("book","quyen sach"));

}
    @Override
    public List<DictionaryApp> getListDictionary() {
        return dictionaryAppList;
    }
}
