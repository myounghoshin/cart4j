package com.cart4j.auth.service;

import com.cart4j.model.security.dto.v1.RedirectUriDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RedirectUriService {
    Page<RedirectUriDto> getRedirectUris(Pageable pageable, String searchKey);
    RedirectUriDto getRedirectUri(Long id);
    RedirectUriDto addRedirectUri(Long clientId, RedirectUriDto redirectUri);
    RedirectUriDto editRedirectUri(Long id, RedirectUriDto redirectUri);
    void deleteRedirectUri(Long id);
}
