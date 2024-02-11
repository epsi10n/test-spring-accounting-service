package net.epsi10n.AccontingService.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="phone_data", schema="accounting")
@NoArgsConstructor
@Getter
@Setter
public class PhoneData {
    @Id
    @Column(name="id", columnDefinition="bigint")
    private Long id;
    @Column(name="user_id", columnDefinition = "bigint")
    private Long userId;
    @Column(name="phone", unique = true)
    private String phone;
}
