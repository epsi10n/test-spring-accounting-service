package net.epsi10n.AccontingService.data.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@NoArgsConstructor
public class CreationResponse {
    @JsonProperty("reason")
    private String reason;
    @JsonProperty("code")
    private Integer code;
}
