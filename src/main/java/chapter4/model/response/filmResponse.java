package chapter4.model.response;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class filmResponse {
    private String namaFilm;
    private String statusTayang;
    public filmResponse(String namaFilm) {
        namaFilm = this.namaFilm;
    }
}
