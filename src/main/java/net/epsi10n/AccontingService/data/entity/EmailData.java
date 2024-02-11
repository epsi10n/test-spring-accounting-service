package net.epsi10n.AccontingService.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="email_data", schema="accounting")
@NoArgsConstructor
@Getter
@Setter
public class EmailData {
    @Id
    @Column(name="id", columnDefinition = "bigint")
    private Long id;
    @Column(name="user_id", columnDefinition="bigint")
    private Long userId;
    // TODO unique
    @Column(name="email", columnDefinition="varchar(200)", unique = true)
    private String email;
}
