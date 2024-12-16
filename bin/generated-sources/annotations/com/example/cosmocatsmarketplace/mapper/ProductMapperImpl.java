package com.example.cosmocatsmarketplace.mapper;

import com.example.cosmocatsmarketplace.domain.Product;
import com.example.cosmocatsmarketplace.dto.product.ProductResponseDto;
import com.example.cosmocatsmarketplace.dto.product.ProductResponseDto.ProductResponseDtoBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-16T23:15:03+0200",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.40.0.z20241112-1021, environment: Java 17.0.13 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductResponseDto toProductResponseDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductResponseDtoBuilder productResponseDto = ProductResponseDto.builder();

        productResponseDto.category( product.getCategory() );
        productResponseDto.description( product.getDescription() );
        productResponseDto.id( product.getId() );
        productResponseDto.name( product.getName() );
        productResponseDto.price( product.getPrice() );

        return productResponseDto.build();
    }
}
