package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterTest {
    PosterManager manager = new PosterManager();
    Poster poster1 = new Poster("1", "Бладшот", 2020, "http1");
    Poster poster2 = new Poster("2", "Вперед", 2020, "http2");
    Poster poster3 = new Poster("3", "Отель Белград", 2020, "http3");
    Poster poster4 = new Poster("4", "Джентельмены", 2019, "http4");
    Poster poster5 = new Poster("5", "Человек-неведимка", 2020, "http5");
    Poster poster6 = new Poster("6", "Тролли.Мировой тур", 2020, "http6");
    Poster poster7 = new Poster("7", "Номер один", 2020, "http7");

    @BeforeEach
    public void Setup() {
        manager.Save(poster1);
        manager.Save(poster2);
        manager.Save(poster3);
        manager.Save(poster4);
        manager.Save(poster5);
        manager.Save(poster6);
        manager.Save(poster7);
    }

    @Test
    public void Save() {
        PosterManager poster = new PosterManager();
        poster.Save(poster1);
        poster.Save(poster2);
        poster.Save(poster3);
        Poster[] expected = {poster1, poster2, poster3};
        Poster[] actual = poster.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindAllPosters() {
        Poster[] expected = {poster1, poster2, poster3, poster4, poster5, poster6, poster7};
        Poster[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLast10() {
        Poster[] expected = {poster7, poster6, poster5, poster4, poster3, poster2, poster1};
        Poster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLast5() {
        manager = new PosterManager(5);
        manager.Save(poster1);
        manager.Save(poster2);
        manager.Save(poster3);
        manager.Save(poster4);
        manager.Save(poster5);
        manager.Save(poster6);
        manager.Save(poster7);
        Poster[] expected = {poster7,poster6,poster5,poster4,poster3};
        Poster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLast11() {
        manager = new PosterManager(11);
        manager.Save(poster1);
        manager.Save(poster2);
        manager.Save(poster3);
        manager.Save(poster4);
        manager.Save(poster5);
        manager.Save(poster6);
        manager.Save(poster7);
        Poster[] expected = {poster7, poster6, poster5, poster4, poster3, poster2, poster1};
        Poster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void Film() {
        manager = new PosterManager(11);
        manager.Save(poster1);
        manager.Save(poster2);
        manager.Save(poster3);
        manager.Save(poster4);
        manager.Save(poster5);
        manager.Save(poster6);
        Poster[] expected = {poster6, poster5, poster4, poster3, poster2, poster1};
        Poster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }

}
