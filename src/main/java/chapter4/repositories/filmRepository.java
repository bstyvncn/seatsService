package chapter4.repositories;

import chapter4.model.film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface filmRepository extends JpaRepository<film, String> {

    @Query(value = "DELETE FROM film WHERE nama_film = :namaFilm;", nativeQuery = true)
    public void deleteFilm(@Param("namaFilm") String namaFilm);

    @Query(value = "SELECT f FROM film f WHERE STATUS_TAYANG = 'Tayang'")
    public List<film> findFilmByStatusTayang();

    @Modifying
    @Procedure("change_film_name")
    public void changeFilmName(String nameFrom, String nameTo);

}
