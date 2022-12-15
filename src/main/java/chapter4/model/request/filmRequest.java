package chapter4.model.request;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class filmRequest {
    private String namaFilm;
    private String statusTayang;
}
