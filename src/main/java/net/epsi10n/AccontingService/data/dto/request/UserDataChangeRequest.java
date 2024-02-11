package net.epsi10n.AccontingService.data.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDataChangeRequest {
    @JsonProperty("email")
    @Pattern(regexp="^(.+)@(\\S+)$")
    private String email;
    @JsonProperty("phone")
    @Pattern(regexp="[\\d]{11}")
    private String phone;
}
