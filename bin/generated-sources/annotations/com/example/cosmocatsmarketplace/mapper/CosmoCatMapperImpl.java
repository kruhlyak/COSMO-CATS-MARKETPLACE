package com.example.cosmocatsmarketplace.mapper;

import com.example.cosmocatsmarketplace.domain.CosmoCat;
import com.example.cosmocatsmarketplace.domain.CosmoCat.CosmoCatBuilder;
import com.example.cosmocatsmarketplace.dto.cosmocat.CosmoCatDto;
import com.example.cosmocatsmarketplace.dto.cosmocat.CosmoCatDto.CosmoCatDtoBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-16T12:35:07+0200",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.40.0.z20241112-1021, environment: Java 17.0.13 (Eclipse Adoptium)"
)
@Component
public class CosmoCatMapperImpl implements CosmoCatMapper {

    @Override
    public CosmoCatDto toDto(CosmoCat cosmoCat) {
        if ( cosmoCat == null ) {
            return null;
        }

        CosmoCatDtoBuilder cosmoCatDto = CosmoCatDto.builder();

        cosmoCatDto.email( cosmoCat.getEmail() );
        cosmoCatDto.id( cosmoCat.getId() );
        cosmoCatDto.name( cosmoCat.getName() );

        return cosmoCatDto.build();
    }

    @Override
    public CosmoCat toDomain(CosmoCatDto cosmoCatDto) {
        if ( cosmoCatDto == null ) {
            return null;
        }

        CosmoCatBuilder cosmoCat = CosmoCat.builder();

        cosmoCat.email( cosmoCatDto.getEmail() );
        cosmoCat.id( cosmoCatDto.getId() );
        cosmoCat.name( cosmoCatDto.getName() );

        return cosmoCat.build();
    }
}
