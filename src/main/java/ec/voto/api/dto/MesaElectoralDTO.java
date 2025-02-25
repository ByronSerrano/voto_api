package ec.voto.api.dto;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
@ToString
public class MesaElectoralDTO {

    private Long id;

    private Timestamp fecha;

    private boolean firmaAsistencia;

    private GradoDTO grado;

}
