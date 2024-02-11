package net.epsi10n.AccontingService.data.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name="account", schema="accounting")
@NoArgsConstructor
@Getter
@Setter
public class Account {
    @Id
    @Column(name="id", columnDefinition="bigint")
    private Long id;
    @Column(name="user_id", columnDefinition="bigint")
    private Long userId;
    @Column(name="balance", columnDefinition="decimal(10, 2)")
    private BigDecimal balance;
}
