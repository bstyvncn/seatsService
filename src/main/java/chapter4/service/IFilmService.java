package chapter4.service;

import chapter4.model.film;

import java.util.List;
public interface IFilmService {
    void newFilm(film film);
    List<film> showFilm();

    void deleteFilm(film film);
    void updateFilm(String from, String to);
}

//    1. Menambahkan film baru
//            2. Mengupdate nama file
//            3. Menghapus film
//            4. Menampilkan film yang sedang tayang

