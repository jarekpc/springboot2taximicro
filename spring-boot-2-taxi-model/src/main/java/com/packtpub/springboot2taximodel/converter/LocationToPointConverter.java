package com.packtpub.springboot2taximodel.converter;

import com.packtpub.springboot2taximodel.dto.request.LocationDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.geo.Point;

public class LocationToPointConverter  implements Converter<LocationDTO, Point> {

    @Override
    public Point convert(LocationDTO locationDTO) {
        if (locationDTO == null) {
            return null;
        }
        return new Point(locationDTO.getLongitude(), locationDTO.getLatitude());
    }
}
