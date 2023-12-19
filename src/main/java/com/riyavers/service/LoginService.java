package com.riyavers.service;

import com.riyavers.dto.login.LoginRequestDto;
import com.riyavers.dto.login.LoginResponceDto;

public interface LoginService {

	public LoginResponceDto login( LoginRequestDto dto );
}
