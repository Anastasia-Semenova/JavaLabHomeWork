package ru.itis.words.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.beust.jcommander.IStringConverter;

public class UrlSplitter implements IStringConverter<List<String>>{

    @Override
    public List<String> convert(String urls) {
        return new ArrayList<>(Arrays.asList(urls.split(";")));
    }
}