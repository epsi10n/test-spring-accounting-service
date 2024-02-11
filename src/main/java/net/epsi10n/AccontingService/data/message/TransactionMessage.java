package net.epsi10n.AccontingService.data.message;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import net.epsi10n.AccontingService.data.shared.TransactionType;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class TransactionMessage {
    TransactionType type;
    Long userId;
    BigDecimal amount;
}
