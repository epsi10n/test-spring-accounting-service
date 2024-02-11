package net.epsi10n.AccontingService.data.entity;


import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="user", schema="accounting")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @Column(name="id", columnDefinition = "bigint")
    private Long id;
    @Column(name="name", columnDefinition = "varchar(500)")
    private String name;
    @Column(name="date_of_birth", columnDefinition = "date")
    private Date dateOfBirth;
    @Column(name="password", columnDefinition = "varchar(500)")
    private String password;
    @Column(name="initial_balance", columnDefinition="decimal(10, 2)")
    private BigDecimal initialBalance;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Account account;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private List<EmailData> emailData;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private List<PhoneData> phoneData;
}
