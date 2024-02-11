package net.epsi10n.AccontingService.service;

import net.epsi10n.AccontingService.data.dto.TransferResult;
import net.epsi10n.AccontingService.data.dto.UpdateBalanceResult;

import java.math.BigDecimal;

/**
 *
 */
public interface AccountingService {
    /**
     *
     *
     * @param fromUserId
     * @param toUserId
     * @param amount
     * @return
     */
    TransferResult transferFunds(Long fromUserId, Long toUserId, BigDecimal amount);

    /**
     *
     *
     * @param userId
     * @param amount
     * @return
     */
    UpdateBalanceResult updateBalance(Long userId, BigDecimal amount);

    /**
     *
     */
    void checkAndUpdateBalances();
}
