package edu.dosw.parcial.mapper;

import edu.eci.dosw.oficioya.entity.Solicitud;
import edu.eci.dosw.oficioya.model.SolicitudesModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SolicitudMapper {

    SolicitudesModel toModel(Solicitud entity);

    Solicitud toEntity(SolicitudesModel model);
}