package edu.dosw.parcial.mapper;

import edu.eci.dosw.oficioya.entity.Disponibilidad;
import edu.eci.dosw.oficioya.model.DisponibilidadesModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DisponibilidadMapper {

    DisponibilidadesModel toModel(Disponibilidad entity);

    Disponibilidad toEntity(DisponibilidadesModel model);
}