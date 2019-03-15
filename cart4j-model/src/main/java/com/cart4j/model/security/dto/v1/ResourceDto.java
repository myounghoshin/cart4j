package com.cart4j.model.security.dto.v1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResourceDto {
    private Long id;
    private String resourceUniqueId;
    private String description;
}
