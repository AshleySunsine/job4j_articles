package ru.job4j.articles.service.generator;

import ru.job4j.articles.model.Word;

import java.lang.ref.SoftReference;
import java.util.List;

public interface ArticleGenerator {
    SoftReference generate(List<Word> words);
}
