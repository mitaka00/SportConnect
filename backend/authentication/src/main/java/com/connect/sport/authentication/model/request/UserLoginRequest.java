package com.connect.sport.authentication.model.request;

import com.connect.sport.authentication.model.request.base.UserAuthRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserLoginRequest extends UserAuthRequest {
}
