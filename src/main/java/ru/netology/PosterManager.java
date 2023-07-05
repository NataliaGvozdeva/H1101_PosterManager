package ru.netology;

public class PosterManager {
    private Poster[] posters = new Poster[0];
    private int maxposters;

    public PosterManager(int maxposters) {
        this.maxposters = maxposters;
    }

    public PosterManager() {
        this.maxposters = 10;
    }

    public void Save(Poster poster) {
        Poster[] tmp = new Poster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public Poster[] findAll() {
        return posters;
    }

    public Poster[] findLast() {
        int resultlenght;
        if (posters.length < maxposters) {
            resultlenght = posters.length;
        } else {
            resultlenght = maxposters;
        }
        Poster[] result = new Poster[resultlenght];
        for (int i = 0; i < result.length; i++) {
            result[i] = posters[posters.length - 1 - i];
        }
        return result;
    }
}
